package railwaymanagement;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.sql.Connection;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class train extends javax.swing.JFrame {
Connection con;
Statement st;
PreparedStatement ps;
ResultSet rs;
    /**
     * Creates new form train
     */
    public train() {
        initComponents();
        try{
Class.forName("oracle.jdbc.OracleDriver");
//JOptionPane.showMessageDialog(this,"Driver Loaded!");
try {
con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EIU18RB:1521:XE",
        "system","boopathyraj");
//JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
}
catch (SQLException ex) {
Logger.getLogger(train.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}
}
catch(ClassNotFoundException ex){
Logger.getLogger(train.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TRAIN_NO = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        SOURCE = new javax.swing.JTextField();
        DEST = new javax.swing.JTextField();
        SEAT_CC = new javax.swing.JTextField();
        SEAT_SL = new javax.swing.JTextField();
        SEAT_3A = new javax.swing.JTextField();
        SEAT_2A = new javax.swing.JTextField();
        SEAT_1A = new javax.swing.JTextField();
        SUNDAY = new javax.swing.JTextField();
        MONDAY = new javax.swing.JTextField();
        TUESDAY = new javax.swing.JTextField();
        WEDNESDAY = new javax.swing.JTextField();
        THURSDAY = new javax.swing.JTextField();
        FRIDAY = new javax.swing.JTextField();
        SATURDAY = new javax.swing.JTextField();
        INSERT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        DISPLAY = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("TRAIN NO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(183, 34, 80, 21);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(183, 68, 77, 17);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("SOURCE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(183, 104, 77, 19);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("DESTINATION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(183, 140, 116, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("NO OF SEATS - CC");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(183, 176, 149, 23);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("NO OF SEATS - SL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(183, 212, 149, 19);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("NO OF SEATS - 3A");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(183, 250, 149, 21);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("NO OF SEATS - 2A");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(183, 284, 149, 17);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("NO OF SEATS - 1A");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(183, 320, 149, 17);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("SUNDAY");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(660, 90, 149, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setText("MONDAY");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(660, 120, 149, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("TUESDAY");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 150, 149, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setText("WEDNESDAY");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 180, 149, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setText("THURSDAY");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(660, 210, 149, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setText("FRIDAY");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(660, 240, 149, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setText("SATURDAY");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(660, 270, 149, 40);
        getContentPane().add(TRAIN_NO);
        TRAIN_NO.setBounds(482, 31, 120, 22);
        getContentPane().add(NAME);
        NAME.setBounds(482, 67, 120, 24);
        getContentPane().add(SOURCE);
        SOURCE.setBounds(482, 103, 120, 22);
        getContentPane().add(DEST);
        DEST.setBounds(482, 139, 120, 22);
        getContentPane().add(SEAT_CC);
        SEAT_CC.setBounds(482, 175, 120, 22);
        getContentPane().add(SEAT_SL);
        SEAT_SL.setBounds(482, 211, 120, 22);
        getContentPane().add(SEAT_3A);
        SEAT_3A.setBounds(482, 247, 120, 22);
        getContentPane().add(SEAT_2A);
        SEAT_2A.setBounds(482, 283, 120, 22);
        getContentPane().add(SEAT_1A);
        SEAT_1A.setBounds(482, 319, 120, 22);
        getContentPane().add(SUNDAY);
        SUNDAY.setBounds(960, 100, 120, 20);
        getContentPane().add(MONDAY);
        MONDAY.setBounds(960, 130, 120, 20);
        getContentPane().add(TUESDAY);
        TUESDAY.setBounds(960, 160, 120, 20);
        getContentPane().add(WEDNESDAY);
        WEDNESDAY.setBounds(960, 190, 120, 20);
        getContentPane().add(THURSDAY);
        THURSDAY.setBounds(960, 220, 120, 20);
        getContentPane().add(FRIDAY);
        FRIDAY.setBounds(960, 250, 120, 20);
        getContentPane().add(SATURDAY);
        SATURDAY.setBounds(960, 280, 120, 20);

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });
        getContentPane().add(INSERT);
        INSERT.setBounds(170, 420, 72, 23);

        jButton1.setText("<- BACK");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 20);

        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCH);
        SEARCH.setBounds(290, 420, 90, 23);

        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR);
        CLEAR.setBounds(420, 420, 72, 23);

        DISPLAY.setText("DISPLAY");
        DISPLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYActionPerformed(evt);
            }
        });
        getContentPane().add(DISPLAY);
        DISPLAY.setBounds(540, 420, 90, 23);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRAIN NO", "NAME", "SOURC", "DEST", "CC", "SL", "3A", "2A", "1A", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
            }
        ));
        tab.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tab);
        tab.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(4).setPreferredWidth(40);
            tab.getColumnModel().getColumn(5).setPreferredWidth(40);
            tab.getColumnModel().getColumn(6).setPreferredWidth(40);
            tab.getColumnModel().getColumn(7).setPreferredWidth(40);
            tab.getColumnModel().getColumn(8).setPreferredWidth(40);
            tab.getColumnModel().getColumn(9).setPreferredWidth(40);
            tab.getColumnModel().getColumn(10).setPreferredWidth(40);
            tab.getColumnModel().getColumn(11).setPreferredWidth(40);
            tab.getColumnModel().getColumn(12).setPreferredWidth(40);
            tab.getColumnModel().getColumn(13).setPreferredWidth(40);
            tab.getColumnModel().getColumn(14).setPreferredWidth(40);
            tab.getColumnModel().getColumn(15).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 540, 1540, 240);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("TRAIN");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 310, 50, 20);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwaymanagement/imgonline-com-ua-ReplaceColor-XRWrI7ThembC.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(-70, 0, 1900, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connect c1 = new connect();
        c1.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        // TODO add your handling code here:
         try{
           String sql1 = "select * from TRAIN where TRAIN_NO = '"+TRAIN_NO.getText()+"'";
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "TRAIN Already Exists");
            }
            else{
                if(TRAIN_NO.getText().equals("") || NAME.getText().equals("") ||  SOURCE.getText().equals("") || DEST.getText().equals("")  || SEAT_CC.getText().equals("") || SEAT_SL.getText().equals("") || SEAT_3A.getText().equals("") || SEAT_2A.getText().equals("") || SEAT_1A.getText().equals("") || SUNDAY.getText().equals("") || MONDAY.getText().equals("") 
                        || TUESDAY.getText().equals("") || WEDNESDAY.getText().equals("") || THURSDAY.getText().equals("") || FRIDAY.getText().equals("") || SATURDAY.getText().equals("") ){
                        JOptionPane.showMessageDialog(this,"Invalid Input!");
                }
                else{
                    try{
                        String sql ="insert into TRAIN values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        ps=con.prepareStatement(sql);
                        ps.setString(1,TRAIN_NO.getText());
                        ps.setString(2,NAME.getText());
                        ps.setString(3,SOURCE.getText());
                        ps.setString(4,DEST.getText());
                        ps.setInt(5, Integer.parseInt(SEAT_CC.getText()));
                        ps.setInt(6, Integer.parseInt(SEAT_SL.getText()));
                        ps.setInt(7, Integer.parseInt(SEAT_3A.getText()));
                        ps.setInt(8, Integer.parseInt(SEAT_2A.getText()));
                        ps.setInt(9, Integer.parseInt(SEAT_1A.getText()));
                        ps.setString(10,SUNDAY.getText());
                        ps.setString(11,MONDAY.getText());
                        ps.setString(12,TUESDAY.getText());
                        ps.setString(13,WEDNESDAY.getText());
                        ps.setString(14,THURSDAY.getText());
                        ps.setString(15,FRIDAY.getText());
                        ps.setString(16,SATURDAY.getText());
                        ps.execute();
                        JOptionPane.showMessageDialog(this,"Train Inserted");
                    }
                    catch(SQLException ex){
                        Logger.getLogger(passenger.class.getName()).log(Level.SEVERE,null, ex);
                        JOptionPane.showMessageDialog(this,ex.getMessage());
                    }
                    
                }
                
            }

        }
        catch(Exception ex){
           Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this, ex.getMessage());
 
        }
    }//GEN-LAST:event_INSERTActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from TRAIN where TRAIN_NO = '"+TRAIN_NO.getText()+"'";
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
            if(rs.next()){
                TRAIN_NO.setText(rs.getString(1));
                NAME.setText(rs.getString(2));
                SOURCE.setText(rs.getString(3));
                DEST.setText(rs.getString(4));
                SEAT_CC.setText(rs.getString(5));
                SEAT_SL.setText(rs.getString(6));
                SEAT_3A.setText(rs.getString(7));
                SEAT_2A.setText(rs.getString(8));
                SEAT_1A.setText(rs.getString(9));
                SUNDAY.setText(rs.getString(10));
                MONDAY.setText(rs.getString(11));
                TUESDAY.setText(rs.getString(12));
                WEDNESDAY.setText(rs.getString(13));
                THURSDAY.setText(rs.getString(14));
                FRIDAY.setText(rs.getString(15));
                SATURDAY.setText(rs.getString(16));
                
                //String s=rs.getString(13);
                JOptionPane.showMessageDialog(this, "Record Found!");
            }
            else
            JOptionPane.showMessageDialog(this, "Record NotFound!");
        }
        catch (SQLException ex) {
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_SEARCHActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // TODO add your handling code here:
                TRAIN_NO.setText(null);
                NAME.setText(null);
                SOURCE.setText(null);
                DEST.setText(null);
                SEAT_CC.setText(null);
                SEAT_SL.setText(null);
    }//GEN-LAST:event_CLEARActionPerformed

    private void DISPLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYActionPerformed
        // TODO add your handling code here:
        try {
            // SQL command data stored in String datatype
            String sql = "select * from TRAIN";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String gen = rs.getString(4);
                String cc = String.valueOf(rs.getString(5));
                String sl = String.valueOf(rs.getString(6));
                String ta = String.valueOf(rs.getString(7));
                String sa = String.valueOf(rs.getString(8));
                String fa = String.valueOf(rs.getString(9));
                String su = String.valueOf(rs.getString(10));
                String mo = String.valueOf(rs.getString(11));
                String tu = String.valueOf(rs.getString(12));
                String we = String.valueOf(rs.getString(13));
                String th = String.valueOf(rs.getString(14));
                String fr = String.valueOf(rs.getString(15));
                String sat = String.valueOf(rs.getString(16));

                Object[] row = { id,fname,lname,gen,cc,sl,ta,sa,fa,su,mo,tu,we,th,fr,sat};
                DefaultTableModel model = (DefaultTableModel) tab.getModel();
                model.addRow(row);
            }
        }

        catch (SQLException e) {
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DISPLAYActionPerformed

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
            java.util.logging.Logger.getLogger(train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new train().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JTextField DEST;
    private javax.swing.JButton DISPLAY;
    private javax.swing.JTextField FRIDAY;
    private javax.swing.JButton INSERT;
    private javax.swing.JTextField MONDAY;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField SATURDAY;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField SEAT_1A;
    private javax.swing.JTextField SEAT_2A;
    private javax.swing.JTextField SEAT_3A;
    private javax.swing.JTextField SEAT_CC;
    private javax.swing.JTextField SEAT_SL;
    private javax.swing.JTextField SOURCE;
    private javax.swing.JTextField SUNDAY;
    private javax.swing.JTextField THURSDAY;
    private javax.swing.JTextField TRAIN_NO;
    private javax.swing.JTextField TUESDAY;
    private javax.swing.JTextField WEDNESDAY;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
