/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railwaymanagement;

import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author Darshan
 */
public class ticket extends javax.swing.JFrame {

    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form ticket
     */
    public ticket() {
        initComponents();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
//JOptionPane.showMessageDialog(this,"Driver Loaded!");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EIU18RB:1521:XE",
                        "system", "boopathyraj");
//JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
            } catch (SQLException ex) {
                Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
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
        datech = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SOURCE = new javax.swing.JTextField();
        DEST = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TRAIN_NO = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        BOOK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        CLASS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CTICKET = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CANCEL = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("TICKET");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(54, 94, 64, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("DESTINATION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(172, 155, 120, 22);
        getContentPane().add(datech);
        datech.setBounds(340, 220, 140, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("DATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(172, 218, 88, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("SOURCE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(172, 93, 106, 22);
        getContentPane().add(SOURCE);
        SOURCE.setBounds(350, 90, 120, 25);

        DEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTActionPerformed(evt);
            }
        });
        getContentPane().add(DEST);
        DEST.setBounds(350, 150, 120, 25);

        jButton1.setText("<- BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 93, 23);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRAIN NO", "TRAIN NAME", "SOURCE", "DESTINATION"
            }
        ));
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(780, 100, 480, 148);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("PASSENGER ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(163, 392, 130, 21);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("BOOK");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(54, 392, 64, 20);

        P_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_IDActionPerformed(evt);
            }
        });
        getContentPane().add(P_ID);
        P_ID.setBounds(350, 390, 120, 24);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("TRAIN NO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(163, 446, 80, 21);
        getContentPane().add(TRAIN_NO);
        TRAIN_NO.setBounds(350, 445, 120, 24);

        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCH);
        SEARCH.setBounds(580, 160, 90, 23);

        BOOK.setText("BOOK");
        BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKActionPerformed(evt);
            }
        });
        getContentPane().add(BOOK);
        BOOK.setBounds(580, 445, 90, 23);

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TICKET NO", "TRAIN NO", "TRAIN NAME", "SOURCE", "DEST", "CLASS", "SEAT NO", "P_ID", "DATE"
            }
        ));
        tab2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tab2);
        tab2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 630, 1540, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("CLASS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(163, 502, 80, 21);

        CLASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLASSActionPerformed(evt);
            }
        });
        getContentPane().add(CLASS);
        CLASS.setBounds(350, 500, 120, 24);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("TICKET DETAILS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 600, 110, 20);
        getContentPane().add(CTICKET);
        CTICKET.setBounds(1040, 390, 120, 24);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setText("TICKET NO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(880, 392, 100, 19);

        CANCEL.setText("CANCEL");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        getContentPane().add(CANCEL);
        CANCEL.setBounds(1090, 455, 90, 23);

        jButton2.setText("CHECK STATUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(900, 455, 130, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwaymanagement/imgonline-com-ua-ReplaceColor-v6I1kLgqMx.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1710, 890);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(490, 510, 72, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connect c = new connect();
        c.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void P_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_IDActionPerformed

    private void BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKActionPerformed
        // TODO add your handling code here:
        try {
            String tname = null;
            String source = null;
            String dest = null;
            SimpleDateFormat d = new SimpleDateFormat("dd-MMM-yy");
            String date = d.format(datech.getDate());
            Random random = new Random();
            int rnum = random.nextInt(9000) + 1000;
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sa = new StringBuilder(1);
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sa.append(randomChar);
            int sn = random.nextInt(90) + 10;
            String seat = sa + String.valueOf(sn);

            String sql = "insert into TICKET values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, rnum);
            ps.setString(2, TRAIN_NO.getText());
            ps.setString(3, P_ID.getText());
            ps.setInt(4, 1);
            ps.setString(5, date);
            ps.setString(6, seat);
            ps.setString(7, CLASS.getText());
            ps.setString(8, "WL");
            ps.execute();
            String sql1 = "select * from TRAIN where Train_No='" + TRAIN_NO.getText() + "'";
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            while (rs.next()) {
                tname = rs.getString(2);
                source = rs.getString(3);
                dest = rs.getString(4);
            }
            Object[] row = {rnum, TRAIN_NO.getText(), tname, source, dest, CLASS.getText(), seat, P_ID.getText(), date};
            DefaultTableModel model = (DefaultTableModel) tab2.getModel();
            model.addRow(row);
            JOptionPane.showMessageDialog(this, "Ticket Booked!");
        } catch (SQLException ex) {
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void SEARPerformed(java.awt.event.ActionEvent evt) {
        

    }//GEN-LAST:event_BOOKActionPerformed
    
    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            String sql = "select * from TRAIN WHERE SOURCE='" + SOURCE.getText() + "'AND DEST='" + DEST.getText() + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String cl = rs.getString(1);
                String price = String.valueOf(rs.getString(2));
                String atime = rs.getString(3);
                String dtime = rs.getString(4);
                Object[] row = {cl, price, atime, dtime};
                DefaultTableModel model = (DefaultTableModel) tab.getModel();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_SEARCHActionPerformed

    private void DESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESTActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "delete from TICKET WHERE T_NO=" + CTICKET.getText();
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Ticket Cancelled!");

        } catch (SQLException ex) {
            Logger.getLogger(passenger.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_CANCELActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            int tkno = Integer.parseInt(CTICKET.getText());
            String status;
            CallableStatement cs = con.prepareCall("{call check_status(?,?)}");
            cs.setInt(1, tkno);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();
            status = cs.getString(2);
            status = "Ticket Status: " + status;
            JOptionPane.showMessageDialog(this, status);

        } catch (SQLException ex) {
            Logger.getLogger(ticket.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CLASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLASSActionPerformed

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
            java.util.logging.Logger.getLogger(ticket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOK;
    private javax.swing.JButton CANCEL;
    private javax.swing.JTextField CLASS;
    private javax.swing.JTextField CTICKET;
    private javax.swing.JTextField DEST;
    private javax.swing.JTextField P_ID;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField SOURCE;
    private javax.swing.JTextField TRAIN_NO;
    private com.toedter.calendar.JDateChooser datech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab;
    private javax.swing.JTable tab2;
    // End of variables declaration//GEN-END:variables
}
