
package roadaccident;

import java.awt.Color;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class Home_Page extends javax.swing.JFrame {

  
    public Home_Page() {
       initComponents();
       
      getContentPane().setBackground(new Color(204,204,255));
      
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
     
     
    
    
   /*  
     JTable table=new JTable(sortedMap.size(),2);
            int row=0;
      for(Map.Entry<String,Integer> entry: map.entrySet())
 {
      table.setValueAt(entry.getKey(),row,0);
      table.setValueAt(entry.getValue(),row,1);
      row++;
 }
 
 */
     
     
        

     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sta_bt = new javax.swing.JButton();
        a_p_z_b = new javax.swing.JButton();
        p_v_b = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        s_p_m_b = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        sta_bt.setBackground(new java.awt.Color(0, 204, 204));
        sta_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sta_bt.setText("Statistical Information");
        sta_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sta_btActionPerformed(evt);
            }
        });

        a_p_z_b.setBackground(new java.awt.Color(255, 153, 153));
        a_p_z_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a_p_z_b.setText(" Accident Prone Zone");
        a_p_z_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_p_z_bActionPerformed(evt);
            }
        });

        p_v_b.setBackground(new java.awt.Color(153, 255, 153));
        p_v_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p_v_b.setText("Accident Prone Vehicle");
        p_v_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_v_bActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Prone Zone  In Map");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        s_p_m_b.setBackground(new java.awt.Color(153, 153, 153));
        s_p_m_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s_p_m_b.setText("Suggested Preventive Method For Prone Zone ");
        s_p_m_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_p_m_bActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(sta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(a_p_z_b, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(p_v_b, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(s_p_m_b, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_v_b, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(a_p_z_b, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s_p_m_b, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_p_z_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_p_z_bActionPerformed
        // TODO add your handling code here:
        
  
        Accident_Prone_Zone1 ap=new Accident_Prone_Zone1();
        //ap.setVisible(true);
             //setVisible(true);
        
        
    
    
        
    }//GEN-LAST:event_a_p_z_bActionPerformed

    
     
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login l=new Login();
        l.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void sta_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_btActionPerformed
        
        
        setVisible(false);
        S_info s=new S_info();
        s.setVisible(true);
        
        
        
    }//GEN-LAST:event_sta_btActionPerformed

    private void p_v_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_v_bActionPerformed
        // TODO add your handling code here:
        
          //setVisible(false);
        Accident_Prone_Vehicle1 ap=new Accident_Prone_Vehicle1();
       // ap.setVisible(true);

       
        
        
    }//GEN-LAST:event_p_v_bActionPerformed

    private void s_p_m_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_p_m_bActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
   Suggested_Preventive_Methods spm=new Suggested_Preventive_Methods();
        spm.setVisible(true);
        
    }//GEN-LAST:event_s_p_m_bActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
       
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_p_z_b;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton p_v_b;
    private javax.swing.JButton s_p_m_b;
    private javax.swing.JButton sta_bt;
    // End of variables declaration//GEN-END:variables
}
