/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Atraccions;

import Classes.Atraccio;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import static Main.config.carregarConf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Manu
 */
public class ModificarAtraccioForm extends javax.swing.JFrame {

    /**
     * Creates new form LlistarAtraccioForm
     */
    int elements [];
    int posicio = -1;
    public ModificarAtraccioForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Atraccio");
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
        data.setDateFormatString("dd/MM/yyyy");
        textCercar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Enrrere = new javax.swing.JButton();
        Tipus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AlturaMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Accessibilitat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Express = new javax.swing.JTextField();
        Nom = new javax.swing.JTextField();
        Modifica = new javax.swing.JButton();
        Carregar = new javax.swing.JButton();
        textCercar = new javax.swing.JTextField();
        cercarButton = new javax.swing.JButton();
        data = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "Tipus", "Data Innauguracio", "Altura Min", "Accessibilitat", "Express"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar atraccions");

        Enrrere.setText("Enrrere");
        Enrrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrrereActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Tipus");

        jLabel4.setText("Data I.");

        jLabel5.setText("Altura min");

        jLabel6.setText("Accessibilitat");

        jLabel7.setText("Express");

        Modifica.setText("Modifica");
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        Carregar.setText("Carrega");
        Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarActionPerformed(evt);
            }
        });

        cercarButton.setText("Cercar");
        cercarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textCercar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cercarButton)
                        .addGap(0, 521, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Express, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AlturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(39, 39, 39)
                                            .addComponent(Accessibilitat, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tipus, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Carregar)
                        .addGap(18, 18, 18)
                        .addComponent(Modifica)
                        .addGap(18, 18, 18)
                        .addComponent(Enrrere))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cercarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCercar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accessibilitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Express, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enrrere)
                    .addComponent(Modifica)
                    .addComponent(Carregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnrrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrrereActionPerformed
        this.setVisible(false);
        MenuAtraccioForm menuAtraccio = new MenuAtraccioForm();
        menuAtraccio.setVisible(true);
    }//GEN-LAST:event_EnrrereActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void CarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarActionPerformed
        try{
            getContentPane().add(Carregar);
            elements = jTable1.getSelectedRows();
            Object elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            posicio = -1;
            boolean trobat = false;
            for (int i = 0; i<Atraccio.arrayAtraccio.size() && trobat == false; i++){
                if(Atraccio.arrayAtraccio.get(i).getIdA().equals(elementmodificat)){
                    posicio = i;
                    trobat = true;
                }
            }
            if (posicio ==-1) JOptionPane.showMessageDialog(null, "no s'hapogut modificar");
            else {
            Nom.setText(Atraccio.arrayAtraccio.get(posicio).getNom());
            Tipus.setText(Atraccio.arrayAtraccio.get(posicio).getTipusAtraccio());
            //DataIn.setText(Atraccio.arrayAtraccio.get(posicio).getDataInauguracio());
            AlturaMin.setText(Atraccio.arrayAtraccio.get(posicio).getAlturaMin());
            Accessibilitat.setText(Atraccio.arrayAtraccio.get(posicio).getAccessibilitat());
            Express.setText(Atraccio.arrayAtraccio.get(posicio).getAccesExpress());
            data.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(Atraccio.arrayAtraccio.get(posicio).getDataInauguracio()));
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Selecciona una atraccio");
            Auxiliar.logError("Error al carregar dades en Atraccio-->ModificarAtraccioForm: " + e);
        }
        
    }//GEN-LAST:event_CarregarActionPerformed

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        /*Nom.getText();
        Tipus.getText();
        DataIn.getText();   
        AlturaMin.getText();
        Accessibilitat.getText();
        Express.getText();*/
        if(posicio == -1){
            JOptionPane.showMessageDialog(null, "Carrega una atraccio");
        }else{
            try{
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String anticNom = Atraccio.arrayAtraccio.get(elements[0]).getNom();
                String anticTipus = Atraccio.arrayAtraccio.get(elements[0]).getTipusAtraccio();
                String anticDataI = Atraccio.arrayAtraccio.get(elements[0]).getDataInauguracio();
                String anticAlturamin = Atraccio.arrayAtraccio.get(elements[0]).getAlturaMin();
                String anticAcces = Atraccio.arrayAtraccio.get(elements[0]).getAccessibilitat();
                String anticExpress = Atraccio.arrayAtraccio.get(elements[0]).getAccesExpress();
                
                Date time = data.getCalendar().getTime();  
                String data2 = df.format(time);
                
                Atraccio.arrayAtraccio.get(elements[0]).setNom(Nom.getText());
                Atraccio.arrayAtraccio.get(elements[0]).setTipuisAtraccio(Tipus.getText());
                Atraccio.arrayAtraccio.get(elements[0]).setDataInnauguracio(data2);
                Atraccio.arrayAtraccio.get(elements[0]).setAlturaMin(AlturaMin.getText());
                Atraccio.arrayAtraccio.get(elements[0]).setAccessibilitat(Accessibilitat.getText());
                Atraccio.arrayAtraccio.get(elements[0]).setAccesExpress(Express.getText());
                Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
                Auxiliar.log("Atraccio modificada: " + anticNom + " | " + anticTipus + " | " + anticDataI + " | " + anticAlturamin + " | " + anticAcces + " | " + anticExpress + "\nA: " + Atraccio.arrayAtraccio.get(elements[0]).getNom() + " | " + Atraccio.arrayAtraccio.get(elements[0]).getTipusAtraccio() + " | " + Atraccio.arrayAtraccio.get(elements[0]).getDataInauguracio() + " | " + Atraccio.arrayAtraccio.get(elements[0]).getAlturaMin() + " | " + Atraccio.arrayAtraccio.get(elements[0]).getAccessibilitat() + " | " + Atraccio.arrayAtraccio.get(elements[0]).getAccesExpress());
                JOptionPane.showMessageDialog(this, "Atraccio modificada correctament");
            }catch (Exception e){
                IO.imprimirTI("Error al modificar atraccio: " + e);
                Auxiliar.logError("Error al modificar atraccio: " + e);
            }
        }
    }//GEN-LAST:event_ModificaActionPerformed

    private void cercarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercarButtonActionPerformed
       //Coger el campo compararlo con los elementos que estan almacenados (no se si con el nombre o con todos los posibles campos) una vez los comparas los sacas en la tabla
       //despues de eso saber como coger el objeto y cargar sus datos en los text fields.
        Auxiliar.llistar_atraccions_taula(textCercar, jTable1);
    }//GEN-LAST:event_cercarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAtraccioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accessibilitat;
    private javax.swing.JTextField AlturaMin;
    private javax.swing.JButton Carregar;
    private javax.swing.JButton Enrrere;
    private javax.swing.JTextField Express;
    private javax.swing.JButton Modifica;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Tipus;
    private javax.swing.JButton cercarButton;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textCercar;
    // End of variables declaration//GEN-END:variables
}