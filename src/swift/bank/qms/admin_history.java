package swift.bank.qms;

import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class admin_history extends javax.swing.JFrame {

    public admin_history() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        upDateDataBase();

        jLabel38.setText("for " + SwiftBankQMS.getSelected_transaction());
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                jTabbedPane1.setSelectedIndex(0);
                break;
            case "CASH WITHDRAWAL":
                jTabbedPane1.setSelectedIndex(1);
                break;
            case "PAY BILLS":
                jTabbedPane1.setSelectedIndex(3);
                break;
            case "ENCASH CHECK":
                jTabbedPane1.setSelectedIndex(4);
                break;
            case "RENEW MEMBERSHIP":
                jTabbedPane1.setSelectedIndex(5);
                break;
            case "ACCOUNT OPENING":
                jTabbedPane1.setSelectedIndex(2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        deposit = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        withdrawal = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        accOpening = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jTextField33 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        paybills = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        encash = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField35 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        renew = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 212, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 54, 129));
        jLabel2.setText("| HISTORY");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(2, 54, 129));
        jLabel38.setText("for TAKING QUEUES");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 54, 129));
        jLabel1.setText("ADMIN");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swift bank logo 4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        deposit.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(2, 54, 129));
        jPanel12.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Transaction No.");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Account No.", "Deposit Ref", "Check No.", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Account No.");

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_accountnum_validation(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Deposit Ref. No.");

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_referenceno_validation(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Amount");

        jTextField22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_amount_validation(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Check No.");

        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_checknum_validation(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setText("Status");

        jTextField41.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deposit_status_validation(evt);
            }
        });

        javax.swing.GroupLayout depositLayout = new javax.swing.GroupLayout(deposit);
        deposit.setLayout(depositLayout);
        depositLayout.setHorizontalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20)
                    .addComponent(jTextField21)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        depositLayout.setVerticalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(depositLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(depositLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("tab2", deposit);

        withdrawal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(2, 54, 129));
        jPanel14.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Transaction No.");

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Account No.", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setRowHeight(30);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawal_MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Account No.");

        jTextField29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                withdrawal_accountnum_validation(evt);
            }
        });

        jTextField30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                withdrawal_amount_validation(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Amount");

        jTextField32.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                withdrawal_status_validation(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Status");

        javax.swing.GroupLayout withdrawalLayout = new javax.swing.GroupLayout(withdrawal);
        withdrawal.setLayout(withdrawalLayout);
        withdrawalLayout.setHorizontalGroup(
            withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        withdrawalLayout.setVerticalGroup(
            withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(withdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(withdrawalLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", withdrawal);

        accOpening.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(2, 54, 129));
        jPanel18.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Transaction No.");

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Acc No.", "Acc Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setRowHeight(30);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accopening_MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
            jTable8.getColumnModel().getColumn(3).setResizable(false);
        }

        jTextField33.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accopening_accountnum_validation(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Account No.");

        jTextField34.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accopening_accountname_validation(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Account Name");

        jTextField43.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accopening_status_validation(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Status");

        javax.swing.GroupLayout accOpeningLayout = new javax.swing.GroupLayout(accOpening);
        accOpening.setLayout(accOpeningLayout);
        accOpeningLayout.setHorizontalGroup(
            accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accOpeningLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        accOpeningLayout.setVerticalGroup(
            accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accOpeningLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(accOpeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accOpeningLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", accOpening);

        paybills.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(2, 54, 129));
        jPanel13.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Transaction No.");

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Biller", "Subscriber's Name", "Subscriber's No.", "Check No.", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(30);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paybills_MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Biller");

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_biller_validation(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Subscriber's Acc. Name");

        jTextField25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_subaccountname_validation(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Subscriber's Acc. No.");

        jTextField26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_subaccountnum_validation(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Amount");

        jTextField27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_amount_validation(evt);
            }
        });

        jTextField28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_checknum_validation(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Check No.");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Status");

        jTextField31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybills_status_validation(evt);
            }
        });

        javax.swing.GroupLayout paybillsLayout = new javax.swing.GroupLayout(paybills);
        paybills.setLayout(paybillsLayout);
        paybillsLayout.setHorizontalGroup(
            paybillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paybillsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paybillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jTextField26)
                    .addComponent(jTextField27)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        paybillsLayout.setVerticalGroup(
            paybillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paybillsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paybillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paybillsLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel31)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", paybills);

        encash.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(2, 54, 129));
        jPanel16.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Transaction No.");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Account No.", "Check No.", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setRowHeight(30);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encash_MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
            jTable6.getColumnModel().getColumn(4).setResizable(false);
        }

        jTextField35.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_accountnum_validation(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Account No.");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Check No.");

        jTextField36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_checknum_validation(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Amount");

        jTextField37.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_amount_validation(evt);
            }
        });

        jTextField42.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encash_status_validation(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Status");

        javax.swing.GroupLayout encashLayout = new javax.swing.GroupLayout(encash);
        encash.setLayout(encashLayout);
        encashLayout.setHorizontalGroup(
            encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encashLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jTextField35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        encashLayout.setVerticalGroup(
            encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encashLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(encashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(encashLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", encash);

        renew.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(2, 54, 129));
        jPanel17.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Details of Transaction");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Transaction No.");

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Account No.", "Account Name", "Expiration Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setRowHeight(30);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renew_MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Account No.");

        jTextField38.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_accountnum_validation(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Account Name");

        jTextField39.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_accountname_validation(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setText("Expiration Date");

        jTextField40.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_expiration_validation(evt);
            }
        });

        jTextField44.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renew_status_validation(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Status");

        javax.swing.GroupLayout renewLayout = new javax.swing.GroupLayout(renew);
        renew.setLayout(renewLayout);
        renewLayout.setHorizontalGroup(
            renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renewLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField39))
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        renewLayout.setVerticalGroup(
            renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(renewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(renewLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", renew);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1550, 690));

        jPanel9.setBackground(new java.awt.Color(255, 212, 28));

        backBtn.setBackground(new java.awt.Color(2, 54, 129));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 204, 102));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 10, true));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 10, true));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 204, 255));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 10, true));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear() {
        jTextField7.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField23.setText("");
        jTextField22.setText("");
        jTextField41.setText("");
        jTextField11.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField32.setText("");
        jTextField9.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField28.setText("");
        jTextField27.setText("");
        jTextField31.setText("");
        jTextField15.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField42.setText("");
        jTextField17.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField44.setText("");
        jTextField19.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField43.setText("");
        jTable2.clearSelection();
        jTable3.clearSelection();
        jTable4.clearSelection();
        jTable6.clearSelection();
        jTable7.clearSelection();
        jTable8.clearSelection();
    }

    private void upDateDataBase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            switch (SwiftBankQMS.getSelected_transaction()) {
                case "DEPOSIT":
                    pst = con.prepareStatement("select * from hstry_deposit");
                    break;
                case "CASH WITHDRAWAL":
                    pst = con.prepareStatement("select * from hstry_withdraw");
                    break;
                case "PAY BILLS":
                    pst = con.prepareStatement("select * from hstry_paybills");
                    break;
                case "ENCASH CHECK":
                    pst = con.prepareStatement("select * from hstry_encash");
                    break;
                case "RENEW MEMBERSHIP":
                    pst = con.prepareStatement("select * from hstry_renew");
                    break;
                case "ACCOUNT OPENING":
                    pst = con.prepareStatement("select * from hstry_opening");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            int q = stData.getColumnCount();

            DefaultTableModel RecordTable = null;
            if (SwiftBankQMS.getSelected_transaction().equals("DEPOSIT")) {
                RecordTable = (DefaultTableModel) jTable2.getModel();
            } else if (SwiftBankQMS.getSelected_transaction().equals("CASH WITHDRAWAL")) {
                RecordTable = (DefaultTableModel) jTable4.getModel();
            } else if (SwiftBankQMS.getSelected_transaction().equals("PAY BILLS")) {
                RecordTable = (DefaultTableModel) jTable3.getModel();
            } else if (SwiftBankQMS.getSelected_transaction().equals("ENCASH CHECK")) {
                RecordTable = (DefaultTableModel) jTable6.getModel();
            } else if (SwiftBankQMS.getSelected_transaction().equals("RENEW MEMBERSHIP")) {
                RecordTable = (DefaultTableModel) jTable7.getModel();
            } else { // ACCOUNT OPENING 
                RecordTable = (DefaultTableModel) jTable8.getModel();
            }

            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (int i = 1; i <= q; i++) {
                    switch (SwiftBankQMS.getSelected_transaction()) {
                        case "DEPOSIT":
                            pst = con.prepareStatement("select * hstry_deposit");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("acctname"));
                            columnData.add(rs.getString("dpstreference"));
                            columnData.add(rs.getString("checknum"));
                            columnData.add(rs.getString("amount"));
                            columnData.add(rs.getString("status"));
                            break;
                        case "CASH WITHDRAWAL":
                            pst = con.prepareStatement("select * from hstry_withdraw");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("acctnum"));
                            columnData.add(rs.getString("amount"));
                            columnData.add(rs.getString("status"));
                            break;
                        case "PAY BILLS":
                            pst = con.prepareStatement("select * from hstry_paybills");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("biller"));
                            columnData.add(rs.getString("subacctname"));
                            columnData.add(rs.getString("subacctnum"));
                            columnData.add(rs.getString("checknum"));
                            columnData.add(rs.getString("amount"));
                            columnData.add(rs.getString("status"));
                            break;
                        case "ENCASH CHECK":
                            pst = con.prepareStatement("select * from hstry_encash");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("acctnum"));
                            columnData.add(rs.getString("checknum"));
                            columnData.add(rs.getString("amount"));
                            columnData.add(rs.getString("status"));
                            break;
                        case "RENEW MEMBERSHIP":
                            pst = con.prepareStatement("select * from hstry_renew");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("acctnum"));
                            columnData.add(rs.getString("acctname"));
                            columnData.add(rs.getString("expiration"));
                            columnData.add(rs.getString("status"));
                            break;
                        case "ACCOUNT OPENING":
                            pst = con.prepareStatement("select * from hstry_opening");
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("acctnum"));
                            columnData.add(rs.getString("acctname"));
                            columnData.add(rs.getString("status"));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void backBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn
        admin_home goBack = new admin_home();
        goBack.setVisible(true);
        admin_history.this.setVisible(false);
    }//GEN-LAST:event_backBtn

    private static String getValueOrDefault(JTextField txtfield) { //to check if a jTextField is Empty
        return txtfield.getText().isEmpty() ? "N/A" : txtfield.getText();
    }

    private void updateBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn
        DefaultTableModel RecordTable = new DefaultTableModel();
        int SelectedRow = -1;
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                RecordTable = (DefaultTableModel) jTable2.getModel();
                SelectedRow = jTable2.getSelectedRow();
                break;
            case "CASH WITHDRAWAL":
                RecordTable = (DefaultTableModel) jTable4.getModel();
                SelectedRow = jTable4.getSelectedRow();
                break;
            case "PAY BILLS":
                RecordTable = (DefaultTableModel) jTable3.getModel();
                SelectedRow = jTable3.getSelectedRow();
                break;
            case "ENCASH CHECK":
                RecordTable = (DefaultTableModel) jTable6.getModel();
                SelectedRow = jTable6.getSelectedRow();
                break;
            case "RENEW MEMBERSHIP":
                RecordTable = (DefaultTableModel) jTable7.getModel();
                SelectedRow = jTable7.getSelectedRow();
                break;
            case "ACCOUNT OPENING":
                RecordTable = (DefaultTableModel) jTable8.getModel();
                SelectedRow = jTable8.getSelectedRow();
                break;
            default:
                JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                break;
        }

        if (SelectedRow != -1 || SelectedRow >= RecordTable.getRowCount()) {
            try {
                String id = RecordTable.getValueAt(SelectedRow, 0).toString();
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");

                switch (SwiftBankQMS.getSelected_transaction()) {
                    case "DEPOSIT":
                        pst = con.prepareStatement("update hstry_deposit set acctname =?, dpstreference =?, checknum =?,"
                                + "amount =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField20)); // Account Name 
                        pst.setString(2, getValueOrDefault(jTextField21)); // Deposit Reference No.
                        pst.setString(3, getValueOrDefault(jTextField23)); // Check No.
                        pst.setString(4, getValueOrDefault(jTextField22)); // Amount 
                        pst.setString(5, getValueOrDefault(jTextField41)); // Status 
                        pst.setString(6, id); // Transaction Number 
                        break;
                    case "CASH WITHDRAWAL":
                        pst = con.prepareStatement("update hstry_withdraw set acctnum =?, amount =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField29)); // Account No. 
                        pst.setString(2, getValueOrDefault(jTextField30)); // Amount 
                        pst.setString(3, getValueOrDefault(jTextField32)); // Status 
                        pst.setString(4, id); // Transaction Number 
                        break;
                    case "PAY BILLS":
                        pst = con.prepareStatement("update hstry_paybills set biller =?, subacctname =?, subacctnum =?,"
                                + "checknum =?, amount =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField24)); // Biller 
                        pst.setString(2, getValueOrDefault(jTextField25)); // Subscriber's Account Name
                        pst.setString(3, getValueOrDefault(jTextField26)); // Subscriber's Account Numebr
                        pst.setString(4, getValueOrDefault(jTextField28)); // Check No.
                        pst.setString(5, getValueOrDefault(jTextField27)); // Amount
                        pst.setString(6, getValueOrDefault(jTextField31)); // Status 
                        pst.setString(7, id); // Transaction Number 
                        break;
                    case "ENCASH CHECK":
                        pst = con.prepareStatement("update hstry_encash set acctnum =?, checknum =?, amount =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField35)); // Account Number
                        pst.setString(2, getValueOrDefault(jTextField36)); // Check No.
                        pst.setString(3, getValueOrDefault(jTextField37)); // Amount
                        pst.setString(4, getValueOrDefault(jTextField42)); // Status 
                        pst.setString(5, id); // Transaction Number 
                        break;
                    case "RENEW MEMBERSHIP":
                        pst = con.prepareStatement("update hstry_renew set acctnum =?, acctname =?, expiration =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField38)); // Account Number
                        pst.setString(2, getValueOrDefault(jTextField39)); // Account Name.
                        pst.setString(3, getValueOrDefault(jTextField40)); // Expiration
                        pst.setString(4, getValueOrDefault(jTextField44)); // Status 
                        pst.setString(5, id); // Transaction Number 
                        break;
                    case "ACCOUNT OPENING":
                        pst = con.prepareStatement("update hstry_opening set acctnum =?, acctname =?, status =? where ID =?");
                        pst.setString(1, getValueOrDefault(jTextField33)); // Account Number
                        pst.setString(2, getValueOrDefault(jTextField34)); // Account Name.
                        pst.setString(3, getValueOrDefault(jTextField43)); // Status
                        pst.setString(4, id); // Transaction Number 
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                        break;
                }

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
                clear();
                upDateDataBase();
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid row.", "ERROR OCCURRED", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateBtn

    private void deleteBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn
        DefaultTableModel RecordTable = new DefaultTableModel();
        int SelectedRow = -1;
        switch (SwiftBankQMS.getSelected_transaction()) {
            case "DEPOSIT":
                RecordTable = (DefaultTableModel) jTable2.getModel();
                SelectedRow = jTable2.getSelectedRow();
                if (jTable2.getValueAt(SelectedRow, 5).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            case "CASH WITHDRAWAL":
                RecordTable = (DefaultTableModel) jTable4.getModel();
                SelectedRow = jTable4.getSelectedRow();
                if (jTable4.getValueAt(SelectedRow, 3).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            case "PAY BILLS":
                RecordTable = (DefaultTableModel) jTable3.getModel();
                SelectedRow = jTable3.getSelectedRow();
                if (jTable3.getValueAt(SelectedRow, 6).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            case "ENCASH CHECK":
                RecordTable = (DefaultTableModel) jTable6.getModel();
                SelectedRow = jTable6.getSelectedRow();
                if (jTable6.getValueAt(SelectedRow, 4).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            case "RENEW MEMBERSHIP":
                RecordTable = (DefaultTableModel) jTable7.getModel();
                SelectedRow = jTable7.getSelectedRow();
                if (jTable7.getValueAt(SelectedRow, 4).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            case "ACCOUNT OPENING":
                RecordTable = (DefaultTableModel) jTable8.getModel();
                SelectedRow = jTable8.getSelectedRow();
                if (jTable8.getValueAt(SelectedRow, 3).equals("Serving")) {
                    JOptionPane.showMessageDialog(null, "You can't delete a ticket with 'Serving' Status.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "The system can't recognize the transaction.", "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
                break;
        }

        try {
            String id = RecordTable.getValueAt(SelectedRow, 0).toString();
            int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item",
                    "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
                switch (SwiftBankQMS.getSelected_transaction()) {
                    case "DEPOSIT":
                        pst = con.prepareStatement("delete from hstry_deposit where ID =?");
                        break;

                    case "CASH WITHDRAWAL":
                        pst = con.prepareStatement("delete from hstry_withdraw where ID =?");
                        break;

                    case "PAY BILLS":
                        pst = con.prepareStatement("delete from hstry_paybills where ID =?");
                        break;

                    case "ENCASH CHECK":
                        pst = con.prepareStatement("delete from hstry_encash where ID =?");
                        break;

                    case "RENEW MEMBERSHIP":
                        pst = con.prepareStatement("delete from hstry_renew where ID =?");
                        break;

                    case "ACCOUNT OPENING":
                        pst = con.prepareStatement("delete from hstry_opening where ID =?");
                        break;
                }

                pst.setString(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
                upDateDataBase();
                clear();
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Select a Transaction to Delete");
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }//GEN-LAST:event_deleteBtn

    private void deposit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();

        jTextField7.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); //Transaction No.
        jTextField20.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); // Account No.
        jTextField21.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); // Reference No.
        jTextField23.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); // Check No.
        jTextField22.setText(RecordTable.getValueAt(SelectedRows, 4).toString()); // Amount
        jTextField41.setText(RecordTable.getValueAt(SelectedRows, 5).toString()); // Status 
    }//GEN-LAST:event_deposit_MouseClicked

    private void deposit_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField20.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
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
    }//GEN-LAST:event_deposit_accountnum_validation

    private void deposit_referenceno_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_referenceno_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField21.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
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
    }//GEN-LAST:event_deposit_referenceno_validation

    private void deposit_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_checknum_validation
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
    }//GEN-LAST:event_deposit_checknum_validation

    private void deposit_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField22.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
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
    }//GEN-LAST:event_deposit_amount_validation

    private void deposit_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposit_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField41.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField41.setEditable(true);
            } else {
                jTextField41.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField41.setEditable(true);
            } else {
                jTextField41.setEditable(false);
            }
        }
    }//GEN-LAST:event_deposit_status_validation

    private void clearBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn
        clear();
    }//GEN-LAST:event_clearBtn

    private void withdrawal_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawal_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField29.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField29.setEditable(true);
            } else {
                jTextField29.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField29.setEditable(true);
            } else {
                jTextField29.setEditable(false);
            }
        }
    }//GEN-LAST:event_withdrawal_accountnum_validation

    private void withdrawal_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawal_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField30.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField30.setEditable(true);
            } else {
                jTextField30.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField30.setEditable(true);
            } else {
                jTextField30.setEditable(false);
            }
        }
    }//GEN-LAST:event_withdrawal_amount_validation

    private void withdrawal_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawal_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField32.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField32.setEditable(true);
            } else {
                jTextField32.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField32.setEditable(true);
            } else {
                jTextField32.setEditable(false);
            }
        }
    }//GEN-LAST:event_withdrawal_status_validation

    private void withdrawal_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawal_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable4.getModel();
        int SelectedRows = jTable4.getSelectedRow();

        jTextField11.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); //Transaction No.
        jTextField29.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); // Account No.
        jTextField30.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); // Amount
        jTextField32.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); // Status
    }//GEN-LAST:event_withdrawal_MouseClicked

    private void paybills_biller_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_biller_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField24.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField24.setEditable(true);
            } else {
                jTextField24.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField24.setEditable(true);
            } else {
                jTextField24.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_biller_validation

    private void paybills_subaccountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_subaccountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField25.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField25.setEditable(true);
            } else {
                jTextField25.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField25.setEditable(true);
            } else {
                jTextField25.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_subaccountname_validation

    private void paybills_subaccountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_subaccountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField26.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField26.setEditable(true);
            } else {
                jTextField26.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField26.setEditable(true);
            } else {
                jTextField26.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_subaccountnum_validation

    private void paybills_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_checknum_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField28.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField28.setEditable(true);
            } else {
                jTextField28.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField28.setEditable(true);
            } else {
                jTextField28.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_checknum_validation

    private void paybills_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField27.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField27.setEditable(true);
            } else {
                jTextField27.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField27.setEditable(true);
            } else {
                jTextField27.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_amount_validation

    private void paybills_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybills_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField31.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField31.setEditable(true);
            } else {
                jTextField31.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField31.setEditable(true);
            } else {
                jTextField31.setEditable(false);
            }
        }
    }//GEN-LAST:event_paybills_status_validation

    private void paybills_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybills_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
        int SelectedRows = jTable3.getSelectedRow();

        jTextField9.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); //Transaction No.
        jTextField24.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); // Biller
        jTextField25.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); // Subscriber's Account Name
        jTextField26.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); // Subscriber's Account No
        jTextField28.setText(RecordTable.getValueAt(SelectedRows, 4).toString()); // Check No.
        jTextField27.setText(RecordTable.getValueAt(SelectedRows, 5).toString()); // Amount
        jTextField31.setText(RecordTable.getValueAt(SelectedRows, 6).toString()); // Status
    }//GEN-LAST:event_paybills_MouseClicked

    private void encash_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField35.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField35.setEditable(true);
            } else {
                jTextField35.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField35.setEditable(true);
            } else {
                jTextField35.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_accountnum_validation

    private void encash_checknum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_checknum_validation
        // Validation: Numbers only and Maximum of 10 digits 
        String pn = jTextField36.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 10) {
                jTextField36.setEditable(true);
            } else {
                jTextField36.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField36.setEditable(true);
            } else {
                jTextField36.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_checknum_validation

    private void encash_amount_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_amount_validation
        // Validation: Numbers only and Maximum of 7 digits 
        String pn = jTextField37.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 7) {
                jTextField37.setEditable(true);
            } else {
                jTextField37.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField37.setEditable(true);
            } else {
                jTextField37.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_amount_validation

    private void encash_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encash_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField42.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField42.setEditable(true);
            } else {
                jTextField42.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField42.setEditable(true);
            } else {
                jTextField42.setEditable(false);
            }
        }
    }//GEN-LAST:event_encash_status_validation

    private void encash_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encash_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable6.getModel();
        int selectedRow = jTable6.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            Object value0 = RecordTable.getValueAt(selectedRow, 0);
            Object value1 = RecordTable.getValueAt(selectedRow, 1);
            Object value2 = RecordTable.getValueAt(selectedRow, 2);
            Object value3 = RecordTable.getValueAt(selectedRow, 3);
            Object value4 = RecordTable.getValueAt(selectedRow, 4);

            // Check if all values are not null before setting into JTextFields
            if (value0 != null && value1 != null && value2 != null && value3 != null && value4 != null) {
                jTextField15.setText(value0.toString()); // Transaction No.
                jTextField35.setText(value1.toString()); // Account No.
                jTextField36.setText(value2.toString()); // Check No.
                jTextField37.setText(value3.toString()); // Amount
                jTextField42.setText(value4.toString()); // Status
            }
        }
    }//GEN-LAST:event_encash_MouseClicked

    private void renew_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField38.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField38.setEditable(true);
            } else {
                jTextField38.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField38.setEditable(true);
            } else {
                jTextField38.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_accountnum_validation

    private void renew_accountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_accountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField39.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField39.setEditable(true);
            } else {
                jTextField39.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField39.setEditable(true);
            } else {
                jTextField39.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_accountname_validation

    private void renew_expiration_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_expiration_validation
        // Validation: Maximum characters of 10 
        String n = jTextField40.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();

        if (Character.isLetterOrDigit(c1) || c1 == '/' || c1 == '-') {
            if (l1 < 10) {
                jTextField40.setEditable(true);
            } else {
                jTextField40.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_2 || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField40.setEditable(true);
            } else {
                jTextField40.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_expiration_validation

    private void renew_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renew_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField44.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField44.setEditable(true);
            } else {
                jTextField44.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField44.setEditable(true);
            } else {
                jTextField44.setEditable(false);
            }
        }
    }//GEN-LAST:event_renew_status_validation

    private void renew_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renew_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable7.getModel();
        int SelectedRows = jTable7.getSelectedRow();

        jTextField17.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); //Transaction No.
        jTextField38.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); // Account No.
        jTextField39.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); // Account Name
        jTextField40.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); // Expiration Date
        jTextField44.setText(RecordTable.getValueAt(SelectedRows, 4).toString()); // Status
    }//GEN-LAST:event_renew_MouseClicked

    private void accopening_accountnum_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accopening_accountnum_validation
        // Validation: Numbers only and Maximum of 16 digits 
        String pn = jTextField33.getText();
        int l = pn.length();
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            if (l < 16) {
                jTextField33.setEditable(true);
            } else {
                jTextField33.setEditable(false);
            }
        } else {
            if (Character.isISOControl(c)) {
                jTextField33.setEditable(true);
            } else {
                jTextField33.setEditable(false);
            }
        }
    }//GEN-LAST:event_accopening_accountnum_validation

    private void accopening_accountname_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accopening_accountname_validation
        // Validation: Only Letters and Max Characters: 60
        String n = jTextField34.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 60) {
                jTextField34.setEditable(true);
            } else {
                jTextField34.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField34.setEditable(true);
            } else {
                jTextField34.setEditable(false);
            }
        }
    }//GEN-LAST:event_accopening_accountname_validation

    private void accopening_status_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accopening_status_validation
        // Validation: Only Letters and Max Characters: 10
        String n = jTextField43.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1)) {
            if (l1 < 10) {
                jTextField43.setEditable(true);
            } else {
                jTextField43.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField43.setEditable(true);
            } else {
                jTextField43.setEditable(false);
            }
        }
    }//GEN-LAST:event_accopening_status_validation

    private void accopening_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accopening_MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable8.getModel();
        int SelectedRows = jTable8.getSelectedRow();

        jTextField19.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); //Transaction No.
        jTextField33.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); // Account No.
        jTextField34.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); // Account Name
        jTextField43.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); // Status
    }//GEN-LAST:event_accopening_MouseClicked

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
            java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accOpening;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel deposit;
    private javax.swing.JPanel encash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel paybills;
    private javax.swing.JPanel renew;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel withdrawal;
    // End of variables declaration//GEN-END:variables
}
