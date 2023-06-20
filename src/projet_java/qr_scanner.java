package projet_java;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public class qr_scanner extends javax.swing.JFrame implements Runnable, ThreadFactory{

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    
    private demande dmd;
    
    public qr_scanner(demande dmd) {
        this.dmd =dmd;
        initComponents();
        scannerOn();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        video_contain = new javax.swing.JPanel();
        result_values = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        video_contain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        video_contain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(video_contain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 460, 430));

        result_values.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result_values.setText("x");
        result_values.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result_valuesMouseClicked(evt);
            }
        });
        jPanel1.add(result_values, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void result_valuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result_valuesMouseClicked
        this.dispose();
    }//GEN-LAST:event_result_valuesMouseClicked

    private void scannerOn(){

       Dimension size = WebcamResolution.QVGA.getSize();
       webcam = Webcam.getWebcams().get(0);
       webcam.setViewSize(size);
       webcam.open();
       

       panel = new WebcamPanel(webcam);
       panel.setPreferredSize(size);
       panel.setFPSDisplayed(true);
       
       video_contain.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,video_contain.getWidth(),video_contain.getHeight()));
       
       executor.execute(this);
    }
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
            java.util.logging.Logger.getLogger(qr_scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qr_scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qr_scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qr_scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                qr_scanner qr = new qr_scanner(null);
                qr.setVisible(true);
            }
        });
    }
    
    @Override
    public void run(){
        do{
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(qr_scanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Result result = null;
            BufferedImage image = null;
            
            if(webcam.isOpen()){
                if( (image = webcam.getImage()) == null ){
                    continue;
                }
            }
            
            
            try {
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                result = new MultiFormatReader().decode(bitmap);
                
            } catch (Exception ex) {
//                Logger.getLogger(qr_scanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(result != null){
                this.dmd.setId(result.getText());
                webcam.close();
                this.dispose();
            }
        }
        while(true);
        
    }
    
    @Override
    public Thread newThread(Runnable r){
        Thread t = new Thread(r, "My thread");
        t.setDaemon(true);
        return t;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel result_values;
    private javax.swing.JPanel video_contain;
    // End of variables declaration//GEN-END:variables
}
