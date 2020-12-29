/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2.pkg2;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author devil
 */
public class Admin_books_show extends javax.swing.JFrame {

    /**
     * Creates new form Admin_books_show
     */
    public Admin_books_show() throws ClassNotFoundException, SQLException {
        initComponents();
        show_user();
    }

    public ArrayList<admin_book_class> userList() throws ClassNotFoundException, SQLException{
        ArrayList<admin_book_class> userList=new ArrayList<>();
        try{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=test;user=tamimdb;password=12369";
        Connection con=DriverManager.getConnection(url);
        String sql="Select * from books";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        admin_book_class user;
        while(rs.next()){
            
            user=new admin_book_class(rs.getString("names"),rs.getString("writer"),rs.getInt("available"),new BigInteger(Integer.valueOf(rs.getInt("b_identity")).toString()));
            userList.add(user);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return userList;
     }
    
    
    public void show_user() throws ClassNotFoundException, SQLException{
        ArrayList<admin_book_class> list=userList();
        DefaultTableModel model=(DefaultTableModel)table1.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getname();
            row[1]=list.get(i).getwriter();
            row[2]=list.get(i).getavailable();
            row[3]=list.get(i).getidentity();
            
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        available = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        writer = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        name = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        bi = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "names", "writer", "available", "b_identity"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        available.setBackground(new java.awt.Color(186, 79, 84));
        available.setForeground(new java.awt.Color(255, 255, 255));
        available.setText("available");
        available.setBorder(null);
        available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableActionPerformed(evt);
            }
        });

        writer.setBackground(new java.awt.Color(186, 79, 84));
        writer.setForeground(new java.awt.Color(255, 255, 255));
        writer.setText("writer");
        writer.setBorder(null);
        writer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writerActionPerformed(evt);
            }
        });

        name.setBackground(new java.awt.Color(186, 79, 84));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("names");
        name.setBorder(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books", "Accounts", "Borrowers" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        bi.setBackground(new java.awt.Color(186, 79, 84));
        bi.setForeground(new java.awt.Color(255, 255, 255));
        bi.setText("b_identity");
        bi.setBorder(null);

        jButton2.setBackground(new java.awt.Color(186, 79, 84));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(186, 79, 84));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addComponent(bi)
                            .addComponent(available)
                            .addComponent(jSeparator1)
                            .addComponent(writer, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(writer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(available, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int i=table1.getSelectedRow();
        TableModel model=table1.getModel();
        name.setText(model.getValueAt(i, 0).toString());
        writer.setText(model.getValueAt(i, 1).toString());
        available.setText(model.getValueAt(i, 2).toString());
        bi.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_table1MouseClicked

    private void availableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableActionPerformed

    private void writerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_writerActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false); //you can't see me!
        dispose();
        admin_After_login ob=new admin_After_login();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String selectedvalue=combo.getSelectedItem().toString();
        if(selectedvalue.equals("Books")){
            setVisible(false); //you can't see me!
            dispose();
            Admin_books_show ob = null;
            try {
                ob = new Admin_books_show();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            }
            ob.setVisible(true);
        }
        else if(selectedvalue.equals("Borrowers")){
            setVisible(false); //you can't see me!
            dispose();
            Admin_table_show ob = null;
            try {
                ob = new Admin_table_show();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            }
            ob.setVisible(true);
        }
        else if(selectedvalue.equals("Accounts")){
            setVisible(false); //you can't see me!
            dispose();
            admin_account_show ob = null;
            try {
                ob = new admin_account_show();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
            }
            ob.setVisible(true);
        }
    }//GEN-LAST:event_comboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url2="jdbc:sqlserver://localhost:1433;databaseName=test;user=tamimdb;password=12369";

            Connection con2=DriverManager.getConnection(url2);

            Statement stmt2=con2.createStatement();

            String sql2="update books set names='"+name.getText()+"',writer='"+writer.getText()+"',available='"+available.getText()+"' where b_identity="+bi.getText()+"";

            stmt2.execute(sql2);

            stmt2.close();
            JOptionPane.showMessageDialog(null,"Updated");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel dm = (DefaultTableModel)table1.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();

        try {
            show_user();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url2="jdbc:sqlserver://localhost:1433;databaseName=test;user=tamimdb;password=12369";

            Connection con2=DriverManager.getConnection(url2);

            Statement stmt2=con2.createStatement();

            String sql2="DELETE FROM books WHERE b_identity='"+bi.getText()+"'";

            stmt2.execute(sql2);

            stmt2.close();
            JOptionPane.showMessageDialog(null,"Deleted");
        }catch(ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(regester.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel dm = (DefaultTableModel)table1.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();

        try {
            show_user();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_table_show.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_books_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_books_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_books_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_books_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Admin_books_show().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_books_show.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField available;
    private javax.swing.JTextField bi;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField name;
    private javax.swing.JTable table1;
    private javax.swing.JTextField writer;
    // End of variables declaration//GEN-END:variables
}
