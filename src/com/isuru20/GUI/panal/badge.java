package com.isuru20.GUI.panal;

import com.isuru20.modal.DB;
import com.isuru20.modal.ItemLoader;
import com.isuru20.modal.LogWritter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Badge extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        badgeId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        status = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(998, 537));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add & Update Badge");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Badge ID");

        badgeId.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Subject");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Status");

        subject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectItemStateChanged(evt);
            }
        });

        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addComponent(badgeId)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(badgeId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Start", "Subject", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Status");

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Badge ID");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, 0, 236, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        loadBadeg();
    }//GEN-LAST:event_jTable1MouseClicked

    private void subjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectItemStateChanged
        badgeIDWraper();
    }//GEN-LAST:event_subjectItemStateChanged

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        badgeIDWraper();
    }//GEN-LAST:event_datePropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addBadge();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateStus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clareAll();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sortBadge();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        sortBadge();
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        sortBadge();
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField badgeId;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> subject;
    // End of variables declaration//GEN-END:variables

    // constructor
    public Badge() {
        initComponents();
        loadbadge("");
        loadState();
        loadSubjects();
        badgeIDWraper();
    }

    HashMap<String, String> subjectyMap = new HashMap<>(); // store city id <k: city name, V: cityId>
    HashMap<String, String> stetusMap = new HashMap<>(); // store status id <k: status name, V: statusId>
    private String currentSt; // store current Status

    // load badges into jTable
    private void loadbadge(String condition) {
        try {
            String[] colums = {"id", "date", "subject", "status"};
            String query = "SELECT `badge`.`id`,`badge`.`date`,`subject`.`name` "
                    + "AS `subject`,`badge_status`.`name` AS `status` FROM `badge` "
                    + "INNER JOIN `subject` ON `subject`.`id` = `badge`.`subject_id` "
                    + "INNER JOIN `badge_status` ON `badge_status`.`id` = `badge`.`badge_status_id` " + condition;
            ItemLoader.getItemLoader().loadTable(jTable1, query, colums);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            LogWritter.logger.log(java.util.logging.Level.WARNING, "badge panal badge load", ex);
        }
    }

    // load subjects
    private void loadSubjects() {
        String[] value = {"Select Subject"};
        String qurty = "SELECT `id`,`name` FROM `subject` ORDER BY `name` ASC ";
        try {
            subjectyMap = ItemLoader.getItemLoader().loadComboPlus(subject, qurty, value);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            LogWritter.logger.log(java.util.logging.Level.WARNING, "badge panal badge loade", ex);
        }
    }

    // load status
    private void loadState() {
        String[] value = {"Select Status"};
        String qurty = "SELECT `id`,`name` FROM `badge_status`";
        String qurty2 = "SELECT `name` FROM `badge_status`";
        try {
            stetusMap = ItemLoader.getItemLoader().loadComboPlus(status, qurty, value);
            ItemLoader.getItemLoader().loadCombo(jComboBox3, qurty2, value);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            LogWritter.logger.log(java.util.logging.Level.WARNING, 
                    "Badge Panal Status Loading", ex);
        }
    }

    // load clicked table row's data into txt field
    private void loadBadeg() {
        elementLocker(true);
        try {
            int row = jTable1.getSelectedRow();
            badgeId.setText((String) jTable1.getValueAt(row, 0));
            subject.setSelectedItem(jTable1.getValueAt(row, 2));
            date.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable1.getValueAt(row, 1)));
            status.setSelectedItem(jTable1.getValueAt(row, 3));
            currentSt = (String) jTable1.getValueAt(row, 3);
        } catch (ParseException ex) {
            LogWritter.logger.log(java.util.logging.Level.WARNING, 
                    "Badge Panal Badge Loading", ex);
        }
    }

    // Genarate Dynamic Badge Id Accoding to Subject and Yeat/Month
    private void badgeIDWraper() {
        String subject = String.valueOf(this.subject.getSelectedItem());
        Date selectDate = date.getDate();
        if (selectDate == null) {
            badgeId.setText("");
            return;
        } else {
            badgeId.setText(new SimpleDateFormat("yyyy/MM/").format(selectDate));
        }
        if (subject.equals("Select Subject")) {
            badgeId.setText("");
            return;
        } else {
            badgeId.setText(badgeId.getText() + subject.substring(0, 4).toUpperCase());
        }
    }

    // validate and register new badge
    private void addBadge() {
        String id = this.badgeId.getText();
        String subject = (String) this.subject.getSelectedItem();
        Date date = this.date.getDate();
        String status = (String) this.status.getSelectedItem();

        if (subject.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Subject is required", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (date == null) {
            JOptionPane.showMessageDialog(this, 
                    "Date is required", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (!new Date().before(date)) {
            JOptionPane.showMessageDialog(this, 
                    "Invalida Date", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (status.equals("Select Status") || status.equals("Completed")) {
            JOptionPane.showMessageDialog(this, 
                    "Invalida Status", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                boolean isID = DB.search("SELECT `id` FROM `badge` "
                        + "WHERE `id` = '" + id + "' ").next();
                if (isID) {
                    JOptionPane.showMessageDialog(this, 
                            "Badge Exsist", "Warning", 
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    DB.IUD("INSERT INTO `badge` (`id`, `date`, `subject_id`, `badge_status_id`) "
                            + "VALUES ('" + id + "', '" + new SimpleDateFormat("yyyy-MM-dd").format(date) + "',"
                                    + " '" + subjectyMap.get(subject) + "', '" + stetusMap.get(status) + "');");
                    JOptionPane.showMessageDialog(this, 
                            "Add new Badge", "Success", 
                            JOptionPane.INFORMATION_MESSAGE);
                    clareAll();
                }
            } catch (IOException | ClassNotFoundException | SQLException ex) {
                LogWritter.logger.log(java.util.logging.Level.WARNING,
                        "Badeg Panal Add new Badge", ex);
            }
        }
    }

    // cean All fields
    private void clareAll() {
        this.badgeId.setText("");
        this.subject.setSelectedIndex(0);
        this.date.setDate(null);
        this.status.setSelectedIndex(0);
        this.jTextField2.setText("");
        this.jComboBox3.setSelectedIndex(0);
        loadbadge("");
        elementLocker(false);
    }

    // update status 
    private void updateStus() {
        String id = this.badgeId.getText();
        String status = (String) this.status.getSelectedItem();

        if (currentSt.equals("Upcoming")) {
            if (!status.equals("On Going")) {
                JOptionPane.showMessageDialog(this, 
                        "Invalida Status", "Warning", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        if (currentSt.equals("On Going")) {
            if (!status.equals("Completed")) {
                JOptionPane.showMessageDialog(this, 
                        "Invalida Status", "Warning", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        if (currentSt.equals("Completed")) {
            JOptionPane.showMessageDialog(this, 
                    "Invalida Status", "Warning", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            DB.IUD("UPDATE `badge` SET `badge_status_id`= '" + stetusMap.get(status) + "' WHERE `id`='" + id + "';");
            JOptionPane.showMessageDialog(this, 
                    "Badge Updated", "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            clareAll();
            elementLocker(false);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            LogWritter.logger.log(java.util.logging.Level.WARNING, "Badge Panal Update Badge Status", ex);
        }

    }

    // control button access for add and update proccess
    private void elementLocker(boolean lock) {
        if (lock) {
            this.badgeId.setEnabled(!lock);
            this.subject.setEditable(!lock);
            this.date.setEnabled(!lock);
        } else {
            this.badgeId.setEnabled(!lock);
            this.subject.setEditable(!lock);
            this.date.setEnabled(!lock);
        }
    }

    // shortout and load data into table
    private void sortBadge() {
        String id = jTextField2.getText();
        String status = (String) jComboBox3.getSelectedItem();

        String query = "";

        if (!id.isEmpty() && status.equals("Select Status")) {
            query = "WHERE `badge`.`id` LIKE '%" + id + "'%";
        } else if (id.isEmpty() && !status.equals("Select Status")) {
            query = "WHERE `badge`.`badge_status_id` = '" + stetusMap.get(status) + "'";
        } else if (!id.isEmpty() && !status.equals("Select Status")) {
            query = "WHERE `badge`.`id` = '" + id + "' AND `badge`.`badge_status_id` = '" + stetusMap.get(status) + "' ";
        }

        loadbadge(query);
    }

}
