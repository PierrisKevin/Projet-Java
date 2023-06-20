/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;

import controller.Personne;
import controller.controlCOnges;
import controller.controlPayment;
import controller.controlPersonne;
import controller.controlPoste;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.String.join;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author ROG
 */
public class modal_personnel extends javax.swing.JFrame {

    int validateValues[] = {0,0,0,0,0};
    public modal_personnel() {
        initComponents();
        
        try {
            chargePosteValue();
        } catch (Exception ex) {
            Logger.getLogger(modal_personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        save_btn.setEnabled(false);
        edit_btn.setEnabled(false);
        identifiant.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date_naissance = new javax.swing.JFormattedTextField();
        save_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        edit_btn = new javax.swing.JButton();
        identifiant = new javax.swing.JTextField();
        title_values = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        image_contain = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        poste = new javax.swing.JComboBox<>();
        notification = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(240, 242, 255));

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        jLabel1.setText("Nom : ");

        prename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenameActionPerformed(evt);
            }
        });
        prename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenameKeyReleased(evt);
            }
        });

        jLabel2.setText("Prenom : ");

        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cinKeyReleased(evt);
            }
        });

        jLabel3.setText("Numero CIN : ");

        adresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adresseKeyReleased(evt);
            }
        });

        jLabel4.setText("Adresse : ");

        jLabel5.setText("Date de naissance (YYYY/MM/JJ): ");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });

        jLabel6.setText("Numero telephone : ");

        jLabel7.setText("Poste : ");

        date_naissance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                date_naissanceKeyReleased(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(0, 51, 204));
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("Ajouter");
        save_btn.setBorder(null);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("x");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(51, 204, 0));
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Modifier");
        edit_btn.setBorder(null);
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        title_values.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        title_values.setText("AJOUT DE PERSONNEL");

        image_contain.setText("jLabel9");
        image_contain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_image.png"))); // NOI18N
        jLabel9.setText("Ajouter un image");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        poste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        poste.setBorder(null);

        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(prename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(adresse, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                    .addComponent(date_naissance, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(image_contain, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(poste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title_values, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_values)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prename)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poste, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_contain, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        notification.setText("Veuillez patientez...");
        String nom = name.getText();
        String prenom = this.prename.getText();
        String numCIN = this.cin.getText();
        String adresse = this.adresse.getText();
        String date_naisse = this.date_naissance.getText();
        String telephone = this.phone.getText();
        String poste = (String) this.poste.getSelectedItem();
        
        try {
            Personne p1 = new Personne(nom, prenom, numCIN, date_naisse, poste,adresse,telephone);
            controlPersonne cp = new controlPersonne();
            cp.insert(p1);
            String identifiant = cp.takeLast();
            String chemin = generateQR(identifiant);
            
            //Enregistrernl'image
            try {
                if(filePath!=null) Files.copy(filePath, destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image saved successfully.");
            } 
            catch (IOException ex) {
                System.out.println("No image found");
            }
            cp.SetQR(chemin, identifiant);
            if (filePath!=null && !filePath.equals("")) {
                String pathImage = "/media/profil_image/"+FileName;
                cp.setImage(pathImage, identifiant);
            }
            
            //Creation du conge atribuant au personnel ajouter
            controlCOnges ccg = new controlCOnges();
            ccg.createConge(identifiant);
            
            controlPayment cpm = new controlPayment();
            cpm.createPayment(identifiant);
            
            
            resetAll();
            

            notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checked.png"))); // NOI18N
            notification.setText("Eregistrement resussi");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(personnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        String nom = name.getText();
        String prenom = this.prename.getText();
        String numCIN = this.cin.getText();
        String adresse = this.adresse.getText();
        String date_naisse = this.date_naissance.getText();
        String telephone = this.phone.getText();
        String poste = (String) this.poste.getSelectedItem();
        String id = identifiant.getText();
        
        try {
            Personne p1 = new Personne(nom, prenom, numCIN, date_naisse, poste,adresse,telephone);
            controlPersonne cp = new controlPersonne();
            cp.update(id, p1);
            JOptionPane.showMessageDialog(this, "Mis a jours reussi!!!");
            resetAll();
        } catch (Exception ex) {
            Logger.getLogger(personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        String nom = name.getText();
        name.setText(nom.toUpperCase());
        if(nom.equals("") || nom==null) {
            this.validateValues[0]=0;
            redBorder(name);
        }
        else {this.validateValues[0]=1; CyanBorder(name);}
        vierifyValide();
    }//GEN-LAST:event_nameKeyReleased

    private void cinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyReleased
        String values[] = cin.getText().split("");
        String newValues = removeLast(values);
        if(isInt(values[values.length-1]) && values.length<=12) newValues+=values[values.length-1];
        cin.setText(newValues);
        if (newValues.length()==12){
            String sexFind = newValues.split("")[5];
            if(sexFind.equals("1") || sexFind.equals("0")) {
                this.validateValues[1]=1;
                CyanBorder(cin);
            };
        }
        else {this.validateValues[1]=0; redBorder(cin);}
        vierifyValide();
    }//GEN-LAST:event_cinKeyReleased

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        String values[] = phone.getText().split("");
        String newValues = removeLast(values);
        if(isInt(values[values.length-1]) && values.length<=10) newValues+=values[values.length-1];
        phone.setText(newValues);
        if (newValues.length()==10){
            this.validateValues[4]=1;
            CyanBorder(phone);
        }
        else {this.validateValues[4]=0; redBorder(phone);}
        vierifyValide();
    }//GEN-LAST:event_phoneKeyReleased

    private void adresseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresseKeyReleased
        String adr = adresse.getText();
        if(adr.equals("") || adr==null) {
            this.validateValues[2]=0;
            redBorder(adresse);
        }
        else {this.validateValues[2]=1; CyanBorder(adresse);}
        vierifyValide();
    }//GEN-LAST:event_adresseKeyReleased

    private void prenameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenameKeyReleased
        String content = prename.getText();
        prename.setText(capitalize(content));
        vierifyValide();
    }//GEN-LAST:event_prenameKeyReleased

    private void date_naissanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_naissanceKeyReleased
        String dts = date_naissance.getText();
        if(dts.equals("") || dts==null || !validDate(dts)) {
            this.validateValues[3]=0;
            redBorder(date_naissance);
        }
        else {this.validateValues[3]=1; CyanBorder(date_naissance);}
        vierifyValide();
    }//GEN-LAST:event_date_naissanceKeyReleased

    String FileName;
    File destinationFile;
    Path filePath;
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //traitement d'image
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result==JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            image_contain.setIcon(ResizeImage(path));
            
            String destination = "../Java version 2/src/media/profil_image/";
            String nameFile = selectedFile.getName();
            filePath = selectedFile.toPath();
            destinationFile = new File(destination, nameFile);
            FileName = nameFile;
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    
    //Tout les fonctions que j'ai cree moi meme
    private boolean isInt(String str){
        return str.matches("\\d"); 
    }
    private String removeLast(String[] str){
        String[] result = new String[str.length-1];
        for(int i=0;i<result.length;i++){
            result[i]=str[i];
        }
        return join("", result);
    }
    private boolean validDate(String date){
        String separated[] = date.split("/");
        if(separated.length!=3) return false;
        else{
            if(separated[0].length()!=4 || separated[1].length()!=2 || separated[2].length()!=2) return false;
            return true;
        }
    }

    
    //Pour tout l'ensemble des formulaire
    
    private void resetAll(){
        identifiant.setText("");
        name.setText("");
        prename.setText("");
        cin.setText("");
        adresse.setText("");
        date_naissance.setText("");
        phone.setText("");
    }
    private void chargePosteValue(){
//        String dataPoste[];
        try {
            controlPoste ccp = new controlPoste();
            int nbr = ccp.countPoste();
            String dataPoste[] = new String[nbr];
            ResultSet rs = ccp.getAllPoste();
            int count = 0;
            while (rs.next()){
                dataPoste[count] = rs.getString("nom_poste");
                count++;
            }
            poste.setModel(new javax.swing.DefaultComboBoxModel<>(dataPoste));
        } catch (Exception ex) {
            Logger.getLogger(modal_personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        poste.setBackground(Color.WHITE);
        poste.setBorder(BorderFactory.createEmptyBorder());

    }
    
    private void vierifyValide(){
        if (AllValide()) this.save_btn.setEnabled(true);
        else this.save_btn.setEnabled(false);
    }
    private boolean AllValide(){
        for(int i=0; i<validateValues.length;i++){
           if (this.validateValues[i]==0) return false;

        }
        return true;
    }
    
   private String capitalize(String str){
       if (str==null || str.length()==0) return str;
       return str.substring(0,1).toUpperCase() + str.substring(1);
   }
   
   public void modifActive(){
       edit_btn.setEnabled(true);
       title_values.setText("MODIFICATION PERSONNEL");
   }
   public void fillValues(String id,String nom, String prenom, String num_cin, String adr, String date_naiss,String num_tel,String pst){
       identifiant.setText(id);
       name.setText(nom);
       prename.setText(prenom);
       cin.setText(num_cin);
       adresse.setText(adr);
       date_naissance.setText(date_naiss);
       phone.setText(num_tel);
       poste.setSelectedItem(pst);
   }
   
   //gestion de QR code
    private String generateQR(String id){
    try{
             ByteArrayOutputStream out= QRCode.from(id).to(ImageType.PNG).stream();
             String fname = id;
             String path_name = "../Java version 2/src/media/qrcode/";
             FileOutputStream fout;
             fout = new FileOutputStream(new File(path_name + (fname + ".PNG")));
             fout.write(out.toByteArray());
             fout.flush();
             System.out.println("Created SUccesfully....");
             return "/media/qrcode/" + id + ".PNG";
         }
         catch(Exception e){
             System.out.println(e);

         }
        return null;
    }
    
    public ImageIcon ResizeImage(String imagePath){
        ImageIcon myImage = new ImageIcon(imagePath);
        Image imge = myImage.getImage();
        Image newImage = imge.getScaledInstance(image_contain.getWidth(), image_contain.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    public void redBorder(JTextField txt){
        Border redBorder = new LineBorder(Color.RED);
        txt.setBorder(redBorder);
    }
    public void CyanBorder(JTextField txt){
        Border redBorder = new LineBorder(Color.CYAN);
        txt.setBorder(redBorder);
    }
    
    //fin des fonction
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
            java.util.logging.Logger.getLogger(modal_personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modal_personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modal_personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modal_personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modal_personnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField cin;
    private javax.swing.JFormattedTextField date_naissance;
    private javax.swing.JButton edit_btn;
    private javax.swing.JTextField identifiant;
    private javax.swing.JLabel image_contain;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel notification;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> poste;
    private javax.swing.JTextField prename;
    private javax.swing.JButton save_btn;
    private javax.swing.JLabel title_values;
    // End of variables declaration//GEN-END:variables
}
