/**
 * <h1>Auxiliar</h1>
 * Clase on es guarden les diferents funcions auxiliars que se utilitzen en diferents parts del programa
 * <p>
 *
 *
 * @author  Jose Febrer
 * @version 1.0
 * @since   2018-11-27
 */

package Biblioteques;

import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;
import Classes.Persona;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.TimeZone;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Auxiliar {
    public static String path = "E:\\Carpetes\\Desktop\\";
    public static final int TEST = 100;
    /** FUNCIO PER A LLISTAR ELS EMPLEATS */
    public static void llistar_empleats(JTextField textBusqueda, JList llistaEmpleats){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s %71s", "ID", "NOM", "COGNOM", "DNI", "NOMINA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Persona> iteradorPersones = Arrays.arrayPersones.iterator();
        while (iteradorPersones.hasNext()){
            Persona p = iteradorPersones.next();
            if (p instanceof Empleat && p.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(p);
            }
        }
        llistaEmpleats.setModel(d1m);
    }
    public static void llistar_empleats_taula(JTextField textBusqueda, JTable jTable1){
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount (0);
            Iterator<Persona> iteradorPersones = Arrays.arrayPersones.iterator();
            while(iteradorPersones.hasNext()){
                Persona p = iteradorPersones.next();
                String persona_cerca = p.toString().toLowerCase();
                if (p instanceof Empleat && persona_cerca.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {p.getId(),p.getNom(),p.getCognom1(),p.getCognom2(),p.getSexe(),p.getTipusDocument(),p.getDNI(),p.getDataNaixement(),p.getCodiPostal(),p.getProvincia(),
                    p.getCiutat(),p.getAdreca(),p.getEmail(),p.getTelefon(),((Empleat)p).getNomina()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar empleats en jTable: " + e);
        }
        
    }
    
    public static void llistar_atraccions_taula(JTextField textBusqueda, JTable jTable2){
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable2.getModel();
            tabla.setRowCount (0);
            Iterator<Atraccio> iteradorModificar = Atraccio.arrayAtraccio.iterator();
            while(iteradorModificar.hasNext()){
                Atraccio atraccio_aux = iteradorModificar.next();
                String atraccio_final = atraccio_aux.toString().toLowerCase();
                if (atraccio_final.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {atraccio_aux.getIdA(),atraccio_aux.getNom(),atraccio_aux.getTipusAtraccio(),atraccio_aux.getDataInauguracio(),atraccio_aux.getAlturaMin(),atraccio_aux.getAccessibilitat(),atraccio_aux.getAccesExpress()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar atraccions en jTable: " + e);
        }
        
    }

    /**FUNCIO PER A CARREGAR DADES ALS DIFERENTS CAMPS DE TEXT PER A MODIFICAR-LES*/
    public static int carregar_dades_empleats(JList llistaEmpleats, JFrame frame_llistaEmpleats, JTextField nomText, JTextField cognomsText, JTextField dniText, JTextField nominaText, int seleccio){
        Object indices2=llistaEmpleats.getSelectedValue();  //Es guarda la seleccio en un objecte
        IO.imprimirTI("Contingut: "+ (indices2));
        if (indices2 == null){  //Es comprova si hi ha algo seleccionat
            JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
        }else {
            try { //Si hi ha algo seleccionat, se intenten carregar les dades als diferents camps de text
                nomText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom());
                cognomsText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getCognom1());
                dniText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getDNI());
                nominaText.setText(((Empleat)Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2))).getNomina());
                seleccio = Arrays.arrayPersones.indexOf(indices2);
                IO.imprimirTI("Element seleccionat: " + seleccio);
            } catch (Exception error) { //Si retorna algun tipus de error, elimina qualsevol tipus de seleccio activa i buida 
                IO.imprimirTI("Error al carregar empleat: " + error);
                JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
                seleccio = -1;
                nomText.setText("");
                cognomsText.setText("");
                dniText.setText("");
                nominaText.setText("");
                Auxiliar.log("Error al carregar empleat: " + error);
            }
        }
        return seleccio;
    }
    public static int carregar_dades_empleats_taula(JButton carregar, int seleccio, JFrame frame, JTable jTable1, JTextField nomText, JTextField cognomsText,JTextField segonCognom,
            JComboBox sexe,JComboBox tipDocument,JTextField dniText,JTextField  dataNaixement,JTextField codiPostal,JTextField provincia,JTextField ciutat,JTextField adreca,JTextField  email,
            JTextField telefon, JTextField nominaText){
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona un empleat");
        }else{
            int element = (int)elementmodificat;
            //IO.imprimirTI("Seleccio: " + element);
            seleccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayPersones.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayPersones.get(i).getId()){
                    seleccio = i;
                    trobat = true;
                    IO.imprimirT("Seleccio: " + seleccio);
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    logError("Error al seleccionar un empleat a carregar: " + e);
                }

            }
            if (seleccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    nomText.setText(Arrays.arrayPersones.get(seleccio).getNom());
                    cognomsText.setText(Arrays.arrayPersones.get(seleccio).getCognom1());
                    segonCognom.setText(Arrays.arrayPersones.get(seleccio).getCognom2());
                    sexe.setSelectedItem(Arrays.arrayPersones.get(seleccio).getSexe());
                    tipDocument.setSelectedItem(Arrays.arrayPersones.get(seleccio).getTipusDocument());
                    dniText.setText(Arrays.arrayPersones.get(seleccio).getDNI());
                    dataNaixement.setText(Arrays.arrayPersones.get(seleccio).getDataNaixement());
                    codiPostal.setText(Arrays.arrayPersones.get(seleccio).getCodiPostal());
                    provincia.setText(Arrays.arrayPersones.get(seleccio).getProvincia());
                    ciutat.setText(Arrays.arrayPersones.get(seleccio).getCiutat());
                    adreca.setText(Arrays.arrayPersones.get(seleccio).getAdreca());
                    email.setText(Arrays.arrayPersones.get(seleccio).getEmail());
                    telefon.setText(Arrays.arrayPersones.get(seleccio).getTelefon());
                    nominaText.setText(((Empleat)Arrays.arrayPersones.get(seleccio)).getNomina());
                }catch (Exception e){
                    logError("Error al carrgar les dades de un empleat: " + e);
                }
            
            }
          }

        return seleccio;
    }
    public static void llistar_Atraccions(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %30s %35s %30s %30s %30s %30s", "ID", "NOM", "TIPUS", "DATA INAUGURACIO", "ALTURA MIN", "ACCESSIBILITAT", "ACCES EXPRESS");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Atraccio> iteradorAtraccions = Atraccio.arrayAtraccio.iterator();
        while (iteradorAtraccions.hasNext()){
            Atraccio a = iteradorAtraccions.next();
            if (a.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(a);
            }
        }
        llistaAtraccions.setModel(d1m);
    }

    public static void llistar_Assignacio(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s", "ID", "EMPLEAT", "ATRACCIO", "DATA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Assignacio> iteradorAssignacions = Arrays.arrayAssignacio.iterator();
        while (iteradorAssignacions.hasNext()){
            Assignacio assign = iteradorAssignacions.next();
            if (assign.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(assign);
            }
        }
        llistaAtraccions.setModel(d1m);
    }
    public static void llistar_assignacio_taula(JTextField textBusqueda, JTable jTable1){
        
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount (0);
            Iterator<Assignacio> iteratorAssign = Arrays.arrayAssignacio.iterator();
            while(iteratorAssign.hasNext()){
                Assignacio assign_aux = iteratorAssign.next();
                String assignacio_busqueda = assign_aux.toString().toLowerCase();
                if (assignacio_busqueda.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {assign_aux.getId(),assign_aux.getEmpleat().getNom(),assign_aux.getEmpleat().getCognom1(),assign_aux.getEmpleat().getDNI(),assign_aux.getAtraccio().getNom(),assign_aux.getDataInici(),assign_aux.getDataFi()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar assignacions en jTable: " + e);
        }        
    }
    
    public static int carregar_dades_assign_taula(JButton carregar, int seleccio, JFrame frame, JTable jTable1, JDateChooser data1, JDateChooser data3){
        //int elements [];
        //frame.getContentPane().add(carregar);
        //elements = jTable1.getSelectedRows();
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona una assignació");
        }else{
            int element = (int)elementmodificat;
            seleccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayAssignacio.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayAssignacio.get(i).getId()){
                    seleccio = i;
                    IO.imprimirTI("Seleccio: " + seleccio);
                    trobat = true;
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    logError("Error al seleccionar una assignacio a carregar: " + e);
                }

            }
            if (seleccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                   data1.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(Arrays.arrayAssignacio.get(seleccio).getDataInici()));
                   //dataText.setText(Arrays.arrayAssignacio.get(seleccio).getDataInici()); 
                   data3.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(Arrays.arrayAssignacio.get(seleccio).getDataFi()));
                }catch (Exception e){
                    logError("Error al carrgar les dades de una assignacio: " + e);
                }
            }
          }

        return seleccio;
    }


    public static void log(String s) {
        String currentTime = dataActual();
        try{
            FileWriter aWriter = new FileWriter(path + "log.txt", true);
            aWriter.write(currentTime + " - " + s + "\n");
            aWriter.flush();
            aWriter.close();
        }catch(Exception e){
            IO.imprimirT("Error la registrar logs: " + e);
            logError("Error al registrar logs: " + e);
        }
    }
    public static void logError(String s) {
        String currentTime = dataActual();
        try{
            FileWriter aWriter = new FileWriter(path + "logError.txt", true);
            aWriter.write(currentTime + " - " + s + "\n");
            aWriter.flush();
            aWriter.close();
        }catch(Exception e){
            IO.imprimirT("Error la registrar logs: " + e);
        }
    }
    
    public static String dataActual(){
        TimeZone tz = TimeZone.getTimeZone("CET"); // or PST, MID, etc ...
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        return currentTime;
    }
    
    public static void generarAtraccions(){
        Random rand = new Random(); 
        for (int i=0; i<TEST;i++){
            int data1 = rand.nextInt((31 - 1) + 1) + 1;
            int data2 = rand.nextInt((12 - 1) + 1) + 1;
            int data3 = rand.nextInt((3000 - 1000) + 1) + 1;
            Atraccio.arrayAtraccio.add(new Atraccio("NomAtraccio"+(i+1),"TipusAtraccio"+(i+1),String.valueOf(data1) + "/" + String.valueOf(data2) + "/" + String.valueOf(data3),"AlturaMinima"+(i+1),"Accessibilitat"+(i+1),"Express"+(i+1)));       
        }
    }
    
    public static void generarEmpleats(){
        for (int i=0; i<TEST;i++){
            Arrays.arrayPersones.add(new Empleat("nom"+(i+1),"cognom"+(i+1),"cognom2"+(i+1),"dni"+(i+1),"passw"+(i+1),"email"+(i+1),"dataNaixement"+(i+1),"adreça"+(i+1), 
                    "ciutat"+(i+1),"provincia"+(i+1),"codiPostal"+(i+1),"tipDoc"+(i+1),"sexe"+(i+1),"telefon"+(i+1),"idRol"+(i+1),"dataCreacio"+(i+1),"hash"+(i+1),
                    "nomina"+(i+1),"iban"+(i+1),"horari"+(i+1)));
        }
    }
    
    public static void generarAssignacions(){
        Random rand = new Random();
        for (int i=0; i<(TEST-50);i++){
            int data1 = rand.nextInt((31 - 1) + 1) + 1;
            int data2 = rand.nextInt((12 - 1) + 1) + 1;
            int data3 = rand.nextInt((3000 - 1000) + 1) + 1;
            int data4 = rand.nextInt((31 - 1) + 1) + 1;
            int data5 = rand.nextInt((12 - 1) + 1) + 1;
            int data6 = rand.nextInt((3000 - 1000) + 1) + 1;
            Arrays.arrayAssignacio.add(new Assignacio((Empleat) Arrays.arrayPersones.get(i), Atraccio.arrayAtraccio.get(i), String.valueOf(data1) + "/" + String.valueOf(data2) + "/" + String.valueOf(data3), String.valueOf(data4) + "/" +  String.valueOf(data5) + "/" + String.valueOf(data6)));
            ((Empleat)Arrays.arrayPersones.get(i)).setAssignat();
            Atraccio.arrayAtraccio.get(i).setAssignat();
        }
    }
    
    public static int seleccionarEmpleatAssignacio(int seleccio_empleat, JTable jTable1, JFrame frame, JLabel empleatSeleccionat){
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
            Auxiliar.logError("Error al seleccionar un empleat en assignacio: " + e);
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona un empleat");
        }else{
            int element = (int)elementmodificat;
            IO.imprimirTI("Seleccio: " + element);
            seleccio_empleat = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayPersones.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayPersones.get(i).getId()){
                        seleccio_empleat = i;
                        trobat = true;
                    }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    Auxiliar.logError("Error al buscar el empleat a seleccionar en registre_assignacio: " + e);
                }

            }
            if (seleccio_empleat ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    empleatSeleccionat.setText("Empleat seleccionat: " + Arrays.arrayPersones.get(seleccio_empleat).getNom());
                }catch (Exception error){
                    Auxiliar.logError("Error al mostrar el empleat seleccionat en registrar_assignacio: " + error);
                }

            }
        }
        return seleccio_empleat;
    }
        public static int seleccionarAtraccioAssignacio(int seleccio_atraccio, JTable jTable2, JFrame frame, JLabel atraccioSeleccionada){
        Object elementmodificat = null;
        try{
            elementmodificat = jTable2.getValueAt(jTable2.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
            Auxiliar.logError("Error al seleccionar una atraccio en assignacio: " + e);
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona una atraccio");
        }else{
            String element = (String)elementmodificat;
            IO.imprimirTI("Seleccio: " + element);
            seleccio_atraccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Atraccio.arrayAtraccio.size() && trobat == false; i++){
                try{
                    if(element.equals(Atraccio.arrayAtraccio.get(i).getIdA())){
                        seleccio_atraccio = i;
                        trobat = true;
                    }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    Auxiliar.logError("Error al buscar la atraccio a seleccionar en registre_assignacio: " + e);
                }

            }
            if (seleccio_atraccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    atraccioSeleccionada.setText("Atracció seleccionada: " + Atraccio.arrayAtraccio.get(seleccio_atraccio).getNom());
                }catch (Exception error){
                    IO.imprimirTI("Error al seleccionar empleat assignacio: " + error);
                    Auxiliar.logError("Error al mostrar la atraccio seleccionada en registrar_assignacio: " + error);
                }

            }
        }
        return seleccio_atraccio;
    }
            
    public static void generarCSV(){
        try {
            //BufferedWriter out = null;
            //out = new BufferedWriter(new FileWriter("/home/alumne/Escritorio/github/validacio_tickets/empleats.csv"));
            PrintStream writer = new PrintStream("/home/alumne/Escritorio/Assignacions_AE/empleats.csv");
            Iterator<Persona> iteratorPerso = Arrays.arrayPersones.iterator();
                while(iteratorPerso.hasNext()){
                  Persona persona_aux = iteratorPerso.next();
                    writer.println(persona_aux.getId()+","+persona_aux.getNom()+","+persona_aux.getCognom2()+","
                    +persona_aux.getDataNaixement()+","+persona_aux.getTipusDocument()+","+persona_aux.getTipusDocument()+","
                    +persona_aux.getSexe()+","+persona_aux.getProvincia()+","+persona_aux.getCodiPostal()+","
                    +persona_aux.getAdreca()+","+persona_aux.getCiutat()+","+persona_aux.getTelefon()+","
                    +persona_aux.getEmail()+","+persona_aux.getHash());
                }
                writer.close();
            
        }catch(Exception e){
            IO.imprimirT("Error la registrar logs: " + e);
        }
    }
}
