package com.isuru20.GUI.panal;

import com.isuru20.modal.DB;
import com.isuru20.modal.ItemLoader;
import com.isuru20.modal.LogWritter;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Subject extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        subjectList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teacherList = new javax.swing.JList<>();
        newSubject = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        teacherId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        duration = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        subjectName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(998, 537));

        subjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subject Management");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Subject List");

        jScrollPane2.setViewportView(teacherList);

        newSubject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newSubject.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Add Teacher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add New Subject");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Teacher List");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add New Teacher");

        teacherId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teacherId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");

        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Duration");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Teacher");

        subjectName.setEditable(false);
        subjectName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subjectName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Subject");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newSubject)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(price)
                            .addComponent(duration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subjectName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(duration))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(teacherId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectListMouseClicked
        if (evt.getClickCount() == 2) {
            findTeacher();
        }
    }//GEN-LAST:event_subjectListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addNewSubject();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setTeacher();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newSubject;
    private javax.swing.JTextField price;
    private javax.swing.JList<String> subjectList;
    private javax.swing.JTextField subjectName;
    private javax.swing.JTextField teacherId;
    private javax.swing.JList<String> teacherList;
    // End of variables declaration//GEN-END:variables

    // constructor
    public Subject(JFrame parent) {
        initComponents();
        loadSubject();
        loadDuration();
    }

    HashMap<String, String> subjectMap = new HashMap<>(); // store city id <k: city name, V: city Id>
    HashMap<String, String> teacherMap = new HashMap<>(); // store status id <k: status name, V: status Id>
    HashMap<String, String> durationMap = new HashMap<>(); // store duration id <k: duration name, V: duration Id>

    // load subject into list
    private void loadSubject() {
        try {
            String q = "SELECT `id`,`name` FROM `subject` ORDER BY `name` ASC ";
            subjectMap = ItemLoader.getItemLoader().loadList(subjectList, q);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(Level.WARNING, "Subject Panal Subject Loading", ex);
        }
    }

    // load teacher into list
    private void findTeacher() {
        String subject = subjectList.getSelectedValue();
        this.subjectName.setText(subject);
        String q = "SELECT `nic`, CONCAT(`fname`,' ',`lname`) FROM `teacher` "
                + "INNER JOIN `subject_has_teacher` ON "
                + "`subject_has_teacher`.`teacher_nic` = `teacher`.`nic` "
                + "WHERE `subject_has_teacher`.`subject_id` = '" + subjectMap.get(subject) + "'";
        try {
            teacherMap = ItemLoader.getItemLoader().loadList(teacherList, q);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(Level.WARNING, "Subject Panal Teacher Loading", ex);
        }
    }

    // add new subject into database
    private void addNewSubject() {
        String subject = this.newSubject.getText();
        if (!subject.isEmpty() && !price.getText().isEmpty() && !duration.getSelectedItem().equals("Select Duration")) {
            try {
                boolean isSubject = DB.search("SELECT `name` FROM `subject` WHERE `name` = '" + subject + "'").next();
                if (!isSubject) {
                    DB.IUD("INSERT INTO `subject` (`name`, `price`, `subject_duration_id`) "
                            + "VALUES ('" + subject + "', '" + price.getText() + "', '" + durationMap.get(duration.getSelectedItem()) + "');");
                    JOptionPane.showMessageDialog(this, "New Subject Added Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadSubject();
                    this.newSubject.setText("");
                    this.price.setText("");
                    this.duration.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(this, "This Subject has alredy been added", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | IOException | ClassNotFoundException | SQLException ex) {
                LogWritter.logger.log(Level.WARNING, "Subject Panal Add new Subject", ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Subject Data is required", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    // load subject duration comboBox
    private void loadDuration() {
        String[] value = {"Select Duration"};
        String qurty = "SELECT `id`,`name` FROM `subject_duration`";
        try {
            durationMap = ItemLoader.getItemLoader().loadComboPlus(duration, qurty, value);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(Level.WARNING, "subject Panal Duration Loading", ex);
        }
    }

    // add new teacher into a subject
    private void setTeacher() {
        String subject = this.subjectName.getText();
        String teacher = this.teacherId.getText();

        if (subject.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Select a subject on the list ", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (teacher.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "NIC is required", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String sid = subjectMap.get(subject);

            try {
                boolean isTeacher = DB.search("SELECT `nic` FROM `teacher` "
                        + "WHERE `nic` = '" + teacher + "'").next();
                System.out.println(isTeacher);
                if (isTeacher) {
                    ResultSet rs = DB.search(" SELECT COUNT(`teacher_nic`) "
                            + "FROM `subject_has_teacher` WHERE `teacher_nic` = '" + teacher + "' ");
                    rs.next();
                    if (Integer.parseInt(rs.getString(1)) <= 1) {
                        DB.IUD("INSERT INTO `subject_has_teacher`"
                                + " (`subject_id`, `teacher_nic`) "
                                + "VALUES ('" + sid + "', '" + teacher + "');");
                        JOptionPane.showMessageDialog(this, 
                                "New Teacher is added to the Subject",
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        loadSubject();
                        this.teacherId.setText("");
                        this.subjectName.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, 
                                "A Teacher Can have tow Subject only", 
                                "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, 
                            "Invalid NIC number", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | IOException | ClassNotFoundException | NumberFormatException | SQLException ex) {
                LogWritter.logger.log(Level.WARNING, "Subject Panal add Teacher Loading", ex);

            }

        }
    }

}
