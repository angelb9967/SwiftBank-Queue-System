package swift.bank.qms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

public class cstmer_infoEntry extends javax.swing.JFrame {

    public cstmer_infoEntry() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel1.requestFocus();
        cleartemp();

        jLabel1.setText("for " + SwiftBankQMS.getSelected_transaction());
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                if (SwiftBankQMS.getMethod_transaction().equals("CASH")) {
                    jLabel1.setText("for DEPOSIT [CASH]");
                    jTabbedPane1.setSelectedIndex(0);
                } else {
                    jLabel1.setText("for DEPOSIT [CHECK]");
                    jTabbedPane1.setSelectedIndex(1);
                }
                break;

            case "CASH WITHDRAWAL":
                jTabbedPane1.setSelectedIndex(2);
                break;

            case "PAY BILLS":
                if (SwiftBankQMS.getMethod_transaction().equals("CASH")) {
                    jLabel1.setText("for PAY BILLS [CASH]");
                    jTabbedPane1.setSelectedIndex(3);
                } else {
                    jLabel1.setText("for PAY BILLS [CHECK]");
                    jTabbedPane1.setSelectedIndex(4);
                }
                break;

            case "ENCASH CHECK":
                jTabbedPane1.setSelectedIndex(5);
                break;

            case "RENEW MEMBERSHIP":
                jTabbedPane1.setSelectedIndex(6);
                break;

            case "ACCOUNT OPENING":
                jTabbedPane1.setSelectedIndex(7);
                break;

