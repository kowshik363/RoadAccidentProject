/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;


public class Accident_Prone_Vehicle extends javax.swing.JFrame {

    /**
     * Creates new form Accident_Prone_Vehicle
     */
    public Accident_Prone_Vehicle() {
        initComponents();
        
        
         int i,m,n;
       double f[]= new double[100];
      // Arrays.fill(f, 0);
       Calendar now = Calendar.getInstance();  
       
       int start_year=2007;
       int current_year = now.get(Calendar.YEAR);
         
         
    try{
      
   
       String url="jdbc:mysql://localhost:3306/road_accident"; 
       String user="root";
       String pass="";
       Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
       
       String query="Select count(type_id) as total_vehicle from vehicle_type";
       PreparedStatement prepareStm=conn.prepareStatement(query);
       prepareStm.execute();
       ResultSet rs2=prepareStm.getResultSet();
        
        
        int no_of_vehicles = 0;
        while(rs2.next())
        {
            no_of_vehicles = rs2.getInt("total_vehicle");
        }
        
        
        
       Map<String, Double> unsortMap = new HashMap<String, Double>();
   
       String vehicle[]=new String[100];
       
       double temp,total_percentage =0;
               
     
       String cur_vehicle="";
       
       for(int j = 1; j<=no_of_vehicles;j++ )
       {
           temp = 0;
            for(i=(current_year-1);i>=start_year;i--)
            {
                
                m = 0;
                n=0;
              String  query1="Select a.vehicle_name,count(b.accident_no) as total_accident,sum(b.killed) as total_killed from vehicle_type a left join accident b on a.type_id=b.type_id where b.type_id='"+j+"' and date like'"+i+"%' ";
              prepareStm=conn.prepareStatement(query1);
              prepareStm.execute();
              rs2=prepareStm.getResultSet();
               
                
                while(rs2.next())
                {
                    m=rs2.getInt("total_accident");
                
                    n=rs2.getInt("total_killed");
                        //System.out.println(""+n);
                    cur_vehicle = rs2.getString("a.vehicle_name");
                }
               
                temp=temp+m*n;
                //System.out.println(""+temp);
            }
            
              vehicle[j] = cur_vehicle;
            f[j] = temp;
            
            total_percentage += f[j];
           
       }
      
       for(i = 1; i<= no_of_vehicles; i++)
       {
           temp = (f[i]*100)/total_percentage;
           //temp = temp * 100;
           //System.out.println("   "+temp);
           
           unsortMap.put(vehicle[i],temp);
       }
       Map<String, Double> sortedMap = sortByValue(unsortMap);
       printMap(sortedMap);
       
     
       
      }
      catch(SQLException|HeadlessException e)
      {
         System.out.println(e);
      }
        
        
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
    
    public static <K, V> void printMap(Map<K, V> map) 
    
         {
            for (Map.Entry<K, V> entry : map.entrySet())
                {
                
                     System.out.println("vehicle : " + entry.getKey()
                    + " Value : " + entry.getValue());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Accident_Prone_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accident_Prone_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accident_Prone_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accident_Prone_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accident_Prone_Vehicle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}