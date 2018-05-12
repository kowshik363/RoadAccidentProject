/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class Suggested_Preventive_Methods extends javax.swing.JFrame {

    /**
     * Creates new form Suggested_Preventive_Methods
     */
    public Suggested_Preventive_Methods() {
        initComponents();
        
        int i,m;
       double f[]= new double[100];
       Arrays.fill(f, 0.0);
       Calendar now = Calendar.getInstance();  
       double factor[]=new double[4000];
       double val=1.0;
       int start_year=2007;
       int current_year = now.get(Calendar.YEAR);
         //System.out.println(""+current_year);
         
    try{
      
       for(i=(current_year-1);i>=start_year;i--)
       {
            if((current_year-start_year)==199)
            {
            factor[i]=0.05;
            }
            else
            {
            factor[i]=val;        
            }
            val=val-0.05;
       }
       
       
       String url="jdbc:mysql://localhost:3306/road_accident"; 
       String user="root";
       String pass="";
       
       
       Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
       DefaultTableModel model=(DefaultTableModel)suggested_preventive_method_table.getModel();
       
        String query="Select count(location_id) as total from  location";
        PreparedStatement prepareStm=conn.prepareStatement(query);
        prepareStm.execute();
        ResultSet rs2=prepareStm.getResultSet();
        int no_of_locations = 0;
        while(rs2.next())
            no_of_locations = rs2.getInt("total");
            
       
       Map<String, Double> unsortMap = new HashMap<String, Double>();
       String locations[] = new String[100];
       double temp, total_factor = 0.0;
       String cur_location = "";
       for(int j = 1; j<=no_of_locations;j++ )
       {
           temp = 0.0;
            for(i=(current_year-1);i>=start_year;i--)
            {
                query="Select a.location_name,count(b.accident_no) as total_accident from location a left join accident b on a.location_id=b.location_id where b.location_id='"+j+"' and date like'"+i+"%' ";
                prepareStm=conn.prepareStatement(query);
                prepareStm.execute();
                rs2=prepareStm.getResultSet();
                m = 0;
                while(rs2.next())
                {
                    m=rs2.getInt("total_accident");
                    cur_location = rs2.getString("a.location_name");
                }
               
                temp=temp+factor[i]*m;
                //System.out.println(""+f);
            }
            locations[j] = cur_location;
            f[j] = temp;
            total_factor += f[j];
       }
      
       
       for(i = 1; i<= no_of_locations; i++)
       {
           temp = f[i]/total_factor;
           temp = temp * 100;
           
           unsortMap.put(locations[i],temp);
           
       }
       
       
       
       Map<String, Double> sortedMap = sortByValue(unsortMap);
       int index= 0;
       for (Map.Entry<String, Double> entry : sortedMap.entrySet())
       {
              if(index<5)
              {
                      String location_name = entry.getKey();
                      String sql = "Select location_name, reason.reason_name,accident.reason_id, count(accident.reason_id) from reason join accident on reason.reason_id = accident.reason_id  join location  on accident.location_id = location.location_id where location.location_name='"+ location_name +"' group by accident.reason_id order by count(accident.reason_id) desc LIMIT 1";                      
                      prepareStm=conn.prepareStatement(sql);
                      prepareStm.execute();
                      rs2=prepareStm.getResultSet();
                      while(rs2.next())
                      {
                          String name, reason, prevent;
                          int q;
                          int no_of_accidents;
                          name = rs2.getString("location_name");
                          reason = rs2.getString("reason_name");
                          q=rs2.getInt("reason_id");
                          
                          no_of_accidents = rs2.getInt("count(accident.reason_id)");
                          
                         if(q==1)
                          {
                              prevent = " ";
                          
                          }
                         
                          else if(q==2)
                          {
                             prevent =" "; 
                          }
                          
                          else if(q==3)
                          {
                              prevent=" ";
                          }
                          
                          else
                          {
                              prevent=" ";
                          }
                          
                  model.addRow(new Object[]{name,reason,no_of_accidents,prevent});
                        
                      }
                      
                index++;   
              
              }
             else
               break;
         }   
       
    
     
       
      }
      catch(SQLException|HeadlessException e)
      {
         System.out.println(e);
      }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        suggested_preventive_method_table = new javax.swing.JTable();
        b_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        suggested_preventive_method_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prone Zone Name", "Most Accidental Reason", "Number Of Accident", "Preventive Method"
            }
        ));
        jScrollPane1.setViewportView(suggested_preventive_method_table);

        b_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_bt.setText("Back");
        b_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(b_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_btActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home_Page h=new Home_Page();
        h.setVisible(true);
        
        
    }//GEN-LAST:event_b_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Suggested_Preventive_Methods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suggested_Preventive_Methods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suggested_Preventive_Methods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suggested_Preventive_Methods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suggested_Preventive_Methods().setVisible(true);
            }
        });
    }
    
     private static Map<String, Double> sortByValue(Map<String,Double > unsortMap) {

      
        LinkedList<Map.Entry<String, Double>> list;
        list = new LinkedList<Map.Entry<String, Double>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
     
     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_bt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable suggested_preventive_method_table;
    // End of variables declaration//GEN-END:variables
}
