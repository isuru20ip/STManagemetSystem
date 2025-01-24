package com.isuru20.GUI.Frame;

import com.formdev.flatlaf.IntelliJTheme;
import com.isuru20.GUI.panal.Dashboard;
import com.isuru20.GUI.panal.Student;
import com.isuru20.GUI.panal.Teacher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        frameSetup();
        panalSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        student = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 12));

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        student.setBackground(new java.awt.Color(255, 204, 102));
        student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student.setForeground(new java.awt.Color(0, 0, 0));
        student.setText("Students");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student);

        teacher.setBackground(new java.awt.Color(255, 204, 102));
        teacher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        teacher.setForeground(new java.awt.Color(0, 0, 0));
        teacher.setText("Teachers");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel1.add(teacher);

        payment.setBackground(new java.awt.Color(255, 204, 102));
        payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payment.setForeground(new java.awt.Color(0, 0, 0));
        payment.setText("Payments");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel1.add(payment);

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Subjects");
        jPanel1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 204, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Shedule");
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 204, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Badge");
        jPanel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 204, 102));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Attendance");
        jPanel1.add(jButton9);

        jButton11.setBackground(new java.awt.Color(255, 204, 102));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Admin");
        jPanel1.add(jButton11);

        jButton12.setBackground(new java.awt.Color(255, 153, 153));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Logout");
        jPanel1.add(jButton12);

        main.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        loadPanel(new Student(this));
        buttonColorSetup(student);
    }//GEN-LAST:event_studentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadPanel(new Dashboard());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        loadPanel(new Teacher(this));
        buttonColorSetup(teacher);
    }//GEN-LAST:event_teacherActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        buttonColorSetup(payment);
    }//GEN-LAST:event_paymentActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(Home.class.getResourceAsStream(
                "/com/isuru20/assets/theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private void frameSetup() {
        this.setTitle("VT School System");
        //this.setSize(900, 600); // Initial size
        this.setBackground(Color.BLACK);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/com/isuru20/assets/top_icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main;
    private javax.swing.JButton payment;
    private javax.swing.JButton student;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables

    private JPanel current;

    private void loadPanel(JPanel panel) {

        if (!current.getClass().equals(panel.getClass())) {
            main.removeAll();
            main.add(panel, BorderLayout.CENTER);
            SwingUtilities.updateComponentTreeUI(main);
            current = panel;
        } else {
            System.out.println("error");
        }
    }

    private void panalSetup() {
        current = new Dashboard();
        main.add(current, BorderLayout.CENTER);
    }

    private void buttonColorSetup(JButton btn) {

        student.setBackground(new Color(255, 204, 102));
        teacher.setBackground(new Color(255, 204, 102));
        payment.setBackground(new Color(255, 204, 102));

        btn.setBackground(new Color(255, 102, 0));
    }

}
