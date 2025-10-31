package swift.bank.qms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;

public class admin_login extends javax.swing.JFrame {

    public admin_login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        SwiftBankQMS.setTypeOfUser("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        sign_in = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 54, 129));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 140)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_validation(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        exit.setBackground(new java.awt.Color(255, 212, 28));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit(evt);
            }
        });

        sign_in.setBackground(new java.awt.Color(255, 212, 28));
        sign_in.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        sign_in.setText("SIGN IN");
        sign_in.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPasswordField1.setEchoChar('*');
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_validation(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(2, 54, 129));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 800, 870));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cover.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private void login_successful() {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!");
        admin_home next = new admin_home();
        next.setVisible(true);
        admin_login.this.setVisible(false);
        SwiftBankQMS.setTypeOfUser("ADMIN");
    }

    private void login_failed() {
        JOptionPane.showMessageDialog(this, "Username and Password do not match! Please check and try again.", "Swift Bank QMS", JOptionPane.ERROR_MESSAGE);
        jTextField1.setText("");
        jPasswordField1.setText("");
        jTextField1.requestFocus();
    }

    private void exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit
        cstmer_start next = new cstmer_start();
        next.setVisible(true);
        admin_login.this.setVisible(false);
    }//GEN-LAST:event_exit

    private void sign_in(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in
        try {
            if (jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter your Username or Password!");
            } else {
                String username = jTextField1.getText();
                String password = jPasswordField1.getText();

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");

                pst = con.prepareStatement("SELECT * from swift_admins WHERE BINARY username=? and password=? ");
                pst.setString(1, username);
                pst.setString(2, password);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String userType = rs.getString("username");
                    if (userType.equals("C1")) {
                        SwiftBankQMS.setCounterNum("C1");
                    } else if (userType.equals("C2")) {
                        SwiftBankQMS.setCounterNum("C2");
                    } else if (userType.equals("C3")) {
                        SwiftBankQMS.setCounterNum("C3");
                    } else if (userType.equals("C4")) {
                        SwiftBankQMS.setCounterNum("C4");
                    } else if (userType.equals("C5")) {
                        SwiftBankQMS.setCounterNum("C5");
                    } else if (userType.equals("C6")) {
                        SwiftBankQMS.setCounterNum("C6");
                    } else {
                        login_failed();
                        return;
                    }
                    login_successful();
                } else {
                    login_failed();
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admin_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sign_in

    private void username_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_validation
        // Validation: Maximum characters of 60 
        String n = jTextField1.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();

        if (Character.isLetterOrDigit(c1)) {
            if (l1 < 60) {
                jTextField1.setEditable(true);
            } else {
                jTextField1.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_2 || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jTextField1.setEditable(true);
            } else {
                jTextField1.setEditable(false);
            }
        }
    }//GEN-LAST:event_username_validation

    private void show_password(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password
        if (jCheckBox1.isSelected()) {
            // Show Password
            jPasswordField1.setEchoChar((char) 0);
        } else {
            // Hide Password 
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_show_password

    private void password_validation(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_validation
        // Validation: Maximum characters of 60 
        String n = jPasswordField1.getText();
        int l1 = n.length();
        char c1 = evt.getKeyChar();

        if (Character.isLetterOrDigit(c1)) {
            if (l1 < 60) {
                jPasswordField1.setEditable(true);
            } else {
                jPasswordField1.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(c1) || Character.isISOControl(c1) || evt.getExtendedKeyCode() == KeyEvent.VK_2 || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT) {
                jPasswordField1.setEditable(true);
            } else {
                jPasswordField1.setEditable(false);
            }
        }
    }//GEN-LAST:event_password_validation

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
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sign_in;
    // End of variables declaration//GEN-END:variables
}
