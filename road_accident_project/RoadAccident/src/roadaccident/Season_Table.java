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
import javax.swing.table.DefaultTableModel;


public class Season_Table extends javax.swing.JFrame {

    /**
     * Creates new form Season_Table
     */
    public Season_Table() {
        initComponents();
        setTitle("Table Name :Season");
        
        
          try {
            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);

            DefaultTableModel model = (DefaultTableModel) Season_Table.getModel();

            String query2 = " SELECT * from season ";

            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
            preparedStmt2.execute();
            ResultSet rs2 = preparedStmt2.getResultSet();

//  model.setRowCount(0);

            while (rs2.next()) {
                //System.out.println(rs2.getString("book_name"));
                model.addRow(new Object[]{rs2.getInt("season_id"),rs2.getString("season_name")});

            }
            conn.close();
        } catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);

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
        Season_Table = new javax.swing.JTable();
        st_bt1 = new javax.swing.JButton();
        st_bt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Season_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "season_id", "season_name"
            }
        ));
        jScrollPane1.setViewportView(Season_Table);

        st_bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_bt1.setText("Back");
        st_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_bt1ActionPerformed(evt);
            }
        });

        st_bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_bt2.setText("Back To Main Page");
        st_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(st_bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(st_bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(st_bt1)
                        .addGap(31, 31, 31)
                        .addComponent(st_bt2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void st_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_bt1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Season s=new Season();
        s.setVisible(true);
    }//GEN-LAST:event_st_bt1ActionPerformed

    private void st_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_bt2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_st_bt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Season_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Season_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Season_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Season_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Season_Table().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Season_Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton st_bt1;
    private javax.swing.JButton st_bt2;
    // End of variables declaration//GEN-END:variables
}
