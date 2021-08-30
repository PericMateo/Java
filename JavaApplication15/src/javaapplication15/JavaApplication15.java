/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mateo
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklariranje scannera
        Scanner scan = new Scanner(System.in);
        //Dohvatanje znamenke iz cmd
        System.out.println("Upisite znamenku");
        int znamenka = Integer.parseInt(scan.nextLine());
        //Deklariranje polja za brojeve
        int[][] brojevi= new int[50][50];
        brojevi[0][0]=123;
        brojevi[0][1]=1233311;
        brojevi[0][2]=5544;
        brojevi[0][3]=33244;
        brojevi[0][4]=31234;
        brojevi[1][0]=1231231;
        brojevi[1][1]=5345366;
        brojevi[1][2]=64564;
        brojevi[1][3]=9067567;
        brojevi[1][4]=312312;
        int rez=Brojevi(brojevi,znamenka);
        System.out.print(rez);
        
        int cij = 1;
        while(cij!=0){
        System.out.print("Unesite naziv lapopa");
        String naziv = scan.nextLine();
        System.out.print("Unesite velicinu zaslona");
        int vel = Integer.parseInt(scan.nextLine());
        System.out.print("Unesite Cijenu");
         cij = Integer.parseInt(scan.nextLine());
        Upis(naziv,cij,vel);
    }
    }
    public static int Brojevi(int[][] polje,int zadanaZnamenka){
    
        int brojBrojeva=0;
        String ch = Integer.toString(zadanaZnamenka);
        char c = ch.charAt(0);
        //int i =polje.length;
        for(int i = 0;i<50;i++){
        
            for(int j = 0;j<50;j++){
            
                int trenutnoPolje = polje[i][j];
                String brUStr = Integer.toString(trenutnoPolje);
                for(int k = 0;k<brUStr.length();k++){
                
                    char kk = brUStr.charAt(k);
                    if(kk==c){
                    
                        brojBrojeva++;
                    }
                }
                
            }
        }
        
        return brojBrojeva;
    
        
    }
    public static void Upis(String naziv,int cijena,int velZaslona){
    
        Laptop rac = new Laptop(naziv,cijena,velZaslona);
        String na = rac.getNaziv();
        int ci = rac.getCijena();
        int vz = rac.getVelZaslona();
        try {
           FileWriter fw = new FileWriter("C:\\Git\\Java\\JavaApplication15\\src\\javaapplication15\\Podatci.txt",true);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("Naziv Racunala: "+na+" Velicina zaslona: "+vz+"\"\""+" Cijena: "+ci+"kn");
           bw.newLine();
           bw.close();
           
           
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication15.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
