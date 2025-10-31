package swift.bank.qms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class admin_processDone extends javax.swing.JFrame {

    public admin_processDone() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        jLabel13.setText(SwiftBankQMS.getSelected_transaction()); // Transaction Type 
        jLabel7.setText(SwiftBankQMS.getWhat()); // Is the transaction denied or done? 
        jLabel2.setText(SwiftBankQMS.getTransaction_number());

        getDateandTime();
        displayInfo();
        addToAnalytics();
        dequeue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        goBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 130)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("000");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("DATE AND TIME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Transaction Details");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Account Number:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Data");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Transaction Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(141, 141, 141))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(32, 32, 32)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel11)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 560, 710));

        jPanel1.setBackground(new java.awt.Color(2, 54, 129));
        jPanel1.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swift bank logo 3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1082, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 220));

        jPanel2.setBackground(new java.awt.Color(255, 212, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 54, 129));
        jLabel7.setText("<html> <body>     <p>Processing done.<br>");

        jPanel4.setBackground(new java.awt.Color(2, 54, 129));
        jPanel4.setForeground(new java.awt.Color(2, 54, 129));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        goBackBtn.setBackground(new java.awt.Color(51, 255, 51));
        goBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        goBackBtn.setText("GO BACK");
        goBackBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 10, true));
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtn(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(715, 715, 715)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1550, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private void getDateandTime() {
        String pattern1 = "MM/dd/yyyy";
        String pattern2 = "HH:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern1);
        SimpleDateFormat timeFormat = new SimpleDateFormat(pattern2);

        String time = timeFormat.format(new Date());
        String date = dateFormat.format(new Date());
        jLabel11.setText(date + " " + time);
    }

    private void displayInfo() { // display details on the ticket 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            switch (SwiftBankQMS.getSelected_transaction()) {
                case "DEPOSIT":
                    pst = con.prepareStatement("select ID, acctname, dpstreference, checknum, amount, status from hstry_deposit where ID=?");
                    break;
                case "CASH WITHDRAWAL":
                    pst = con.prepareStatement("select ID, acctnum, amount, status from hstry_withdraw where ID=?");
                    break;
                case "PAY BILLS":
                    pst = con.prepareStatement("select ID, biller, subacctname, subacctnum, checknum, amount, status from hstry_paybills where ID=?");
                    break;
                case "ENCASH CHECK":
                    pst = con.prepareStatement("select ID, acctnum, checknum, amount, status from hstry_encash where ID=?");
                    break;
                case "RENEW MEMBERSHIP":
                    pst = con.prepareStatement("select ID, acctnum, acctname, expiration, status from hstry_renew where ID=?");
                    break;
                case "ACCOUNT OPENING":
                    pst = con.prepareStatement("select ID, acctnum, acctname, status from hstry_opening where ID=?");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            String id = SwiftBankQMS.getId();
            pst.setString(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                if (SwiftBankQMS.getSelected_transaction().equals("PAY BILLS")) {
                    jLabel12.setText("Account Number:");
                    jLabel14.setText(rs.getString("subacctnum"));
                } else if (SwiftBankQMS.getSelected_transaction().equals("CASH WITHDRAWAL") || SwiftBankQMS.getSelected_transaction().equals("ENCASH CHECK")) {
                    jLabel12.setText("Account Number:");
                    jLabel14.setText(rs.getString("acctnum"));
                } else {
                    jLabel12.setText("Account Name:");
                    jLabel14.setText(rs.getString("acctname"));
                }
                jLabel11.setText(id + "  |  " + SwiftBankQMS.getTime());
            } else {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_processMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(admin_processMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void dequeue() { // Remove ticket from the queueboard 
        String counter = "";
        switch (SwiftBankQMS.getCounterNum()) {
            case "C1":
                counter = "Counter 1";
                break;
            case "C2":
                counter = "Counter 2";
                break;
            case "C3":
                counter = "Counter 3";
                break;
            case "C4":
                counter = "Counter 4";
                break;
            case "C5":
                counter = "Counter 5";
                break;
            case "C6":
                counter = "Counter 6";
                break;
        }

        try { // Remove ticket for that counter # and update their workload to empty
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            pst = con.prepareStatement("update swift_availability set id =?, transnum =?, time =?,"
                    + "status =? where counternum =?");

            pst.setString(1, "");
            pst.setString(2, "");
            pst.setString(3, "");
            pst.setString(4, "");
            pst.setString(5, counter);
            pst.executeUpdate();

            if (counter.equals("Counter 1")) {
                pst = con.prepareStatement("update queueboard set counter1 =? where id =?");
            } else if (counter.equals("Counter 2")) {
                pst = con.prepareStatement("update queueboard set counter2 =? where id =?");
            } else if (counter.equals("Counter 3")) {
                pst = con.prepareStatement("update queueboard set counter3 =? where id =?");
            } else if (counter.equals("Counter 4")) {
                pst = con.prepareStatement("update queueboard set counter4 =? where id =?");
            } else if (counter.equals("Counter 5")) {
                pst = con.prepareStatement("update queueboard set counter5 =? where id =?");
            } else {
                pst = con.prepareStatement("update queueboard set counter6 =? where id =?");
            }

            pst.setString(1, "");
            pst.setInt(2, 0);

            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_processMain.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }

    private void addToAnalytics() {
        try {
            int total, done, deny;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            pst = con.prepareStatement("SELECT * from swift_admins WHERE BINARY username = ? ");
            pst.setString(1, SwiftBankQMS.getCounterNum());
            rs = pst.executeQuery();

            if (rs.next()) {
                // Fetch existing values for the [counter number] analytics
                total = rs.getInt("totalqueue");
                deny = rs.getInt("denied");
                done = rs.getInt("done");

                total += 1;
                if (SwiftBankQMS.getWhat().equals("Processing Done.")) {
                    done += 1;
                } else if (SwiftBankQMS.getWhat().equals("Processing Denied.")) {
                    deny += 1;
                }

                // Update [counter number] analytics
                pst = con.prepareStatement("UPDATE swift_admins SET totalqueue=?, done=?, denied=? WHERE BINARY username=?");
                pst.setInt(1, total);
                pst.setInt(2, done);
                pst.setInt(3, deny);
                pst.setString(4, SwiftBankQMS.getCounterNum());
                pst.executeUpdate();

                // Fetch the existing values for the overall analytics
                pst = con.prepareStatement("SELECT totalqueue, done, denied FROM swift_admins WHERE BINARY username='OVERALL'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // Update the overall analytics
                    total = rs.getInt("totalqueue");
                    done = rs.getInt("done");
                    deny = rs.getInt("denied");

                    total += 1;
                    if (SwiftBankQMS.getWhat().equals("Processing Done.")) {
                        done += 1;
                    } else if (SwiftBankQMS.getWhat().equals("Processing Denied.")) {
                        deny += 1;
                    }

                    pst = con.prepareStatement("UPDATE swift_admins SET totalqueue=?, done=?, denied=? WHERE BINARY username='OVERALL'");
                    pst.setInt(1, total);
                    pst.setInt(2, done);
                    pst.setInt(3, deny);
                    pst.executeUpdate();
                }

                // Update status on history database 
                switch (SwiftBankQMS.getSelected_transaction()) {
                    case "DEPOSIT":
                        pst = con.prepareStatement("UPDATE hstry_deposit SET status=? where ID=?");
                        break;
                    case "CASH WITHDRAWAL":
                        pst = con.prepareStatement("UPDATE hstry_withdraw SET status=? where ID=?");
                        break;
                    case "PAY BILLS":
                        pst = con.prepareStatement("UPDATE hstry_paybills SET status=? where ID=?");
                        break;
                    case "ENCASH CHECK":
                        pst = con.prepareStatement("UPDATE hstry_encash SET status=? where ID=?");
                        break;
                    case "RENEW MEMBERSHIP":
                        pst = con.prepareStatement("UPDATE hstry_renew SET status=? where ID=?");
                        break;
                    case "ACCOUNT OPENING":
                        pst = con.prepareStatement("UPDATE hstry_opening SET status=? where ID=?");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                        break;
                }

                if (SwiftBankQMS.getWhat().equals("Processing Done.")) {
                    pst.setString(1, "Done");
                } else if (SwiftBankQMS.getWhat().equals("Processing Denied.")) {
                    pst.setString(1, "Denied");
                }
                pst.setString(2, SwiftBankQMS.getId());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close resources in a finally block
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void goBackBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtn
        admin_processMain next = new admin_processMain();
        next.setVisible(true);
        admin_processDone.this.setVisible(false);
    }//GEN-LAST:event_goBackBtn

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
            java.util.logging.Logger.getLogger(admin_processDone.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_processDone.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_processDone.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_processDone.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_processDone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
