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
import javax.swing.JOptionPane;


public class Day_Time extends javax.swing.JFrame {

    /**
     * Creates new form Day_Time
     */
    public Day_Time() {
        initComponents();
        Fillcombo();
    }
    
    
     private void Fillcombo()
{
    try
    {
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String pass="";
      Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
                 String query= "select * from day_time";
                 PreparedStatement preparedStmt = conn.prepareStatement(query);
                 preparedStmt.execute();
                 ResultSet rs1 = preparedStmt.getResultSet();
                 
                /* String query2= " select * from book ";
                 PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                 preparedStmt2.execute();
                 ResultSet rs2 = preparedStmt2.getResultSet();
                 
                 String query3= " select * from type ";
                 PreparedStatement preparedStmt3 = conn.prepareStatement(query3);
                 preparedStmt3.execute();
                 ResultSet rs3 = preparedStmt3.getResultSet();
                 
                 String query4= " select * from author ";
                 PreparedStatement preparedStmt4 = conn.prepareStatement(query4);
                 preparedStmt4.execute();
                 ResultSet rs4 = preparedStmt4.getResultSet();
                 */
                 
                      while(rs1.next())
                      {
                   String dt_name=rs1.getString("time");
                   dt_com1.addItem(dt_name);
                   dt_com2.addItem(dt_name);
                   
                      }
                    
                      /*
                       while(rs2.next())
                      {
                  String b_id=rs2.getString("book_name");
                 //int id =Integer.parseInt(b_name);
                   com_bid.addItem(b_id);
                      
                      }
                       
                        while(rs3.next())
                      {
                  String t_id=rs3.getString("type_name");
                 //int id =Integer.parseInt(b_name);
                   com_tid.addItem(t_id);
                      
                      } 
                        
                         while(rs4.next())
                      {
                  String a_id=rs4.getString("author_name");
                 //int id =Integer.parseInt(b_name);
                   com_aid.addItem(a_id);
                      
                      }
                    */
                   conn.close();
    }
    catch(SQLException | HeadlessException e)
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dt_bt7 = new javax.swing.JButton();
        dt_bt8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dt_tx2 = new javax.swing.JTextField();
        dt_bt1 = new javax.swing.JButton();
        dt_bt2 = new javax.swing.JButton();
        dt_tx1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dt_bt4 = new javax.swing.JButton();
        dt_com1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dt_bt3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dt_bt5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dt_tx3 = new javax.swing.JTextField();
        dt_bt6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dt_com2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Table Name : Day Time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("For Information Storing");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("For Information Removing");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("For Information Updating");

        dt_bt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt7.setText("BACK");
        dt_bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt7ActionPerformed(evt);
            }
        });

        dt_bt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt8.setText("BACK TO MAIN PAGE");
        dt_bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt8ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Time Id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time");

        dt_bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt1.setText("STORE");
        dt_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt1ActionPerformed(evt);
            }
        });

        dt_bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt2.setText("VIEW DATABASE TABLE");
        dt_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt2ActionPerformed(evt);
            }
        });

        dt_tx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_tx1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dt_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dt_bt2)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt_tx2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt_tx1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dt_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_bt1)
                    .addComponent(dt_bt2))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        dt_bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt4.setText("VIEW DATABASE TABLE");
        dt_bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt4ActionPerformed(evt);
            }
        });

        dt_com1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Time" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Select Day Time");

        dt_bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt3.setText("REMOVE");
        dt_bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(dt_com1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(dt_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dt_bt4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_com1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_bt3)
                    .addComponent(dt_bt4))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        dt_bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt5.setText("UPDATE");
        dt_bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Select Day Time");

        dt_bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_bt6.setText("VIEW DATABASE TABLE");
        dt_bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_bt6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Enter New Day Time");

        dt_com2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Time" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt_com2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(dt_bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_bt6)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dt_com2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dt_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_bt5)
                    .addComponent(dt_bt6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dt_bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(dt_bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_bt7)
                    .addComponent(dt_bt8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dt_tx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_tx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dt_tx1ActionPerformed

    private void dt_bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt8ActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_dt_bt8ActionPerformed

    private void dt_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt1ActionPerformed
        // TODO add your handling code here:
        String dt_str1,dt_str2;
          dt_str1=dt_tx1.getText();
         dt_str2=dt_tx2.getText();
         
        try{
            
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query="insert into day_time(time_id,time)"+"values('"+dt_str1+"','"+dt_str2+"')";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        
         dt_tx1.setText("");
         dt_tx2.setText("");
         
         conn.close();
        
        
        
        
        }
        catch(SQLException|HeadlessException e)
        {
        
        System.out.println(""+e);
        }
        
    }//GEN-LAST:event_dt_bt1ActionPerformed

    private void dt_bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt3ActionPerformed
        // TODO add your handling code here:
        
        
        int d=JOptionPane.showConfirmDialog(null, "Do You Really Want To Remove This Item ","Remove",JOptionPane.YES_NO_OPTION);
        
        if(d==0)
        try{
            
        String dt_name=dt_com1.getSelectedItem().toString();
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query=" delete from day_time where time='"+dt_name+"' ";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        dt_com1.setSelectedIndex(0);
        conn.close();
        
        
        }
        catch(SQLException|HeadlessException e)
        {
        
        System.out.println(""+e);
        }
    }//GEN-LAST:event_dt_bt3ActionPerformed

    private void dt_bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt5ActionPerformed
        // TODO add your handling code here:
        
         String dt_str3,dt_str4;
        dt_str3=dt_tx3.getText();
        dt_str4=dt_com2.getSelectedItem().toString();
        
        try{
            
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query="update day_time set time='"+dt_str3+"' where time='"+dt_str4+"'";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        
        dt_tx3.setText("");
        dt_com2.setSelectedIndex(0);
        
        }
        
        catch(SQLException|HeadlessException e)
        {
        System.out.println(e);
        
        }
        
    }//GEN-LAST:event_dt_bt5ActionPerformed

    private void dt_bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Day_Time_Table dt=new Day_Time_Table();
        dt.setVisible(true);
        
    }//GEN-LAST:event_dt_bt4ActionPerformed

    private void dt_bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt6ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Day_Time_Table dt=new Day_Time_Table();
        dt.setVisible(true);
    }//GEN-LAST:event_dt_bt6ActionPerformed

    private void dt_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Day_Time_Table dt=new Day_Time_Table();
        dt.setVisible(true);
    }//GEN-LAST:event_dt_bt2ActionPerformed

    private void dt_bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_bt7ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Admin1 a=new Admin1();
        a.setVisible(true);
    }//GEN-LAST:event_dt_bt7ActionPerformed

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
            java.util.logging.Logger.getLogger(Day_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day_Time().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dt_bt1;
    private javax.swing.JButton dt_bt2;
    private javax.swing.JButton dt_bt3;
    private javax.swing.JButton dt_bt4;
    private javax.swing.JButton dt_bt5;
    private javax.swing.JButton dt_bt6;
    private javax.swing.JButton dt_bt7;
    private javax.swing.JButton dt_bt8;
    private javax.swing.JComboBox dt_com1;
    private javax.swing.JComboBox dt_com2;
    private javax.swing.JTextField dt_tx1;
    private javax.swing.JTextField dt_tx2;
    private javax.swing.JTextField dt_tx3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}