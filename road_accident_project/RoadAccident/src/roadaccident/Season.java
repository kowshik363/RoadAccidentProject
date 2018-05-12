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


public class Season extends javax.swing.JFrame {

    /**
     * Creates new form Season
     */
    String s_str1,s_str2;
    public Season() {
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
                 String query= "select * from season";
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
                   String s_name=rs1.getString("season_name");
                   s_com1.addItem(s_name);
                   s_com2.addItem(s_name);
                   
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
        s_back_bt = new javax.swing.JButton();
        s_main_bt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        s_bt1 = new javax.swing.JButton();
        s_tx1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s_tx2 = new javax.swing.JTextField();
        s_bt2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        s_bt3 = new javax.swing.JButton();
        s_com1 = new javax.swing.JComboBox();
        s_bt4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        s_com2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        s_bt5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        s_tx3 = new javax.swing.JTextField();
        s_bt6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Table Name : Season ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("For Information Storing");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("For Information Removing");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("For Information Updating");

        s_back_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_back_bt.setText("Back");
        s_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_back_btActionPerformed(evt);
            }
        });

        s_main_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_main_bt.setText("Back To Main Page");
        s_main_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_main_btActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        s_bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt1.setText("Store");
        s_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Season Id ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Season Name");

        s_bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt2.setText("View Database Table");
        s_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(s_bt1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(s_bt2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(s_tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(s_tx2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(s_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(s_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_bt1)
                    .addComponent(s_bt2))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Select Season Name");

        s_bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt3.setText("Remove");
        s_bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt3ActionPerformed(evt);
            }
        });

        s_com1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Season Name" }));

        s_bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt4.setText("View Database Table");
        s_bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(s_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s_bt4))
                    .addComponent(s_com1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s_com1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_bt3)
                    .addComponent(s_bt4))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        s_com2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Season Name" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Enter New Name");

        s_bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt5.setText("Update");
        s_bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Select Season Name");

        s_bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_bt6.setText("View Database Table");
        s_bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_bt6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(s_tx3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s_com2, javax.swing.GroupLayout.Alignment.LEADING, 0, 241, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(s_bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s_bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(s_com2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(s_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_bt5)
                    .addComponent(s_bt6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s_back_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(s_main_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_back_bt)
                            .addComponent(s_main_bt))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt1ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
         s_str1=s_tx1.getText();
        s_str2=s_tx2.getText();
        try{
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query="insert into season(season_id,season_name)"+"values('"+s_str1+"','"+s_str2+"')";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        
        s_tx1.setText("");
         s_tx2.setText("");
         conn.close();
        
        
        
        
        }
        catch(SQLException|HeadlessException e)
        {
        
        System.out.println(""+e);
        }
        
    
    }//GEN-LAST:event_s_bt1ActionPerformed

    private void s_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Season_Table s=new Season_Table();
        s.setVisible(true);
    }//GEN-LAST:event_s_bt2ActionPerformed

    private void s_bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt5ActionPerformed
        // TODO add your handling code here:
         String s_str3,s_str4;
        s_str3=s_tx3.getText();
        s_str4=s_com2.getSelectedItem().toString();
        try{
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query="update season set season_name='"+s_str3+"' where season_name='"+s_str4+"'";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        
        s_tx3.setText("");
        s_com2.setSelectedIndex(0);
        
        }
        
        catch(SQLException|HeadlessException e)
        {
        System.out.println(e);
        
        }
    }//GEN-LAST:event_s_bt5ActionPerformed

    private void s_bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt4ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Season_Table s=new Season_Table();
        s.setVisible(true);
    }//GEN-LAST:event_s_bt4ActionPerformed

    private void s_bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt6ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Season_Table s=new Season_Table();
        s.setVisible(true);
    }//GEN-LAST:event_s_bt6ActionPerformed

    private void s_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_back_btActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Admin1 a=new Admin1();
        a.setVisible(true);
    }//GEN-LAST:event_s_back_btActionPerformed

    private void s_main_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_main_btActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login l=new Login();
        l.setVisible(true);
               
    }//GEN-LAST:event_s_main_btActionPerformed

    private void s_bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_bt3ActionPerformed
        // TODO add your handling code here:
        
        int d=JOptionPane.showConfirmDialog(null, "Do You Really Want To Remove This Item ","Remove",JOptionPane.YES_NO_OPTION);
        
        if(d==0)
        try{
            String se_name=s_com1.getSelectedItem().toString();
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String password="";
        Connection conn=(Connection)DriverManager.getConnection(url, user, password);
        String query=" delete from season where season_name='"+se_name+"' ";
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        s_com1.setSelectedIndex(0);
        conn.close();
        
        
        }
        catch(SQLException|HeadlessException e)
        {
        
        System.out.println(""+e);
        }
        
    }//GEN-LAST:event_s_bt3ActionPerformed

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
            java.util.logging.Logger.getLogger(Season.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Season.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Season.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Season.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Season().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton s_back_bt;
    private javax.swing.JButton s_bt1;
    private javax.swing.JButton s_bt2;
    private javax.swing.JButton s_bt3;
    private javax.swing.JButton s_bt4;
    private javax.swing.JButton s_bt5;
    private javax.swing.JButton s_bt6;
    private javax.swing.JComboBox s_com1;
    private javax.swing.JComboBox s_com2;
    private javax.swing.JButton s_main_bt;
    private javax.swing.JTextField s_tx1;
    private javax.swing.JTextField s_tx2;
    private javax.swing.JTextField s_tx3;
    // End of variables declaration//GEN-END:variables
}