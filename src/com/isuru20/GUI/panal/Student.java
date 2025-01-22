package com.isuru20.GUI.panal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class Student extends javax.swing.JPanel {

    public Student() {
        initComponents();
        firstLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPanal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        add = new javax.swing.JPanel();
        view = new javax.swing.JPanel();

        btnPanal.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Student Registration");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPanal.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("View & Sort Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        btnPanal.add(jButton2);

        main.setLayout(new java.awt.CardLayout());

        add.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        main.add(add, "card2");

        view.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        main.add(view, "card3");

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
        main.add(add);
        SwingUtilities.updateComponentTreeUI(main);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnColorSetup(jButton2);
        main.removeAll();
        main.add(view);
        SwingUtilities.updateComponentTreeUI(main);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel btnPanal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel main;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables

    private void btnColorSetup(JButton btn) {
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
//        jButton1.setForeground(null);
//        jButton2.setBackground(null);

        btn.setBackground(Color.orange);
        SwingUtilities.updateComponentTreeUI(btnPanal);
    }

    private void firstLoad() {
        btnColorSetup(jButton1);
        main.removeAll();
        main.add(add);
        SwingUtilities.updateComponentTreeUI(main);
    }
}
