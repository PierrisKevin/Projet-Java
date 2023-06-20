/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ROG
 */
public class card_member extends javax.swing.JFrame {

    /**
     * Creates new form card_member
     */
    public card_member() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allContain = new javax.swing.JPanel();
        infro_contain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num_cin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sexe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        poste = new javax.swing.JLabel();
        image_contain = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        message_contain = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        qr_contain = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        allContain.setBackground(new java.awt.Color(204, 204, 204));

        infro_contain.setBackground(new java.awt.Color(255, 255, 255));
        infro_contain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logo");

        jLabel2.setText("Nom : ");

        jLabel3.setText("Prenom : ");

        num_cin.setText("num_cin");

        jLabel5.setText("Num CIN : ");

        jLabel6.setText("Sexe : ");

        sexe.setText("sexe");

        jLabel7.setText("Adresse : ");

        adresse.setText("adresse");

        jLabel8.setText("Poste : ");

        poste.setText("poste");

        image_contain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_contain.setText("image");

        nom.setText("nom");

        prenom.setText("prenom");

        javax.swing.GroupLayout infro_containLayout = new javax.swing.GroupLayout(infro_contain);
        infro_contain.setLayout(infro_containLayout);
        infro_containLayout.setHorizontalGroup(
            infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infro_containLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infro_containLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(poste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infro_containLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image_contain, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        infro_containLayout.setVerticalGroup(
            infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infro_containLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infro_containLayout.createSequentialGroup()
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(prenom))
                        .addGap(18, 18, 18)
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(num_cin))
                        .addGap(18, 18, 18)
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sexe))
                        .addGap(23, 23, 23)
                        .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(adresse)))
                    .addComponent(image_contain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infro_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(poste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        message_contain.setBackground(new java.awt.Color(255, 255, 255));
        message_contain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel9.setText("Ce carte qui est en votre possesion doit toujoursvous encopagner pour pouvoir entrer ");

        jLabel10.setText("dans le lieu de travaille sinon vous serez considerer comme absant,");

        jLabel11.setText("Et prend bien soin de la QR CODE pour eviter le probleme");

        qr_contain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qr_contain.setText("qr code");
        qr_contain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qr_containMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout message_containLayout = new javax.swing.GroupLayout(message_contain);
        message_contain.setLayout(message_containLayout);
        message_containLayout.setHorizontalGroup(
            message_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_containLayout.createSequentialGroup()
                .addGroup(message_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(message_containLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(message_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(message_containLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(qr_contain, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        message_containLayout.setVerticalGroup(
            message_containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_containLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(90, 90, 90)
                .addComponent(qr_contain, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout allContainLayout = new javax.swing.GroupLayout(allContain);
        allContain.setLayout(allContainLayout);
        allContainLayout.setHorizontalGroup(
            allContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allContainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allContainLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(allContainLayout.createSequentialGroup()
                        .addComponent(infro_contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message_contain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        allContainLayout.setVerticalGroup(
            allContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allContainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(message_contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infro_contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(allContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(allContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qr_containMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qr_containMouseClicked
        
    }//GEN-LAST:event_qr_containMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printer(allContain);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(card_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(card_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(card_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(card_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new card_member().setVisible(true);
            }
        });
    }

    
    public ImageIcon ResizeQR(String imagePath){
        ImageIcon myImage = new javax.swing.ImageIcon(getClass().getResource(imagePath));
        Image imge = myImage.getImage();
        Image newImage = imge.getScaledInstance(qr_contain.getWidth(), qr_contain.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    public ImageIcon ResizeImage(String imagePath){
        if (imagePath.equals("default.jpg")) imagePath = "/media/profil_image/"+imagePath;
        System.out.println(imagePath);
        ImageIcon myImage = new javax.swing.ImageIcon(getClass().getResource(imagePath));
        Image imge = myImage.getImage();
        Image newImage = imge.getScaledInstance(qr_contain.getWidth(), qr_contain.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    public static void printer(JPanel pan){
        PrinterJob prnt = PrinterJob.getPrinterJob();
        prnt.setJobName("Imprsession de carte personnel");
        prnt.setPrintable(new Printable(){
            @Override
            public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
                if(i>0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D grph = (Graphics2D)grphcs;
                grph.translate(pf.getImageableX()*2, pf.getImageableY()*2);
                grph.scale(0.5, 0.5);
                
                pan.paint(grph);
                return Printable.PAGE_EXISTS;
            }
            
        });
        boolean result = prnt.printDialog();
        if(result){
            try{
                prnt.print();
            }
            catch(PrinterException printerException){
                System.out.println("Erreur d'impression");
            }
        }
    }
    
    public void addValue(String name, String prename, String cin, String adress, String pst, String qr_path, String photo){
        nom.setText(name);
        prenom.setText(prename);
        num_cin.setText(cin);
        adresse.setText(adress);
        poste.setText(pst);
        String sexget = cin.split("")[5];
        if (sexget.equals("1")){
            sexe.setText("Homme");
        }
        else{
            sexe.setText("Femme");
        }
        qr_contain.setIcon(ResizeQR(qr_path));
        image_contain.setText("");
        image_contain.setIcon(ResizeImage(photo));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JPanel allContain;
    private javax.swing.JLabel image_contain;
    private javax.swing.JPanel infro_contain;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel message_contain;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel num_cin;
    private javax.swing.JLabel poste;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel qr_contain;
    private javax.swing.JLabel sexe;
    // End of variables declaration//GEN-END:variables
}
