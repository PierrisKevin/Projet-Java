package projet_java;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() throws Exception {
        initComponents();
        int width = this.desk_container.getWidth();
        int height = this.desk_container.getHeight();
        
        dashboard dash = new dashboard();
        this.desk_container.add(dash);
        dash.setSize(width, height);
        dash.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        dash.show();
    }

    public void changeMenu(JPanel jlb, JInternalFrame jtf){
        this.desk_container.removeAll();
        JPanel allPannel[] = {dashBoard_menu, Personnel_menu, demande_menu, trash_menu};
        int width = this.desk_container.getWidth();
        int height = this.desk_container.getHeight();
        for(int i=0; i<allPannel.length;i++){
            allPannel[i].setBackground(Color.WHITE);
        }
        jlb.setBackground(this.getBackground());
        this.desk_container.add(jtf);
        this.desk_container.setBackground(Color.BLACK);
        jtf.setSize(width, height);
        jtf.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtf.show();
        System.out.println(this.getBackground());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuContainer = new javax.swing.JPanel();
        dashBoard_menu = new javax.swing.JPanel();
        dash_link = new javax.swing.JLabel();
        Personnel_menu = new javax.swing.JPanel();
        personnel_link = new javax.swing.JLabel();
        personnel_click = new javax.swing.JLabel();
        demande_menu = new javax.swing.JPanel();
        demand_link = new javax.swing.JLabel();
        exit_menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logo_contain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        trash_menu = new javax.swing.JPanel();
        trash_link = new javax.swing.JLabel();
        desk_container = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        MenuContainer.setBackground(new java.awt.Color(255, 255, 255));

        dashBoard_menu.setBackground(new java.awt.Color(37, 188, 253));

        dash_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dash-icon.png"))); // NOI18N
        dash_link.setText(" Dashboard");
        dash_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dash_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_linkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashBoard_menuLayout = new javax.swing.GroupLayout(dashBoard_menu);
        dashBoard_menu.setLayout(dashBoard_menuLayout);
        dashBoard_menuLayout.setHorizontalGroup(
            dashBoard_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoard_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dash_link, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashBoard_menuLayout.setVerticalGroup(
            dashBoard_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoard_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dash_link, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Personnel_menu.setBackground(new java.awt.Color(255, 255, 255));

        personnel_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff-icon.png"))); // NOI18N
        personnel_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personnel_linkMouseClicked(evt);
            }
        });

        personnel_click.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personnel_click.setLabelFor(demand_link);
        personnel_click.setText("Personnel");
        personnel_click.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personnel_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personnel_clickMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Personnel_menuLayout = new javax.swing.GroupLayout(Personnel_menu);
        Personnel_menu.setLayout(Personnel_menuLayout);
        Personnel_menuLayout.setHorizontalGroup(
            Personnel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Personnel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personnel_link, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personnel_click)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Personnel_menuLayout.setVerticalGroup(
            Personnel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Personnel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Personnel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personnel_click)
                    .addComponent(personnel_link, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        demande_menu.setBackground(new java.awt.Color(255, 255, 255));

        demand_link.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        demand_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/demand-icon.png"))); // NOI18N
        demand_link.setText(" Demande");
        demand_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        demand_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demand_linkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout demande_menuLayout = new javax.swing.GroupLayout(demande_menu);
        demande_menu.setLayout(demande_menuLayout);
        demande_menuLayout.setHorizontalGroup(
            demande_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demande_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demand_link, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        demande_menuLayout.setVerticalGroup(
            demande_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demande_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demand_link, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        exit_menu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jLabel2.setText(" Quiter");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exit_menuLayout = new javax.swing.GroupLayout(exit_menu);
        exit_menu.setLayout(exit_menuLayout);
        exit_menuLayout.setHorizontalGroup(
            exit_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exit_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exit_menuLayout.setVerticalGroup(
            exit_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exit_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo_contain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pers.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("PERSONNAL");

        jLabel4.setText("MANAGEMENT");

        javax.swing.GroupLayout logo_containLayout = new javax.swing.GroupLayout(logo_contain);
        logo_contain.setLayout(logo_containLayout);
        logo_containLayout.setHorizontalGroup(
            logo_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_containLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logo_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        logo_containLayout.setVerticalGroup(
            logo_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_containLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(logo_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(logo_containLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );

        trash_menu.setBackground(new java.awt.Color(255, 255, 255));

        trash_link.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trash_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trash.png"))); // NOI18N
        trash_link.setText(" Corbeille");
        trash_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trash_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trash_linkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trash_menuLayout = new javax.swing.GroupLayout(trash_menu);
        trash_menu.setLayout(trash_menuLayout);
        trash_menuLayout.setHorizontalGroup(
            trash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trash_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trash_link, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trash_menuLayout.setVerticalGroup(
            trash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trash_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trash_link, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuContainerLayout = new javax.swing.GroupLayout(MenuContainer);
        MenuContainer.setLayout(MenuContainerLayout);
        MenuContainerLayout.setHorizontalGroup(
            MenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashBoard_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Personnel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(demande_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trash_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuContainerLayout.setVerticalGroup(
            MenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_contain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashBoard_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Personnel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demande_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trash_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                .addComponent(exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        desk_container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desk_containerLayout = new javax.swing.GroupLayout(desk_container);
        desk_container.setLayout(desk_containerLayout);
        desk_containerLayout.setHorizontalGroup(
            desk_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        desk_containerLayout.setVerticalGroup(
            desk_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desk_container)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desk_container)
                    .addComponent(MenuContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dash_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_linkMouseClicked
        try {
            dashboard dash = new dashboard();
            changeMenu(dashBoard_menu, dash);
        } catch (Exception ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dash_linkMouseClicked

    private void personnel_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnel_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_personnel_linkMouseClicked

    private void demand_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demand_linkMouseClicked
        demande dmd = new demande();
        changeMenu(demande_menu, dmd);
    }//GEN-LAST:event_demand_linkMouseClicked

    private void personnel_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnel_clickMouseClicked
        personnel pers = new personnel();
        changeMenu(Personnel_menu, pers);
    }//GEN-LAST:event_personnel_clickMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void trash_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trash_linkMouseClicked
        corbeille cb = new corbeille();
        changeMenu(trash_menu,cb);
    }//GEN-LAST:event_trash_linkMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuContainer;
    private javax.swing.JPanel Personnel_menu;
    private javax.swing.JPanel dashBoard_menu;
    private javax.swing.JLabel dash_link;
    private javax.swing.JLabel demand_link;
    private javax.swing.JPanel demande_menu;
    private javax.swing.JDesktopPane desk_container;
    private javax.swing.JPanel exit_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logo_contain;
    private javax.swing.JLabel personnel_click;
    private javax.swing.JLabel personnel_link;
    private javax.swing.JLabel trash_link;
    private javax.swing.JPanel trash_menu;
    // End of variables declaration//GEN-END:variables
}
