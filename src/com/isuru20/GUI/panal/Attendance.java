package com.isuru20.GUI.panal;

import com.isuru20.modal.DB;
import com.isuru20.modal.ItemLoader;
import com.isuru20.modal.LogWritter;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Attendance extends javax.swing.JPanel {

    public Attendance() {
        initComponents();
        loadStudent("");
        loadTeacher("");
        dateSetter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPanal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        Student = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stNIC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Teacher = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        teNIC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tdate = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(998, 537));

        btnPanal.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Student Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPanal.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 204, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Teacher Attendance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        btnPanal.add(jButton2);

        main.setLayout(new java.awt.CardLayout());

        stTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Time", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student NIC");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Date");

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseReleased(evt);
            }
        });
        jDateChooser1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Clean");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mark Student Attendance");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student NIC");

        stNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stNICKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Name");

        name.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Date");

        date.setEditable(false);

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Mark Attendance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(stNIC)
                    .addComponent(name)
                    .addComponent(date)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StudentLayout = new javax.swing.GroupLayout(Student);
        Student.setLayout(StudentLayout);
        StudentLayout.setHorizontalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(StudentLayout.createSequentialGroup()
                        .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        StudentLayout.setVerticalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentLayout.createSequentialGroup()
                        .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        main.add(Student, "card2");

        teTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Teacher ID", "Name", "Date"
            }
        ));
        jScrollPane2.setViewportView(teTable);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Teacher NIC");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Date");

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Clean");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mark Teacher Attendance");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Teacher NIC");

        teNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teNICKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Date");

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Mark Attendance");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(teNIC)
                    .addComponent(tname)
                    .addComponent(tdate)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TeacherLayout = new javax.swing.GroupLayout(Teacher);
        Teacher.setLayout(TeacherLayout);
        TeacherLayout.setHorizontalGroup(
            TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(TeacherLayout.createSequentialGroup()
                        .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TeacherLayout.setVerticalGroup(
            TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeacherLayout.createSequentialGroup()
                        .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        main.add(Teacher, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnColorSetup(jButton1);
        main.removeAll();
        main.add(Student);
        SwingUtilities.updateComponentTreeUI(main);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnColorSetup(jButton2);
        main.removeAll();
        main.add(Teacher);
        SwingUtilities.updateComponentTreeUI(main);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void stNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stNICKeyReleased
        findStudent();
    }//GEN-LAST:event_stNICKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        markStAttend();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cleanAll();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        shortStudent();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jDateChooser1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser1CaretPositionChanged
        shortStudent();
    }//GEN-LAST:event_jDateChooser1CaretPositionChanged

    private void jDateChooser1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseReleased
        shortStudent();
    }//GEN-LAST:event_jDateChooser1MouseReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        teacherAttend();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void teNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teNICKeyReleased
        findTeacher();
    }//GEN-LAST:event_teNICKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cleanAll();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        sortTecher();
    }//GEN-LAST:event_jTextField6KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Student;
    private javax.swing.JPanel Teacher;
    private javax.swing.JPanel btnPanal;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel main;
    private javax.swing.JTextField name;
    private javax.swing.JTextField stNIC;
    private javax.swing.JTable stTable;
    private javax.swing.JTextField tdate;
    private javax.swing.JTextField teNIC;
    private javax.swing.JTable teTable;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables

    private void btnColorSetup(JButton btn) {
        jButton1.setBackground(new Color(255, 204, 153));
        jButton2.setBackground(new Color(255, 204, 153));
        btn.setBackground(Color.orange);
        SwingUtilities.updateComponentTreeUI(btnPanal);
    }

    private void loadStudent(String query) {
        try {
            String q = "SELECT `student_nic`,`marked_time`,`date` FROM `student_attendance` "
                    + "INNER JOIN `school_shedule` ON school_shedule.id = student_attendance.school_shedule_id " + query;
            String[] colums = {"student_nic", "marked_time", "date"};
            ItemLoader.getItemLoader().loadTable(stTable, q, colums);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Loading", ex);

        }
    }

    private void findStudent() {
        String nic = stNIC.getText();

        if (nic.length() == 10 || nic.length() == 12) {
            try {
                ResultSet rs = DB.search("SELECT CONCAT(`fname`,' ',`lname`) AS `name` FROM `student` WHERE `nic` = '" + nic + "'");
                if (rs.next()) {
                    name.setText(rs.getString(1));
                }
            } catch (ClassNotFoundException | SQLException | IOException ex) {
                LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Search", ex);

            }
        }
    }

    private void dateSetter() {
        date.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        tdate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    private void markStAttend() {
        try {
            String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

            ResultSet scShedule = DB.search("SELECT `id`,`shedule_status_id` FROM `school_shedule` WHERE `date` = '" + today + "'");
            if (scShedule.next()) {
                if ("1".equals(scShedule.getString(2))) {

                    if (name.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please Enter Your NIC", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {

                        boolean ismarked = DB.search("SELECT `student_nic` FROM `student_attendance` WHERE `student_nic` = '" + stNIC.getText() + "' AND `school_shedule_id` = '" + scShedule.getString(1) + "' ").next();

                        if (ismarked) {
                            JOptionPane.showMessageDialog(this, "The Student Alredy Marked The Attendance", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            String time = new SimpleDateFormat("hh:mm:ss").format(new Date());
                            DB.IUD("INSERT INTO `student_attendance` (`marked_time`, `student_nic`, `school_shedule_id`)"
                                    + " VALUES ('" + time + "', '" + stNIC.getText() + "', '" + scShedule.getString(1) + "');");
                            cleanAll();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Can not mark Shedule is holiday", "Holiday Shedule", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Shedule Not Found", "Missing Shedule", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Search", ex);

        }
    }

    private void cleanAll() {
        this.stNIC.setText("");
        this.name.setText("");
        this.jTextField1.setText("");
        this.jDateChooser1.setDate(null);
        loadStudent("");

        this.teNIC.setText("");
        this.tname.setText("");
        this.jTextField6.setText("");
        this.jDateChooser2.setDate(null);
        loadTeacher("");
    }

    private void shortStudent() {
        String nic = jTextField1.getText();
        String date = null;
        if (jDateChooser1.getDate() != null) {
            date = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        }

        String q = "";

        if (!nic.isEmpty() && date == null) {
            q = "WHERE `student_attendance`.`student_nic` LIKE '%" + nic + "%'";
        } else if (nic.isEmpty() && date != null) {
            q = "WHERE `school_shedule`.`date` = '" + date + "' ";
        } else if (!nic.isEmpty() && date != null) {
            q = "WHERE `student_attendance`.`student_nic` LIKE '%" + nic + "%' AND `school_shedule`.`date` = '" + date + "' ";
        }
        loadStudent(q);
    }

    private void findTeacher() {
        String nic = teNIC.getText();
        System.out.println(nic);
        if (nic.length() == 10 || nic.length() == 12) {
            try {
                ResultSet rs = DB.search("SELECT CONCAT(`fname`,' ',`lname`) AS `name` FROM `teacher` WHERE `nic` = '" + nic + "'");
                if (rs.next()) {
                    tname.setText(rs.getString(1));
                }
            } catch (ClassNotFoundException | SQLException | IOException ex) {
                LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Search", ex);
            }
        }
    }

    private void teacherAttend() {

        try {
            String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

            ResultSet scShedule = DB.search("SELECT `id`,`shedule_status_id` FROM `school_shedule` WHERE `date` = '" + today + "'");
            if (scShedule.next()) {
                if ("1".equals(scShedule.getString(2))) {

                    if (teNIC.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please Enter Your NIC", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {

                        boolean ismarked = DB.search("SELECT `teacher_nic` FROM `teacher_attendance` WHERE `teacher_nic` = '" + teNIC.getText() + "' AND `school_shedule_id` = '" + scShedule.getString(1) + "' ").next();

                        if (ismarked) {
                            JOptionPane.showMessageDialog(this, "The Teacher Alredy Marked The Attendance", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            String time = new SimpleDateFormat("hh:mm:ss").format(new Date());
                            DB.IUD("INSERT INTO `teacher_attendance` (`marked_time`, `teacher_nic`, `school_shedule_id`)"
                                    + " VALUES ('" + time + "', '" + teNIC.getText() + "', '" + scShedule.getString(1) + "');");
                            cleanAll();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Can not mark Shedule is holiday", "Holiday Shedule", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Shedule Not Found", "Missing Shedule", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Search", ex);

        }

    }

    private void loadTeacher(String query) {
        try {
            String q = "SELECT `teacher_nic`,`marked_time`,`date` FROM `teacher_attendance` "
                    + "INNER JOIN `school_shedule` ON school_shedule.id = teacher_attendance.school_shedule_id " + query;
            String[] colums = {"teacher_nic", "marked_time", "date"};
            ItemLoader.getItemLoader().loadTable(teTable, q, colums);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            LogWritter.logger.log(Level.WARNING, "Attendance Panal Student Loading", ex);

        }
    }

    private void sortTecher() {
        String nic = jTextField6.getText();
        String date = null;
        if (jDateChooser2.getDate() != null) {
            date = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate());
        }

        String q = "";

        if (!nic.isEmpty() && date == null) {
            q = "WHERE `teacher_attendance`.`teacher_nic` LIKE '%" + nic + "%'";
        } else if (nic.isEmpty() && date != null) {
            q = "WHERE `school_shedule`.`date` = '" + date + "' ";
        } else if (!nic.isEmpty() && date != null) {
            q = "WHERE `teacher_attendance`.`teacher_nic` LIKE '%" + nic + "%' AND `school_shedule`.`date` = '" + date + "' ";
        }
        loadTeacher(q);
    }
}
