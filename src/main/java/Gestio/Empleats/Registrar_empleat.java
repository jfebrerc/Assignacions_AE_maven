/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Empleats;
import Biblioteques.Arrays;
import Biblioteques.IO;
import Classes.Empleat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Biblioteques.Auxiliar;
import static Main.config.carregarConf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;
/**
 *
 * @author Usuari
 */
public class Registrar_empleat extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_empleat
     */
    public Registrar_empleat() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar empleats");
        try{
            getContentPane().setBackground(Color.decode(Main.config.carregarConf()[0]));
        }catch (Exception e){
            IO.imprimirTI("Error al asignar color: " + e);
        }
        try{
            Component[] components1=getContentPane().getComponents();
            Main.config.setUIFont(new Font(carregarConf()[1], Integer.valueOf(carregarConf()[2]), Integer.valueOf(carregarConf()[3])), components1);            
        }catch(Exception e){
            IO.imprimirTI("Error al carregar la font: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        cognomnsText = new javax.swing.JTextField();
        dniText = new javax.swing.JTextField();
        nominaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        REGISTRARButton = new javax.swing.JButton();
        buidarButton = new javax.swing.JButton();
        ENREREButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        segonCognom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipusDocument = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ciutat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        codiPostal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adreca = new javax.swing.JTextField();
        dataNaixement = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        sexe = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        css = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        iban = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        especialitat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        carrec = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        dataFiContracte = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        dataIniciContracte1 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        Horari = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        dataCreacioContracte = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTA EMPLEATS");

        jLabel2.setText("Nom");

        jLabel4.setText("Num Document");

        jLabel5.setText("Num Nomina");

        nomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextActionPerformed(evt);
            }
        });

        cognomnsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cognomnsTextActionPerformed(evt);
            }
        });

        dniText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Primer Cognom");

        REGISTRARButton.setText("REGISTRAR");
        REGISTRARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARButtonActionPerformed(evt);
            }
        });

        buidarButton.setText("BUIDAR");
        buidarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buidarButtonActionPerformed(evt);
            }
        });

        ENREREButton.setText("ENRERE");
        ENREREButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENREREButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Segon Cognom");

        segonCognom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segonCognomActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipus Document");

        tipusDocument.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "NIE" }));

        jLabel8.setText("Provincia");

        jLabel9.setText("Ciutat");

        ciutat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciutatActionPerformed(evt);
            }
        });

        jLabel10.setText("Codi Postal");

        codiPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiPostalActionPerformed(evt);
            }
        });

        jLabel11.setText("Adreça");

        jLabel12.setText("Data de Naixement");

        dataNaixement.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dataNaixement.setToolTipText("");
        dataNaixement.setVerifyInputWhenFocusTarget(false);

        jLabel13.setText("Sexe");

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Dona" }));

        jLabel14.setText("Telefon");

        telefon.setToolTipText("");

        jLabel15.setText("Email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel16.setText("Password");

        jLabel17.setText("Codi S.S");

        jLabel18.setText("IBAN");

        jLabel19.setText("Especialitat");

        jLabel20.setText("Carrec");

        jLabel21.setText("Data Inici Contracte");

        dataFiContracte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dataFiContracte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFiContracteActionPerformed(evt);
            }
        });

        jLabel22.setText("Data Fi Contracte");

        dataIniciContracte1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel23.setText("Horari");

        Horari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mati", "Tarde", "Nit" }));

        jLabel24.setText("Data creacio Registre");

        dataCreacioContracte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dataCreacioContracte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCreacioContracteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(REGISTRARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buidarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel19))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codiPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(522, 522, 522))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(69, 69, 69)
                                        .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tipusDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel16)))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cognomnsText)
                                    .addComponent(adreca)
                                    .addComponent(dniText, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(password))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataIniciContracte1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataFiContracte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sexe, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)
                                            .addComponent(segonCognom, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(dataCreacioContracte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(dataNaixement, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(provincia)
                                                .addComponent(telefon)
                                                .addComponent(nominaText)
                                                .addComponent(carrec, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                            .addComponent(Horari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(especialitat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(css, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ciutat, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cognomnsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(dataNaixement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segonCognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tipusDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(adreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ciutat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(css, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(especialitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(carrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(dataFiContracte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(dataIniciContracte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(Horari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(dataCreacioContracte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buidarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REGISTRARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextActionPerformed

    private void REGISTRARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARButtonActionPerformed
        String idRol="2";
        String hash="";
        if (nomText.getText().isEmpty() || cognomnsText.getText().isEmpty() || dniText.getText().isEmpty() || nominaText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Error: Hi ha algun camp per a omplir");
                    IO.imprimirTI("Se ha intentat registrar un empleat en algun camp buit");
                }else {
                    try {
                        Arrays.arrayPersones.add(new Empleat(nomText.getText(), cognomnsText.getText(),segonCognom.getText(),dniText.getText(),password.getText(),email.getText(),
                        dataNaixement.getText(),adreca.getText(),ciutat.getText(),provincia.getText(),codiPostal.getText(),tipusDocument.getSelectedItem().toString(),sexe.getSelectedItem().toString(),telefon.getText(),
                        idRol,dataCreacioContracte.getText(),hash,nominaText.getText(),iban.getText(),Horari.getName()));
                        IO.imprimirTI(((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).toString());
                        IO.imprimirTI("Se ha registrat un empleat");
                        JOptionPane.showMessageDialog(this, "Se ha donat de alta correctament a " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getNom());
                        Auxiliar.log("Empleat registrat: " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getNom() + " " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getCognom1() + " " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getDNI());
                        this.setVisible(false);
                        Menu_empleats menuE = new Menu_empleats();
                        menuE.setVisible(true);
                        IO.imprimirTI("-------------------------------------------------------------------------");
                    } catch (Exception error) {
                        IO.imprimirTI("Error al registrar empleat: "+error);
                        Auxiliar.log("Error al registrar un empleat: " + error);
                    }
                }
    }//GEN-LAST:event_REGISTRARButtonActionPerformed

    private void ENREREButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENREREButtonActionPerformed
        this.setVisible(false);
        Menu_empleats menuE = new Menu_empleats();
        menuE.setVisible(true);
    }//GEN-LAST:event_ENREREButtonActionPerformed

    private void buidarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buidarButtonActionPerformed
        nomText.setText("");
        cognomnsText.setText("");
        dniText.setText("");
        nominaText.setText("");
    }//GEN-LAST:event_buidarButtonActionPerformed

    private void cognomnsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cognomnsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cognomnsTextActionPerformed

    private void dniTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniTextActionPerformed

    private void segonCognomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segonCognomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segonCognomActionPerformed

    private void codiPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codiPostalActionPerformed

    private void ciutatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciutatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciutatActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void dataFiContracteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFiContracteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFiContracteActionPerformed

    private void dataCreacioContracteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCreacioContracteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCreacioContracteActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_empleat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENREREButton;
    private javax.swing.JComboBox<String> Horari;
    private javax.swing.JButton REGISTRARButton;
    private javax.swing.JTextField adreca;
    private javax.swing.JButton buidarButton;
    private javax.swing.JTextField carrec;
    private javax.swing.JTextField ciutat;
    private javax.swing.JTextField codiPostal;
    private javax.swing.JTextField cognomnsText;
    private javax.swing.JTextField css;
    private javax.swing.JFormattedTextField dataCreacioContracte;
    private javax.swing.JFormattedTextField dataFiContracte;
    private javax.swing.JFormattedTextField dataIniciContracte1;
    private javax.swing.JFormattedTextField dataNaixement;
    private javax.swing.JTextField dniText;
    private javax.swing.JTextField email;
    private javax.swing.JTextField especialitat;
    private javax.swing.JTextField iban;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomText;
    private javax.swing.JTextField nominaText;
    private javax.swing.JTextField password;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField segonCognom;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JTextField telefon;
    private javax.swing.JComboBox<String> tipusDocument;
    // End of variables declaration//GEN-END:variables
}
