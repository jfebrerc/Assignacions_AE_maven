/** Classe principal de persones */

package Classes;

import Biblioteques.Auxiliar;

public class Persona {
    
    /* Atributs */
    private static int nextId;
    private String nom;
    private String cognom1;
    private String cognom2;
    private int id;
    private String passwd;
    private String DNI;
    private String email;
    private String dataNaixement;
    private String adreca;
    private String ciutat;
    private String provincia;
    private String codiPostal;
    private String tipusDocument;
    private String sexe;
    private String telefon;
    private String idRol;
    private String dataCreacioRegistre;
    private String hash;

    /** CONSTRUCTOR */
    public Persona(String nomc, String cognom1c,String cognom2c, String dnic, String passwdc, String emailc, String dataNaixementc, String adrecac, String ciutatc, String provinciac, String codiPostalc,
                    String tipusDocumentc,String sexec,String telefonc,String idRolc,String dataCreacioRegistrec,String hashc) {
        
        nom = nomc;
        cognom1= cognom1c;
        cognom2=cognom2c;
        DNI=dnic;
        id = nextId;
        nextId++;
        email=emailc;
        dataNaixement=dataNaixementc;
        adreca=adrecac;
        ciutat=ciutatc;
        provincia=provinciac;
        codiPostal=codiPostalc;
        tipusDocument=tipusDocumentc;
        sexe=sexec;
        telefon=telefonc;
        idRol="2";
        dataCreacioRegistre=dataCreacioRegistrec;
        hash=Auxiliar.generarHash();
        passwd = passwdc;
    }


    /** SETTERS */
    public void setNom(String n) {
        nom = n;
    }

    public void setCognom1(String c1) {
        cognom1 = c1;
    }

    public void setCognom2(String c2) {
        cognom2 = c2;
    }

    public void setPasswd(String pwd) {
        passwd = pwd;
    }

    public void setDNI(String dnix){
        DNI = dnix;
    }

    public void setId(int n){
        id=n;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public void setTipusDocument(String tipusDocument) {
        this.tipusDocument = tipusDocument;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public void setDataCreacioRegistre(String dataCreacioRegistre) {
        this.dataCreacioRegistre = dataCreacioRegistre;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    /** GETTERS */
    public String getNom() { return nom; }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public int getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getDNI(){
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    public String getAdreca() {
        return adreca;
    }

    public String getCiutat() {
        return ciutat;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public String getTipusDocument() {
        return tipusDocument;
    }

    public String getSexe() {
        return sexe;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getIdRol() {
        return idRol;
    }

    public String getDataCreacioRegistre() {
        return dataCreacioRegistre;
    }

    public String getHash() {
        return hash;
    }

    /** METODES */
    @Override
    public String toString() {
        String imprimir = String.format("|%-20d|", getNom())+getCognom1()+getCognom2()+getDNI()+getId()+getIdRol()+getAdreca()+getCiutat()+getCodiPostal()+getDataNaixement()+getDataCreacioRegistre()
                +getDataNaixement()+getEmail()+getHash()+getIdRol()+getPasswd()+getProvincia()+getSexe()+getTelefon()+getTipusDocument();
        return imprimir;
    }
    
}
//AFEGIR ID
//CLASSE ARRAYS
//MAXIM ARRAY
//COMPROVAR SI ES EMPLEAT