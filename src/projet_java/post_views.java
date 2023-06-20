/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;

import controller.controlPoste;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROG
 */
public class post_views extends javax.swing.JInternalFrame {

    /**
     * Creates new form post_views
     */
    public post_views() {
        initComponents();
        
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        ChargePoste();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        list_container = new javax.swing.JScrollPane();
        list_post = new javax.swing.JTable();
        add_poste = new javax.swing.JButton();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(240, 242, 255));

        list_container.setBackground(new java.awt.Color(255, 255, 255));
        list_container.setBorder(null);

        list_post.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        list_container.setViewportView(list_post);

        add_poste.setBackground(new java.awt.Color(0, 102, 255));
        add_poste.setForeground(new java.awt.Color(255, 255, 255));
        add_poste.setText("Nouveau poste");
        add_poste.setBorder(null);
        add_poste.setBorderPainted(false);
        add_poste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_posteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(list_container, javax.swing.GroupLayout.DEFAULT_SIZE, 1114, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(list_container, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(add_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_posteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_posteActionPerformed
        AddPoste add = new AddPoste(post_views.this);
        add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add.setVisible(true);
    }//GEN-LAST:event_add_posteActionPerformed

    public void ChargePoste() {
        String titre[] = {"Nom du poste", "Salaire mensuel", "Salaire journalier"};
        Object enreg[][] = new Object[1][1];

        try {
            controlPoste ccp = new controlPoste();
            
            int nbr = ccp.countPoste();
            enreg = new Object[nbr][titre.length];
            ResultSet rs1 = ccp.getAllPoste();
            int i = 0;
            while (rs1.next()) {
                enreg[i][0] = (Object) rs1.getString("nom_poste");
                enreg[i][1] = (Object) rs1.getString("salaire");
                enreg[i][2] = (Object) rs1.getString("salaire_journalier");
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        list_post.setModel(new DefaultTableModel(enreg, titre));
        list_container.setViewportView(list_post);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_poste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane list_container;
    private javax.swing.JTable list_post;
    // End of variables declaration//GEN-END:variables
}
