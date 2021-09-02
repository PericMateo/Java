/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odredi_student_datoteka;

/**
 *
 * @author Mateo
 */
public class Student {
    
    private String imeStudenta;
    private int godinaStudija;

    public Student(String imeStudenta, int godinaStudija) {
        this.imeStudenta = imeStudenta;
        this.godinaStudija = godinaStudija;
    }

    /**
     * Get the value of godinaStudija
     *
     * @return the value of godinaStudija
     */
    public int getGodinaStudija() {
        return godinaStudija;
    }

    /**
     * Set the value of godinaStudija
     *
     * @param godinaStudija new value of godinaStudija
     */
    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }


    /**
     * Get the value of imeStudenta
     *
     * @return the value of imeStudenta
     */
    public String getImeStudenta() {
        return imeStudenta;
    }

    /**
     * Set the value of imeStudenta
     *
     * @param imeStudenta new value of imeStudenta
     */
    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

}