            default:
                JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        depositCASH = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        depositCHECK = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        withdrawal = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField21 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        paybillsCASH = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        paybillsCHECK = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        encash = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField24 = new javax.swing.JTextField();
        renew = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        accOpening = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 54, 129));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swift bank logo 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(659, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 193, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 212, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 54, 129));
        jLabel2.setText("2 | Information Entry");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 54, 129));
        jLabel1.setText("for N/A");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 150));

        depositCASH.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Please Enter Transaction Details.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel3.setText("Pakilagay ang mga detalye ng transaksyon.");

        jComboBox1.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox1.setBorder(null);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_cash_accountnum_validation(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setText("Account Number*");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_cash_amount_validation(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel14.setText("Amount*");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setText("Deposit Reference No. (if applicable)");

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_cash_referenceno_validation(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setText("Enter Account Details:");

        javax.swing.GroupLayout depositCASHLayout = new javax.swing.GroupLayout(depositCASH);
        depositCASH.setLayout(depositCASHLayout);
        depositCASHLayout.setHorizontalGroup(
            depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositCASHLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(depositCASHLayout.createSequentialGroup()
                            .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(depositCASHLayout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(51, 51, 51)
                            .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        depositCASHLayout.setVerticalGroup(
            depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositCASHLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(14, 14, 14)
                .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositCASHLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depositCASHLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addGroup(depositCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238))
        );

        jTabbedPane1.addTab("tab1", depositCASH);

        depositCHECK.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel33.setText("Please Enter Transaction Details.");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel34.setText("Pakilagay ang mga detalye ng transaksyon.");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setText("Enter Account Details:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel36.setText("Account Number*");

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_check_accountnum_validation(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel37.setText("Deposit Reference No. (if applicable)");

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_check_referenceno_validation(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel38.setText("Amount*");

        jComboBox5.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox5.setBorder(null);

        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_check_amount_validation(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Check Number*");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setText("Enter Check Details:");

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_check_checknum_validation(evt);
            }
        });

        javax.swing.GroupLayout depositCHECKLayout = new javax.swing.GroupLayout(depositCHECK);
        depositCHECK.setLayout(depositCHECKLayout);
        depositCHECKLayout.setHorizontalGroup(
            depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositCHECKLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(depositCHECKLayout.createSequentialGroup()
                            .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(depositCHECKLayout.createSequentialGroup()
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(51, 51, 51)
                            .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        depositCHECKLayout.setVerticalGroup(
            depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositCHECKLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(14, 14, 14)
                .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositCHECKLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depositCHECKLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addGap(6, 6, 6)
                .addGroup(depositCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox5)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("tab5", depositCHECK);

        withdrawal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel16.setText("Account Number*");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setText("Enter Account Details:");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                withdrawal_accountnum_validation(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel42.setText("Amount*");

        jComboBox3.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox3.setBorder(null);

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                withdrawal_amount_validation(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel43.setText("Pakilagay ang mga detalye ng transaksyon.");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel44.setText("Please Enter Transaction Details.");

        javax.swing.GroupLayout withdrawalLayout = new javax.swing.GroupLayout(withdrawal);
        withdrawal.setLayout(withdrawalLayout);
        withdrawalLayout.setHorizontalGroup(
            withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(withdrawalLayout.createSequentialGroup()
                            .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(withdrawalLayout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(517, 517, 517))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        withdrawalLayout.setVerticalGroup(
            withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGap(6, 6, 6)
                .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", withdrawal);

        paybillsCASH.setBackground(new java.awt.Color(255, 255, 255));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_cash_accountnum_validation(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Subscriber's Account Number*");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_cash_accountname_validation(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Subscriber's Account Name*");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_cash_biller_validation(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("Enter Payment Details:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Biller*");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Amount*");

        jComboBox4.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox4.setBorder(null);

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_cash_amount_validation(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel23.setText("Pakilagay ang mga detalye ng transaksyon.");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel24.setText("Please Enter The Transaction Details.");

        javax.swing.GroupLayout paybillsCASHLayout = new javax.swing.GroupLayout(paybillsCASH);
        paybillsCASH.setLayout(paybillsCASHLayout);
        paybillsCASHLayout.setHorizontalGroup(
            paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paybillsCASHLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addGroup(paybillsCASHLayout.createSequentialGroup()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(paybillsCASHLayout.createSequentialGroup()
                            .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(paybillsCASHLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        paybillsCASHLayout.setVerticalGroup(
            paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paybillsCASHLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paybillsCASHLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paybillsCASHLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paybillsCASHLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paybillsCASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paybillsCASHLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
        );

        jTabbedPane1.addTab("tab3", paybillsCASH);

        paybillsCHECK.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setText("Please Enter The Transaction Details.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel7.setText("Pakilagay ang mga detalye ng transaksyon.");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_check_biller_validation(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Biller*");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_check_accountname_validation(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Subscriber's Account Name*");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Subscriber's Account Number*");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_check_accountnum_validation(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_check_checknum_validation(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Check Number*");

        jComboBox2.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox2.setBorder(null);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_check_amount_validation(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Amount*");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Enter Check Details:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("Enter Payment Details:");

        javax.swing.GroupLayout paybillsCHECKLayout = new javax.swing.GroupLayout(paybillsCHECK);
        paybillsCHECK.setLayout(paybillsCHECKLayout);
        paybillsCHECKLayout.setHorizontalGroup(
            paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paybillsCHECKLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paybillsCHECKLayout.createSequentialGroup()
                        .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paybillsCHECKLayout.createSequentialGroup()
                                .addGap(553, 553, 553)
                                .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(paybillsCHECKLayout.createSequentialGroup()
                        .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(paybillsCHECKLayout.createSequentialGroup()
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField8))
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(paybillsCHECKLayout.createSequentialGroup()
                                    .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(220, 220, 220)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paybillsCHECKLayout.setVerticalGroup(
            paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paybillsCHECKLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paybillsCHECKLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paybillsCHECKLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paybillsCHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", paybillsCHECK);

        encash.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel45.setText("Pakilagay ang mga detalye ng transaksyon.");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel46.setText("Please Enter The Transaction Details.");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setText("Enter Check Details:");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Account Number*");

        jTextField22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_accountnum_validation(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setText("Enter Check Details:");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("Check Number*");

        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_checknum_validation(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Amount*");

        jComboBox6.setBackground(new java.awt.Color(255, 193, 0));
        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHP", "USD" }));
        jComboBox6.setBorder(null);

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_amount_validation(evt);
            }
        });

        javax.swing.GroupLayout encashLayout = new javax.swing.GroupLayout(encash);
        encash.setLayout(encashLayout);
        encashLayout.setHorizontalGroup(
            encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encashLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(encashLayout.createSequentialGroup()
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField24))
                        .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(encashLayout.createSequentialGroup()
                            .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(220, 220, 220)))
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        encashLayout.setVerticalGroup(
            encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encashLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox6)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", encash);

        renew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel25.setText("Please Enter Transaction Details.");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel26.setText("Pakilagay ang mga detalye ng transaksyon.");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel27.setText("Account Number*");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_accountnum_validation(evt);
            }
        });

        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_accountname_validation(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel28.setText("Account Name*");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel29.setText("Expiration Date*                             [Month/Day/Year]");

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_expirationdate_validation(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("Enter Membership Details:");

        javax.swing.GroupLayout renewLayout = new javax.swing.GroupLayout(renew);
        renew.setLayout(renewLayout);
        renewLayout.setHorizontalGroup(
            renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renewLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField15)
                            .addComponent(jTextField14)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        renewLayout.setVerticalGroup(
            renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renewLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel28)
                .addGap(6, 6, 6)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", renew);

        accOpening.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guide.png"))); // NOI18N

        javax.swing.GroupLayout accOpeningLayout = new javax.swing.GroupLayout(accOpening);
        accOpening.setLayout(accOpeningLayout);
        accOpeningLayout.setHorizontalGroup(
            accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accOpeningLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel52)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        accOpeningLayout.setVerticalGroup(
            accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accOpeningLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab8", accOpening);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -41, 1170, 810));

        jLayeredPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 0, 1170, 770));

        jPanel2.setBackground(new java.awt.Color(255, 212, 28));

        nextBtn.setBackground(new java.awt.Color(51, 255, 51));
        nextBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 10, true));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtn(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 51, 51));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 10, true));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 770, 1200, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temporarySave(String accNum, String depRef, String checkN, String amt, String biller, String accName, String expD) {
        SwiftBankQMS.setTemp_accNum(accNum);
        SwiftBankQMS.setTemp_depRef(depRef);
        SwiftBankQMS.setTemp_checkN(checkN);
        SwiftBankQMS.setTemp_amount(amt);
        SwiftBankQMS.setTemp_biller(biller);
        SwiftBankQMS.setTemp_accName(accName);
        SwiftBankQMS.setTemp_expDte(expD);
    }

    private void cleartemp() {
        SwiftBankQMS.setTemp_accNum("N/A");
        SwiftBankQMS.setTemp_depRef("N/A");
        SwiftBankQMS.setTemp_checkN("N/A");
        SwiftBankQMS.setTemp_amount("N/A");
        SwiftBankQMS.setTemp_biller("N/A");
        SwiftBankQMS.setTemp_accName("N/A");
        SwiftBankQMS.setTemp_expDte("N/A");
    }

    private void cancelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn
        cstmer_selection goBack = new cstmer_selection();
        goBack.setVisible(true);
        cstmer_infoEntry.this.setVisible(false);
    }//GEN-LAST:event_cancelBtn

    private void nextBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtn
        String acctnumber = "N/A", depReference = "N/A", checkNo = "N/A", amount = "N/A", biller = "N/A", acctname = "N/A", expdate = "N/A";
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                if (SwiftBankQMS.getMethod_transaction().equals("CASH")) {
                    acctnumber = jTextField6.getText(); //acctnumber
                    depReference = jTextField16.getText(); //depositreference
                    amount = jComboBox1.getSelectedItem() + " " + jTextField7.getText(); //amount
                } else { // CHECK 
                    acctnumber = jTextField17.getText(); //acctnumber
                    depReference = jTextField18.getText(); //depositreference
                    checkNo = jTextField20.getText(); // checknumber 
                    amount = jComboBox5.getSelectedItem() + " " + jTextField19.getText(); //amount
                }

                if (amount.equals("PHP ") || amount.equals("USD ")) {
                    amount = "";
                }

                if (SwiftBankQMS.getMethod_transaction().equals("CASH") && acctnumber.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CASH") && amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else if (SwiftBankQMS.getMethod_transaction().equals("CHECK") && acctnumber.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && checkNo.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else {
                    if (depReference.isBlank()) {
                        depReference = "N/A";
                    }
                    temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                    cstmer_reviewInfo next = new cstmer_reviewInfo();
                    next.setVisible(true);
                }
                break;

            case "CASH WITHDRAWAL":
                acctnumber = jTextField9.getText(); //accountnumber
                amount = jComboBox3.getSelectedItem() + " " + jTextField21.getText(); //amount

                if (amount.equals("PHP ") || amount.equals("USD ")) {
                    amount = "";
                }

                if (acctnumber.isEmpty() || amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else {
                    temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                    cstmer_reviewInfo next = new cstmer_reviewInfo();
                    next.setVisible(true);
                }
                break;

            case "PAY BILLS":
                if (SwiftBankQMS.getMethod_transaction().equals("CASH")) {
                    biller = jTextField11.getText(); //biller 
                    acctname = jTextField10.getText(); //accountname
                    checkNo = "N/A";
                    acctnumber = jTextField5.getText(); //accountnumber
                    amount = jComboBox4.getSelectedItem() + " " + jTextField12.getText(); //amount
                } else { // CHECK 
                    biller = jTextField1.getText(); //biller
                    acctname = jTextField2.getText(); //accountname
                    acctnumber = jTextField3.getText(); //accountnumber
                    checkNo = jTextField4.getText(); //checknumber
                    amount = jComboBox2.getSelectedItem() + " " + jTextField8.getText(); //amount
                }

                if (amount.equals("PHP ") || amount.equals("USD ")) {
                    amount = "";
                }

                if (SwiftBankQMS.getMethod_transaction().equals("CASH") && biller.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CASH") && acctname.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CASH") && acctnumber.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CASH") && amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else if (SwiftBankQMS.getMethod_transaction().equals("CHECK") && biller.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && acctname.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && acctnumber.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && checkNo.isEmpty() || SwiftBankQMS.getMethod_transaction().equals("CHECK") && amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else {
                    temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                    cstmer_reviewInfo next = new cstmer_reviewInfo();
                    next.setVisible(true);
                }
                break;

            case "ENCASH CHECK":
                acctnumber = jTextField22.getText(); //accountnumber
                checkNo = jTextField23.getText(); //checknumber
                amount = jComboBox6.getSelectedItem() + " " + jTextField24.getText(); //amount

                if (amount.equals("PHP ") || amount.equals("USD ")) {
                    amount = "";
                }

                if (acctnumber.isEmpty() || checkNo.isEmpty() || amount.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else {
                    temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                    cstmer_reviewInfo next = new cstmer_reviewInfo();
                    next.setVisible(true);
                }
                break;

            case "RENEW MEMBERSHIP":
                acctnumber = jTextField13.getText(); //accountnumber 
                acctname = jTextField14.getText(); //accountname
                expdate = jTextField15.getText(); //expirationdate

                if (acctnumber.isEmpty() || acctname.isEmpty() || expdate.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must fill out all the required fields! Please check and try again.");
                } else {
                    temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                    cstmer_reviewInfo next = new cstmer_reviewInfo();
                    next.setVisible(true);
                }
                break;

            case "ACCOUNT OPENING":
                acctnumber = "N/A";
                acctname = "N/A";

                temporarySave(acctnumber, depReference, checkNo, amount, biller, acctname, expdate);
                cstmer_ticket next = new cstmer_ticket();
                next.setVisible(true);
                break;
        }
    }//GEN-LAST:event_nextBtn

    private void deposit_cash_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_cash_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField6.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField6.setEditable(true);
            } else {
                jTextField6.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField6.setEditable(true);
            } else {
                jTextField6.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_cash_accountnum_validation

    private void deposit_cash_referenceno_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_cash_referenceno_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField16.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField16.setEditable(true);
            } else {
                jTextField16.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField16.setEditable(true);
            } else {
                jTextField16.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_cash_referenceno_validation

    private void deposit_cash_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_cash_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField7.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField7.setEditable(true);
            } else {
                jTextField7.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField7.setEditable(true);
            } else {
                jTextField7.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_cash_amount_validation

    private void deposit_check_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_check_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField17.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField17.setEditable(true);
            } else {
                jTextField17.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField17.setEditable(true);
            } else {
                jTextField17.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_check_accountnum_validation

    private void deposit_check_referenceno_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_check_referenceno_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField18.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField18.setEditable(true);
            } else {
                jTextField18.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField18.setEditable(true);
            } else {
                jTextField18.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_check_referenceno_validation

    private void deposit_check_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_check_checknum_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField20.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField20.setEditable(true);
            } else {
                jTextField20.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField20.setEditable(true);
            } else {
                jTextField20.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_check_checknum_validation

    private void deposit_check_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_check_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField19.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField19.setEditable(true);
            } else {
                jTextField19.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField19.setEditable(true);
            } else {
                jTextField19.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_check_amount_validation

    private void withdrawal_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawal_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField9.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField9.setEditable(true);
            } else {
                jTextField9.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField9.setEditable(true);
            } else {
                jTextField9.setEditable(false);
            }
        }
    }//GEN-LAST:event_withdrawal_accountnum_validation

    private void withdrawal_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawal_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField21.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField21.setEditable(true);
            } else {
                jTextField21.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField21.setEditable(true);
            } else {
                jTextField21.setEditable(false);
            }
        }
    }//GEN-LAST:event_withdrawal_amount_validation

    private void paybills_cash_biller_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_cash_biller_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField11.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField11.setEditable(true);
            } else {
                jTextField11.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField11.setEditable(true);
            } else {
                jTextField11.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_cash_biller_validation

    private void paybills_cash_accountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_cash_accountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField10.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField10.setEditable(true);
            } else {
                jTextField10.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField10.setEditable(true);
            } else {
                jTextField10.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_cash_accountname_validation

    private void paybills_cash_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_cash_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField12.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField12.setEditable(true);
            } else {
                jTextField12.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField12.setEditable(true);
            } else {
                jTextField12.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_cash_amount_validation

    private void paybills_cash_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_cash_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField5.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField5.setEditable(true);
            } else {
                jTextField5.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField5.setEditable(true);
            } else {
                jTextField5.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_cash_accountnum_validation

    private void paybills_check_biller_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_check_biller_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField1.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField1.setEditable(true);
            } else {
                jTextField1.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField1.setEditable(true);
            } else {
                jTextField1.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_check_biller_validation

    private void paybills_check_accountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_check_accountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField2.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField2.setEditable(true);
            } else {
                jTextField2.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField2.setEditable(true);
            } else {
                jTextField2.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_check_accountname_validation

    private void paybills_check_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_check_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField3.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField3.setEditable(true);
            } else {
                jTextField3.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField3.setEditable(true);
            } else {
                jTextField3.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_check_accountnum_validation

    private void paybills_check_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_check_checknum_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField4.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField4.setEditable(true);
            } else {
                jTextField4.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField4.setEditable(true);
            } else {
                jTextField4.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_check_checknum_validation

    private void paybills_check_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_check_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField8.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField8.setEditable(true);
            } else {
                jTextField8.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField8.setEditable(true);
            } else {
                jTextField8.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_check_amount_validation

    private void encash_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField22.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField22.setEditable(true);
            } else {
                jTextField22.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField22.setEditable(true);
            } else {
                jTextField22.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_accountnum_validation

    private void encash_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_checknum_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField23.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField23.setEditable(true);
            } else {
                jTextField23.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField23.setEditable(true);
            } else {
                jTextField23.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_checknum_validation

    private void encash_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField24.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField24.setEditable(true);
            } else {
                jTextField24.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField24.setEditable(true);
            } else {
                jTextField24.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_amount_validation

    private void renew_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField13.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField13.setEditable(true);
            } else {
                jTextField13.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField13.setEditable(true);
            } else {
                jTextField13.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_accountnum_validation

    private void renew_accountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_accountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField14.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField14.setEditable(true);
            } else {
                jTextField14.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField14.setEditable(true);
            } else {
                jTextField14.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_accountname_validation

    private void renew_expirationdate_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_expirationdate_validation
        // Validation: Maximum characters of 10 
        String n = jTextField15.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();

        if (Character.isLetterOrDigit(c1) || c1 == '/' || c1 == '-') {
            if (l1 < 10) {
                jTextField15.setEditable(true);
            } else {
                jTextField15.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_2 || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField15.setEditable(true);
            } else {
                jTextField15.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_expirationdate_validation

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
            java.util.logging.Logger.getLogger(cstmer_infoEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cstmer_infoEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cstmer_infoEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cstmer_infoEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cstmer_infoEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accOpening;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel depositCASH;
    private javax.swing.JPanel depositCHECK;
    private javax.swing.JPanel encash;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel paybillsCASH;
    private javax.swing.JPanel paybillsCHECK;
    private javax.swing.JPanel renew;
    private javax.swing.JPanel withdrawal;
    // End of variables declaration//GEN-END:variables
}
