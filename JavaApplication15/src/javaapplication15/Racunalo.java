/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Mateo
 */
public class Racunalo {
    
        private String naziv;
        private int cijena;

    public Racunalo(String naziv, int cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }
        
    /**
     * Get the value of cijena
     *
     * @return the value of cijena
     */
    public int getCijena() {
        return cijena;
    }

    /**
     * Set the value of cijena
     *
     * @param cijena new value of cijena
     */
    public void setCijena(int cijena) {
        this.cijena = cijena;
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
