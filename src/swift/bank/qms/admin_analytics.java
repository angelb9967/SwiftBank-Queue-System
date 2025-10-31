package swift.bank.qms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class admin_analytics extends javax.swing.JFrame {

    public admin_analytics() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pieChart1.requestFocus();
        jComboBox1.setSelectedIndex(0); // OVERALL TRANSACTIONS 

        // PIE CHART [LEFT]
        Color[] distinctColors = {
            new Color(72, 0, 72),
            new Color(255, 0, 0),
            new Color(0, 255, 0),
            new Color(0, 0, 255),
            new Color(200, 200, 200),
            new Color(255, 0, 255)
        };

        int colorIndex = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            pst = con.prepareStatement("SELECT * FROM swift_admins WHERE BINARY username LIKE 'C%'");
            rs = pst.executeQuery();

            // Clear existing data from the pie chart
            pieChart2.clearData();

            while (rs.next()) {
                String username = rs.getString("username"); // C1, C2, C3, C4, C5, C6
                int total = rs.getInt("totalqueue"); // TOTAL # OF TRANSACTIONS

                Color color = distinctColors[colorIndex % distinctColors.length];
                colorIndex++;

                getContentPane().setBackground(new Color(255, 255, 255));
                pieChart2.setChartType(PieChart.PeiChartType.DONUT_CHART);
                pieChart2.addData(new ModelPieChart(username, total, color));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(admin_analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pieChart1 = new swift.bank.qms.PieChart();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pieChart2 = new swift.bank.qms.PieChart();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieChart1.add(jLabel1);
        jLabel1.setBounds(50, 230, 450, 140);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(2, 54, 129));
        jLabel12.setText("for Counter 1");
        pieChart1.add(jLabel12);
        jLabel12.setBounds(20, 10, 343, 48);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(2, 54, 129));
        jLabel13.setText("by total, done, denied");
        pieChart1.add(jLabel13);
        jLabel13.setBounds(20, 40, 380, 50);

        getContentPane().add(pieChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 154, 520, 610));

        jPanel11.setBackground(new java.awt.Color(255, 212, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 54, 129));
        jLabel2.setText("| ANALYTICS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 54, 129));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ADMIN");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swift bank logo 4.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 54, 129));
        jLabel10.setText("for Counter 1");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 160));

        jPanel1.setBackground(new java.awt.Color(255, 212, 28));

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

        jComboBox1.setBackground(new java.awt.Color(2, 54, 129));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OVERALL", "COUNTER #1", "COUNTER #2", "COUNTER #3", "COUNTER #4", "COUNTER #5", "COUNTER #6" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 764, 1070, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 54, 129));
        jLabel4.setText("DONE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 660, -1, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 54, 129));
        jLabel5.setText("0000");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 210, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 54, 129));
        jLabel6.setText("DENIED");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 370, -1, 60));

        jPanel4.setBackground(new java.awt.Color(92, 92, 90));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 670, 170, 40));

        jPanel5.setBackground(new java.awt.Color(2, 54, 129));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, 460, 20));

        jPanel6.setBackground(new java.awt.Color(2, 54, 129));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, -3, -1, 870));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 54, 129));
        jLabel7.setText("TOTAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, -1, 70));

        jPanel7.setBackground(new java.awt.Color(2, 54, 129));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, -1, -1));

        jPanel8.setBackground(new java.awt.Color(252, 114, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 80, 170, 40));

        jPanel9.setBackground(new java.awt.Color(6, 160, 168));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 380, 170, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 54, 129));
        jLabel8.setText("0000");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 150, 210, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 54, 129));
        jLabel9.setText("0000");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 460, 210, 70));

        jPanel10.setBackground(new java.awt.Color(2, 54, 129));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, 740));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(2, 54, 129));
        jLabel11.setText("All Counter #s by Total");
        pieChart2.add(jLabel11);
        jLabel11.setBounds(20, 10, 500, 48);

        getContentPane().add(pieChart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 530, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String user = jComboBox1.getSelectedItem().toString();
        jLabel10.setText("for " + user);
        jLabel12.setText("for " + user);
        if (user.equals("COUNTER #1")) {
            user = "C1";
        } else if (user.equals("COUNTER #2")) {
            user = "C2";
        } else if (user.equals("COUNTER #3")) {
            user = "C3";
        } else if (user.equals("COUNTER #4")) {
            user = "C4";
        } else if (user.equals("COUNTER #5")) {
            user = "C5";
        } else if (user.equals("COUNTER #6")) {
            user = "C6";
        }
        pieChart1.clearData();
        displayAnalytics(user);
        jLabel2.requestFocus();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn
        admin_home goBack = new admin_home();
        goBack.setVisible(true);
        admin_analytics.this.setVisible(false);
    }//GEN-LAST:event_backBtn

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private void displayAnalytics(String user) {
        try { // PIE CHART [RIGHT]  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swift_datajava", "root", "Angel#072104");
            pst = con.prepareStatement("SELECT * from swift_admins WHERE BINARY username = ? ");
            pst.setString(1, user);
            rs = pst.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("totalqueue");
                int denied = rs.getInt("denied");
                int done = rs.getInt("done");
                getContentPane().setBackground(new Color(255, 255, 255));
                pieChart1.setChartType(PieChart.PeiChartType.DONUT_CHART);
                pieChart1.addData(new ModelPieChart("Denied", denied, new Color(6, 160, 168)));
                pieChart1.addData(new ModelPieChart("Done", done, new Color(92, 92, 90)));

                if (total == 0 && denied == 0 && done == 0) {
                    jLabel1.setText("NO TRANSACTIONS");
                    jLabel8.setText("");
                    jLabel5.setText("");
                    jLabel9.setText("");
                } else { // 
                    jLabel8.setText(String.valueOf(total));
                    jLabel9.setText(String.valueOf(denied));
                    jLabel5.setText(String.valueOf(done));
                    jLabel1.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(admin_analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_analytics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private swift.bank.qms.PieChart pieChart1;
    private swift.bank.qms.PieChart pieChart2;
    // End of variables declaration//GEN-END:variables
}
