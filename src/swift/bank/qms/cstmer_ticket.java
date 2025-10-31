package swift.bank.qms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cstmer_ticket extends javax.swing.JFrame {

    public cstmer_ticket() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel1.requestFocus();
        getDateandTime();
        jLabel11.setText(SwiftBankQMS.getSelected_transaction());
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                type = "DP";
                break;
            case "CASH WITHDRAWAL":
                type = "CW";
                break;
            case "PAY BILLS":
                type = "PB";
                break;
            case "ENCASH CHECK":
                type = "EC";
                break;
            case "RENEW MEMBERSHIP":
                type = "RM";
                break;
            case "ACCOUNT OPENING":
                type = "AO";
                break;
        }
        generateTransactionNumber();
        jLabel2.setText(SwiftBankQMS.getTransaction_number());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        no = new javax.swing.JButton();
        yes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Your number is:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 130)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0000");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("<html>\n<body>\n    <p>Please be seated.</p>\n    <p>You will be served shortly.</p>\n    <p>  \n       \n    </p>\n    <p>Thank you.</p>\n</body>\n</html>\n");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("24/10/2023 12:03:23 AM");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Transaction Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel5))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 560, 720));

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
        jLabel7.setText("<html>\n<body>\n    <p>Processing done.<br>You are currently in line.</p>\n</body>\n</html>");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 54, 129));
        jLabel8.setText("Do you want to perform");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 54, 129));
        jLabel9.setText("another transaction?");

        no.setBackground(new java.awt.Color(255, 51, 51));
        no.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        no.setText("NO");
        no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 10, true));
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no(evt);
            }
        });

        yes.setBackground(new java.awt.Color(51, 255, 51));
        yes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        yes.setText("YES");
        yes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 10, true));
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(721, 721, 721)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1550, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private void generateTransactionNumber() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String currentDate = sdf.format(new Date());

        String tme = "HH:mm:ss a";
        SimpleDateFormat timeFormat = new SimpleDateFormat(tme);
        String time = timeFormat.format(new Date());
        String id = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");

            switch (SwiftBankQMS.getSelected_transaction()) {
                case "DEPOSIT":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE deposit=?");
                    break;
                case "CASH WITHDRAWAL":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE withdrawal=?");
                    break;
                case "PAY BILLS":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE paybills=?");
                    break;
                case "ENCASH CHECK":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE encash=?");
                    break;
                case "RENEW MEMBERSHIP":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE renew=?");
                    break;
                case "ACCOUNT OPENING":
                    pst = con.prepareStatement("SELECT * FROM swift_date WHERE opening=?");
                    break;
            }
            pst.setString(1, currentDate);

            try (ResultSet rs = pst.executeQuery()) {  // THE TRANSACTION ALREADY HAS AN ONGOING QUEUE
                if (rs.next()) {
                    switch (SwiftBankQMS.getSelected_transaction()) {
                        case "DEPOSIT":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_deposit WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                        case "CASH WITHDRAWAL":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_withdraw WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                        case "PAY BILLS":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_paybills WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                        case "ENCASH CHECK":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_encash WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                        case "RENEW MEMBERSHIP":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_renew WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                        case "ACCOUNT OPENING":
                            pst = con.prepareStatement("SELECT transnum FROM hstry_opening WHERE type=? ORDER BY transnum DESC LIMIT 1");
                            break;
                    }
                    pst.setString(1, type);

                    try (ResultSet rsMainQueue = pst.executeQuery()) {
                        if (rsMainQueue.next()) {
                            // Increment the highest transaction number for that transaction type by 1
                            String transnumString = rsMainQueue.getString("transnum");
                            int highestTransnum = Integer.parseInt(transnumString.replaceAll("[\\D]", ""));
                            int newTransnum = highestTransnum + 1;

                            id = type + "-" + currentDate + "-" + String.format("%04d", newTransnum);
                            pst = con.prepareStatement("INSERT INTO swift_mainqueue(type, ID, transnum, time, status) VALUES (?, ?, ?, ?, ?)");
                            pst.setString(1, type);
                            pst.setString(2, id);
                            pst.setString(3, type + "-" + String.format("%04d", newTransnum));
                            pst.setString(4, time);
                            pst.setString(5, "Pending");
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Record inserted");
                            SwiftBankQMS.setTransaction_number(type + "-" + String.format("%04d", newTransnum));
                        }
                    }
                } else {
                    // THE TRANSACTION TYPE HAS NO RECORD OF AN ONGOING QUEUE FOR THE CURRENT DAY
                    switch (SwiftBankQMS.getSelected_transaction()) {
                        // Save the date now to indicate that we're starting a new day
                        // Reset the queue to 1 for that transaction
                        case "DEPOSIT":
                            pst = con.prepareStatement("INSERT INTO swift_date(deposit) VALUES (?)");
                            break;
                        case "CASH WITHDRAWAL":
                            pst = con.prepareStatement("INSERT INTO swift_date(withdrawal) VALUES (?)");
                            break;
                        case "PAY BILLS":
                            pst = con.prepareStatement("INSERT INTO swift_date(paybills) VALUES (?)");
                            break;
                        case "ENCASH CHECK":
                            pst = con.prepareStatement("INSERT INTO swift_date(encash) VALUES (?)");
                            break;
                        case "RENEW MEMBERSHIP":
                            pst = con.prepareStatement("INSERT INTO swift_date(renew) VALUES (?)");
                            break;
                        case "ACCOUNT OPENING":
                            pst = con.prepareStatement("INSERT INTO swift_date(opening) VALUES (?)");
                            break;
                    }
                    pst.setString(1, currentDate);
                    pst.executeUpdate();

                    id = type + "-" + currentDate + "-0001";
                    pst = con.prepareStatement("INSERT INTO swift_mainqueue(type, ID, transnum, time, status) VALUES (?, ?, ?, ?, ?)");
                    pst.setString(1, type);
                    pst.setString(2, type + "-" + currentDate + "-0001");
                    pst.setString(3, type + "-0001");
                    pst.setString(4, time);
                    pst.setString(5, "Pending");
                    pst.executeUpdate();
                    SwiftBankQMS.setTransaction_number(type + "-0001");
                    JOptionPane.showMessageDialog(this, "Record inserted");
                }

                // FOR HISTORY RECORD
                switch (SwiftBankQMS.getSelected_transaction()) {
                    case "DEPOSIT":
                        pst = con.prepareStatement("INSERT INTO hstry_deposit(ID, acctname, dpstreference, checknum, amount, status, type, transnum) VALUES (?,?,?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_accNum());
                        pst.setString(3, SwiftBankQMS.getTemp_depRef());
                        pst.setString(4, SwiftBankQMS.getTemp_checkN());
                        pst.setString(5, SwiftBankQMS.getTemp_amount());
                        pst.setString(6, "Pending");
                        pst.setString(7, type);
                        pst.setString(8, SwiftBankQMS.getTransaction_number());
                        break;
                    case "CASH WITHDRAWAL":
                        pst = con.prepareStatement("INSERT INTO hstry_withdraw(ID, acctnum, amount, status, type, transnum) VALUES (?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_accNum());
                        pst.setString(3, SwiftBankQMS.getTemp_amount());
                        pst.setString(4, "Pending");
                        pst.setString(5, type);
                        pst.setString(6, SwiftBankQMS.getTransaction_number());
                        break;
                    case "PAY BILLS":
                        pst = con.prepareStatement("INSERT INTO hstry_paybills(ID, biller, subacctname, subacctnum, checknum, amount, status, type, transnum) VALUES (?,?,?,?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_biller());
                        pst.setString(3, SwiftBankQMS.getTemp_accName());
                        pst.setString(4, SwiftBankQMS.getTemp_accNum());
                        pst.setString(5, SwiftBankQMS.getTemp_checkN());
                        pst.setString(6, SwiftBankQMS.getTemp_amount());
                        pst.setString(7, "Pending");
                        pst.setString(8, type);
                        pst.setString(9, SwiftBankQMS.getTransaction_number());
                        break;
                    case "ENCASH CHECK":
                        pst = con.prepareStatement("INSERT INTO hstry_encash(ID, acctnum, checknum, amount, status, type, transnum) VALUES (?,?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_accNum());
                        pst.setString(3, SwiftBankQMS.getTemp_checkN());
                        pst.setString(4, SwiftBankQMS.getTemp_amount());
                        pst.setString(5, "Pending");
                        pst.setString(6, type);
                        pst.setString(7, SwiftBankQMS.getTransaction_number());
                        break;
                    case "RENEW MEMBERSHIP":
                        pst = con.prepareStatement("INSERT INTO hstry_renew(ID, acctnum, acctname, expiration, status, type, transnum) VALUES (?,?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_accNum());
                        pst.setString(3, SwiftBankQMS.getTemp_accName());
                        pst.setString(4, SwiftBankQMS.getTemp_expDte());
                        pst.setString(5, "Pending");
                        pst.setString(6, type);
                        pst.setString(7, SwiftBankQMS.getTransaction_number());
                        break;
                    case "ACCOUNT OPENING":
                        pst = con.prepareStatement("INSERT INTO hstry_opening(ID, acctnum, acctname, status, type, transnum) VALUES (?,?,?,?,?,?)");
                        pst.setString(1, id);
                        pst.setString(2, SwiftBankQMS.getTemp_accNum());
                        pst.setString(3, SwiftBankQMS.getTemp_accName());
                        pst.setString(4, "Pending");
                        pst.setString(5, type);
                        pst.setString(6, SwiftBankQMS.getTransaction_number());
                        break;
                }
                pst.executeUpdate();
                cleartemp();
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void getDateandTime() {
        String pattern1 = "MM/dd/yyyy";
        String pattern2 = "HH:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern1);
        SimpleDateFormat timeFormat = new SimpleDateFormat(pattern2);

        String time = timeFormat.format(new Date());
        String date = dateFormat.format(new Date());
        jLabel6.setText(date + "   " + time);
    }

    private void no(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no
        cstmer_start next = new cstmer_start();
        next.setVisible(true);
        cstmer_ticket.this.setVisible(false);
    }//GEN-LAST:event_no

    private void yes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes
        cstmer_selection next = new cstmer_selection();
        next.setVisible(true);
        cstmer_ticket.this.setVisible(false);
    }//GEN-LAST:event_yes

    private void cleartemp() {
        // PARA ICLEAR NA UNG TEMPORARY SAVED DATANG CUSTOMER KASI NAKAGENERATE NA NG TICKET
        SwiftBankQMS.setTemp_accNum("N/A");
        SwiftBankQMS.setTemp_depRef("N/A");
        SwiftBankQMS.setTemp_checkN("N/A");
        SwiftBankQMS.setTemp_amount("N/A");
        SwiftBankQMS.setTemp_biller("N/A");
        SwiftBankQMS.setTemp_accName("N/A");
        SwiftBankQMS.setTemp_expDte("N/A");
    }

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
            java.util.logging.Logger.getLogger(cstmer_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cstmer_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cstmer_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cstmer_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cstmer_ticket().setVisible(true);
            }
        });
    }

    private String type = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton no;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
