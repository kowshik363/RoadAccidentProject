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
import javax.swing.JFrame;


public class StorePage extends javax.swing.JFrame {
 String t_str1,t_str2,r_str1,r_str2,s_str1,s_str2,time_str1,time_str2,l_str1,l_str2,l_str3,l_str4;
    /**
     * Creates new form StorePage
     */
    public StorePage() {
        setVisible(true);
        setTitle("Information Storing Page");
        initComponents();
        
        
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        
      /*   try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    String query="insert into type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
    String query1="insert into reason(reason_id,reason_name)"+"values('"+s_str1+"','"+s_str2+"')";
    String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
    String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm=conn.prepareStatement(query);
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }*/
        
    }
   
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        t_bt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        r_tx1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        r_tx2 = new javax.swing.JTextField();
        r_bt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        s_tx1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        s_tx2 = new javax.swing.JTextField();
        s_bt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        time_tx1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        time_tx2 = new javax.swing.JTextField();
        time_bt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        l_tx1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        l_tx2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        l_bt = new javax.swing.JButton();
        l_tx3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        l_tx4 = new javax.swing.JTextField();
        next_bt = new javax.swing.JButton();
        bck_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(185, 234, 187));
        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        jLabel1.setText("                                 Information Storing Page");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("                        Vehicle Type Table");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Type_Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Type_Name");

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });

        t_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t_bt.setText("Store");
        t_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_btActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("        Accident Reason Table");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Reason_Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Reason_Name");

        r_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_bt.setText("Store");
        r_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_btActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Accident Season Table");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Season_Id");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Season_Name");

        s_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        s_bt.setText("Store");
        s_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_btActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("      Accident Time Table");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Time_Id");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Time");

        time_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time_bt.setText("Store");
        time_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_btActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Accident Lacation Table");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Location_Id");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Location_Name");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Latitude");

        l_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_bt.setText("Store");
        l_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_btActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Longitude");

        next_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next_bt.setText("Next Page");
        next_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btActionPerformed(evt);
            }
        });

        bck_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bck_bt.setText("Back");
        bck_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bck_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_tx3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_tx1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s_tx1)
                            .addComponent(time_tx1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time_bt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time_tx2)
                                    .addComponent(s_tx2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tx2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(r_tx2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bck_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(next_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l_tx2)
                                    .addComponent(l_tx4))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_bt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(r_bt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(s_bt, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(l_bt))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_bt)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(r_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r_bt))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(s_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_bt))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(time_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(time_bt)
                    .addComponent(time_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(l_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(l_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(l_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))))
                    .addComponent(l_tx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next_bt)
                    .addComponent(bck_bt))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

    private void next_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btActionPerformed

        setVisible(false);
        Accident s1=new Accident();
        s1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_next_btActionPerformed

    private void t_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_btActionPerformed
        
        t_str1=tx1.getText();
        t_str2=tx2.getText();
        try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    String query="insert into accident_type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
    //String query1="insert into reason(reason_id,reason_name)"+"values('"+s_str1+"','"+s_str2+"')";
    //String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
   // String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm=conn.prepareStatement(query);
      ResultSet rs1 = preparedStm.getResultSet();
     preparedStm.execute();
     tx1.setText("");
     tx2.setText("");
     conn.close();
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_t_btActionPerformed

    private void r_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_btActionPerformed
    
         r_str1=r_tx1.getText();
        r_str2=r_tx2.getText();
         try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    //String query="insert into accident_type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
    String query1="insert into reason(reason_id,reason_name)"+"values('"+r_str1+"','"+r_str2+"')";
    //String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
   // String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm1=conn.prepareStatement(query1);
      ResultSet rs1 = preparedStm1.getResultSet();
     preparedStm1.execute();
     r_tx1.setText("");
     r_tx2.setText("");
     conn.close();
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }// TODO add your handling code here:
    }//GEN-LAST:event_r_btActionPerformed

    private void s_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_btActionPerformed
        // TODO add your handling code here:
        
        
       s_str1=s_tx1.getText();
        s_str2=s_tx2.getText();
         try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    //String query="insert into accident_type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
    String query1="insert into season(season_id,season_name)"+"values('"+s_str1+"','"+s_str2+"')";
    //String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
   // String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm1=conn.prepareStatement(query1);
      ResultSet rs1 = preparedStm1.getResultSet();
     preparedStm1.execute();
     s_tx1.setText("");
     s_tx2.setText("");
     conn.close();
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }
    }//GEN-LAST:event_s_btActionPerformed

    private void time_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_btActionPerformed
        // TODO add your handling code here:
        time_str1=time_tx1.getText();
        time_str2=time_tx2.getText();
         try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    //String query="insert into accident_type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
    //String query1="insert into reason(reason_id,reason_name)"+"values('"+s_str1+"','"+s_str2+"')";
    String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
   // String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm1=conn.prepareStatement(query2);
      ResultSet rs1 = preparedStm1.getResultSet();
     preparedStm1.execute();
     time_tx1.setText("");
     time_tx2.setText("");
     conn.close();
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }
    }//GEN-LAST:event_time_btActionPerformed

    private void l_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_btActionPerformed
        // TODO add your handling code here:
        l_str1=l_tx1.getText();
        l_str2=l_tx2.getText();
        l_str3=l_tx3.getText();
        l_str4=l_tx4.getText();
        
        
        try
    {
    String url="jdbc:mysql://localhost:3306/road_accident";
    String user="root";
    String password="";
    Connection conn=(Connection)DriverManager.getConnection(url, user, password);
    //String query="insert into accident_type (type_id,type_name)"+"values('"+t_str1+"','"+t_str2+"') ";
   // String query1="insert into reason(reason_id,reason_name)"+"values('"+s_str1+"','"+s_str2+"')";
    //String query2="insert into time (time_id,times)"+"values('"+time_str1+"','"+time_str2+"')";
   String query3="insert into location(location_id,location_name,lat,lon)"+"values('"+l_str1+"','"+l_str2+"','"+l_str3+"','"+l_str4+"')";
    
     PreparedStatement preparedStm1=conn.prepareStatement(query3);
      ResultSet rs1 = preparedStm1.getResultSet();
     preparedStm1.execute();
     l_tx1.setText("");
     l_tx2.setText("");
      l_tx3.setText("");
     l_tx4.setText("");
     
     conn.close();
    
    
    
    }
    catch(SQLException|HeadlessException ex)
    {
    
    System.out.println(ex);
    
    }
    }//GEN-LAST:event_l_btActionPerformed

    private void bck_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bck_btActionPerformed

        setVisible(false);
        Admin a=new Admin();
        a.setVisible(true);
    }//GEN-LAST:event_bck_btActionPerformed

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
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton l_bt;
    private javax.swing.JTextField l_tx1;
    private javax.swing.JTextField l_tx2;
    private javax.swing.JTextField l_tx3;
    private javax.swing.JTextField l_tx4;
    private javax.swing.JButton next_bt;
    private javax.swing.JButton r_bt;
    private javax.swing.JTextField r_tx1;
    private javax.swing.JTextField r_tx2;
    private javax.swing.JButton s_bt;
    private javax.swing.JTextField s_tx1;
    private javax.swing.JTextField s_tx2;
    private javax.swing.JButton t_bt;
    private javax.swing.JButton time_bt;
    private javax.swing.JTextField time_tx1;
    private javax.swing.JTextField time_tx2;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    // End of variables declaration//GEN-END:variables
}
