/**
 * Classe filla de Persona
 */
package Classes;

import Biblioteques.Auxiliar;

public class Assignacio { //Comentaris al marge per als atributs
    private int id;
    private Empleat empleat;
    private Atraccio atraccio;
    private String data_inici_asign;
    private String data_fi_asign;
    private static int nextId;
    private String data_creacio_registre;

    public Assignacio(Empleat e, Atraccio a, String d, String d2) {
        empleat = e;
        atraccio = a;
        data_inici_asign = d;
        data_fi_asign = d2;
        id = nextId;
        nextId++;
        data_creacio_registre = Auxiliar.dataActual();
    }

    /** GETTERS */
    public int getId(){
        return id;
    }
    
    public Empleat getEmpleat() {
        return empleat;
    }

    public Atraccio getAtraccio() {
        return atraccio;
    }

    public String getDataInici(){
        return data_inici_asign;
    }
    
    public String getDataFi(){
        return data_fi_asign;
    }
    
    public String getDataCreacioRegistre(){
        return data_creacio_registre;
    }

    /** SETTERS */
    public void setEmpleat(Empleat e){
        empleat = e;
    }

    public void setAtraccio(Atraccio a){
        atraccio = a;
    }

    public void setData(String d){
        data_inici_asign = d;
    }
    
    public void setDataFi(String d2){
        data_fi_asign = d2;
    }

    /** METODES */

    @Override
    public String toString() {
        String imprimir = String.format("%s %20s %20s %70s %70s", id, empleat.getNom(), empleat.getDNI(), atraccio.getNom(), data_inici_asign);
        return imprimir;
    }


}