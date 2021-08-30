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
public class Laptop extends Racunalo {
    
        private int velZaslona;

    public Laptop(String naziv, int cijena, int velZaslona) {
        super(naziv, cijena);
        this.velZaslona=velZaslona;
    }

    

    /**
     * Get the value of velZaslona
     *
     * @return the value of velZaslona
     */
    public int getVelZaslona() {
        return velZaslona;
    }

    /**
     * Set the value of velZaslona
     *
     * @param velZaslona new value of velZaslona
     */
    public void setVelZaslona(int velZaslona) {
        this.velZaslona = velZaslona;
    }

}
