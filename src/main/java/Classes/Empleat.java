/**
 * Classe filla de Persona
 */
package Classes;

public class Empleat extends Persona { //Comentaris al marge per als atributs

    private String codiSS;
    private String especialitat;
    private String carrec;
    private String dataContracte;
    private String dataFinalContracte;
    private String nomina;
    private String iban;
    private String horari;
    private boolean assignat;

    public Empleat(String nomc, String cognom1c,String cognom2c, String dnic, String passwdc, String emailc, String dataNaixementc, String adrecac, String ciutatc, String provinciac, String codiPostalc,
            String tipusDocumentc, String sexec, String telefonc, String idRolc, String hashc, String nominac,String iban,String horari) {

        super(nomc, cognom1c,cognom2c, dnic, passwdc, emailc, dataNaixementc, adrecac, ciutatc, provinciac, codiPostalc,
                tipusDocumentc, sexec, telefonc, idRolc, hashc);
        nomina = nominac;
        assignat = false;
    }

    /**
     * GETTERS
     */
    public String getCodiSS() {
        return codiSS;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public String getCarrec() {
        return carrec;
    }

    public String getDataContracte() {
        return dataContracte;
    }

    public String getDataFinalContracte() {
        return dataFinalContracte;
    }

    public String getNomina() {
        return nomina;
    }

    public boolean getAssignat() {
        return assignat;
    }

    public String getIban() {
        return iban;
    }

    public String getHorari() {
        return horari;
    }

    /**
     * SETTERS
     */
    public void setCodiSS(String s) {
        codiSS = s;
    }

    public void setEspecialitat(String s) {
        especialitat = s;
    }

    public void setCarrec(String s) {
        carrec = s;
    }

    public void setDataContracte(String s) {
        dataContracte = s;
    }

    public void setDataFinalContracte(String s) {
        dataFinalContracte = s;
    }

    public void setNomina(String s) {
        nomina = s;
    }

    public void setAssignat() {
        assignat = true;
    }

    public void eliminarAssign() {
        assignat = false;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    public void setAssignat(boolean assignat) {
        this.assignat = assignat;
    }
    
    /**
     * METODES
     */
    @Override
    public String toString() {
        String imprimir = String.format("%s %20s %70s %70s %70s %70s", getId(), getNom(), getCognom1(), getDNI(), getNomina(), getAssignat());
        return imprimir;
    }

}
