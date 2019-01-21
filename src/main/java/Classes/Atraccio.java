package Classes;

import Biblioteques.Auxiliar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

/**
 *Declararem els atributs i crearem els getters i els seters amb els seus tipus de dades corresponents.
 * @author Manu
 */
public class Atraccio {
    /*Atributs*/
    private String idA;
    private String nom;                 //variable string
    private String tipusAtraccio;       //variable string
    private String descripcioAtraccio;  //variable string  
    private String dataInauguracio;     //variable string
    private String duracioViatge;          //variable int
    private String alturamin;              //variable int
    private String alturamax;              //variable int
    private String accessibilitat;      //variable string
    private String accesexpress;        //variable string
    private boolean assignat;
    private String data_creacio_registre;
    
    private static int totalAtraccions = 0; //variable de classe
    private static int count = 0;
    
    /*Constuctors*/
    
    
    public Atraccio (String nomAtraccio, String tipusAtraccio,String dataInnauguracio,String alturaMin, String accessibilitat, String Express){ 
        this.idA = "IdA "+count++;
        nom = nomAtraccio;
        this.tipusAtraccio = tipusAtraccio;
        dataInauguracio = dataInnauguracio;
        alturamin = alturaMin;
        this.accessibilitat = accessibilitat;
        accesexpress = Express;
        assignat = false;
        data_creacio_registre = Auxiliar.dataActual();
    }

    public static ArrayList<Atraccio> arrayAtraccio = new ArrayList<Atraccio>();
    
    
    
    /* Variable de classe */
    public static int getTotalAtraccions() {
        return totalAtraccions;
    }
    
    /*Getters*/
    public String getIdA(){
        return idA;
    }
    public String getNom(){
        return nom;
    }
    public String getTipusAtraccio(){
        return tipusAtraccio;
    }
    public String getDescripcioAtraccio(){
        return descripcioAtraccio;
    }
    public String getDataInauguracio(){
        return dataInauguracio;
    }
    public String getDuracioViatge(){
        return duracioViatge;
    }
    public String getAlturaMin(){
        return alturamin;
    }
    public String getAlturaMax(){
        return alturamax;
    }
    public String getAccessibilitat(){
        return accessibilitat;
    }
    public String getAccesExpress(){
        return accesexpress;
    }
    public boolean getAssignat(){
        return assignat;
    }
    
    public String getDataCreacioRegistre(){
        return data_creacio_registre;
    }
    
    
    /*Setters*/

   
    
    
    /**
     * 
     * @param name 
     */
    public void setNom(String name){
        nom = name;
        
    }
    /**
     * 
     * @param type 
     */
    public void setTipuisAtraccio(String type){
        tipusAtraccio = type;
        
    }
    /**
     * 
     * @param description
     */
    public void setDescripcioAtraccio(String description){
        descripcioAtraccio = description;
        
    }
    /**
     * 
     * @param date
     */
    public void setDataInnauguracio(String date){
        dataInauguracio = date;
        
    }
    /**
     * 
     * @param Duration 
     */
    public void setDuracioViatge(String Duration){
        duracioViatge = Duration;
        
    }
    /**
     * 
     * @param Altminima 
     */
    public void setAlturaMin(String Altminima){
        alturamin = Altminima;
        
    }
    /**
     * 
     * @param Altmaxima 
     */
    public void setAlturaMax(String Altmaxima){
        alturamax = Altmaxima;
        
    }
    /**
     * 
     * @param accessible 
     */
    public void setAccessibilitat(String accessible){
        accessibilitat = accessible;
        
    }
    /**
     * 
     * @param express 
     */
    public void setAccesExpress(String express){
        accesexpress = express;
        
    }
    
    public void setAssignat(){
        assignat = true;
    }
    
    public void eliminarAssign(){
        assignat = false;
    }
    
        /* MÈTODES */
    public static int augmentarTotalAtraccions() {
        totalAtraccions = totalAtraccions+1;
        return totalAtraccions;
    }
    
    public static int disminuirTotalAtraccions() {
        totalAtraccions--;
        return totalAtraccions;
    }
    
    @Override
    public String toString() {
        String dadesAtraccio = String.format("%s %27s %30s %30s %39s %41s %47s %s",idA, nom, tipusAtraccio, dataInauguracio, alturamin, accessibilitat, accesexpress, data_creacio_registre);
        return dadesAtraccio;
    }
    
    
        
    }