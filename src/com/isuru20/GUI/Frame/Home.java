package com.isuru20.GUI.Frame;

import com.isuru20.GUI.panal.Attendance;
import com.isuru20.GUI.panal.Shedule;
import com.isuru20.GUI.panal.Student;
import com.isuru20.GUI.panal.Subject;
import com.isuru20.GUI.panal.Teacher;
import com.isuru20.GUI.panal.Badge;
import com.isuru20.GUI.panal.Payment;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Home extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        student = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        shedule = new javax.swing.JButton();
        badge = new javax.swing.JButton();
        attendance = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 12));

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

        subject.setBackground(new java.awt.Color(255, 204, 102));
        subject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject.setForeground(new java.awt.Color(0, 0, 0));
        subject.setText("Subjects");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        jPanel1.add(subject);

        shedule.setBackground(new java.awt.Color(255, 204, 102));
        shedule.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shedule.setForeground(new java.awt.Color(0, 0, 0));
        shedule.setText("Shedule");
        shedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sheduleActionPerformed(evt);
            }
        });
        jPanel1.add(shedule);

        badge.setBackground(new java.awt.Color(255, 204, 102));
        badge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        badge.setForeground(new java.awt.Color(0, 0, 0));
        badge.setText("Badge");
        badge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badgeActionPerformed(evt);
            }
        });
        jPanel1.add(badge);

        attendance.setBackground(new java.awt.Color(255, 204, 102));
        attendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        attendance.setForeground(new java.awt.Color(0, 0, 0));
        attendance.setText("Attendance");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });
        jPanel1.add(attendance);

        jButton12.setBackground(new java.awt.Color(255, 153, 153));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Logout");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
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

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        loadPanel(new Teacher(this));
        buttonColorSetup(teacher);
    }//GEN-LAST:event_teacherActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        buttonColorSetup(payment);
        loadPanel(new Payment());
    }//GEN-LAST:event_paymentActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        loadPanel(new Subject(this));
        buttonColorSetup(subject);
    }//GEN-LAST:event_subjectActionPerformed

    private void sheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sheduleActionPerformed
        loadPanel(new Shedule());
        buttonColorSetup(shedule);
    }//GEN-LAST:event_sheduleActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
        loadPanel(new Attendance());
        buttonColorSetup(attendance);
    }//GEN-LAST:event_attendanceActionPerformed

    private void badgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badgeActionPerformed
        loadPanel(new Badge());
        buttonColorSetup(badge);
    }//GEN-LAST:event_badgeActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        logOut();
    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendance;
    private javax.swing.JButton badge;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main;
    private javax.swing.JButton payment;
    private javax.swing.JButton shedule;
    private javax.swing.JButton student;
    private javax.swing.JButton subject;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables

    // constructor
    public Home() {
        initComponents();
        frameSetup();
        panalSetup();
    }

    // hold the current loaded panal
    private JPanel current;

    // set the jFrame elements At the loading
    private void frameSetup() {
        this.setTitle("VT School System");
        //this.setSize(900, 600); // Initial size
        this.setBackground(Color.BLACK);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(Toolkit.getDefaultToolkit()
                .getImage(this.getClass().getResource("/com/isuru20/assets/top_icon.png")));
    }

    // load the  panal into screen 
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

    // set defalut panal at the startup
    private void panalSetup() {
        current = new Student(this);
        main.add(current, BorderLayout.CENTER);
    }

    // Color up the buttons 
    private void buttonColorSetup(JButton btn) {
        student.setBackground(new Color(255, 204, 102));
        teacher.setBackground(new Color(255, 204, 102));
        payment.setBackground(new Color(255, 204, 102));
        subject.setBackground(new Color(255, 204, 102));
        shedule.setBackground(new Color(255, 204, 102));
        attendance.setBackground(new Color(255, 204, 102));
        badge.setBackground(new Color(255, 204, 102));

        btn.setBackground(new Color(255, 102, 0));
    }

    // system logout action
    private void logOut() {
        this.main.removeAll();
        this.dispose();
        new SignIn().setVisible(true);
    }
}
