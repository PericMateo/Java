/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza_jtable_automobil;

/**
 *
 * @author Mateo
 */
public class Automobil {
    
    private String naziv;
    private String boja;
    private String vrstaKaroserije;

    public Automobil(String naziv, String boja, String vrstaKaroserije) {
        this.naziv = naziv;
        this.boja = boja;
        this.vrstaKaroserije = vrstaKaroserije;
    }

    
    /**
     * Get the value of vrstaKaroserije
     *
     * @return the value of vrstaKaroserije
     */
    public String getVrstaKaroserije() {
        return vrstaKaroserije;
    }

    /**
     * Set the value of vrstaKaroserije
     *
     * @param vrstaKaroserije new value of vrstaKaroserije
     */
    public void setVrstaKaroserije(String vrstaKaroserije) {
        this.vrstaKaroserije = vrstaKaroserije;
    }


    /**
     * Get the value of boja
     *
     * @return the value of boja
     */
    public String getBoja() {
        return boja;
    }

    /**
     * Set the value of boja
     *
     * @param boja new value of boja
     */
    public void setBoja(String boja) {
        this.boja = boja;
    }


    /**
     * Get the value of naziv
     *
     * @return the value of naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Set the value of naziv
     *
     * @param naziv new value of naziv
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
