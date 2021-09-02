/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odredi_student_datoteka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mateo
 */
public class Odredi_Student_Datoteka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Upisite recenicu");
        String tekst = scan.nextLine();
        //Odredi(tekst);
        System.out.println("Upisite broj studenata koji zelite upisati");
        int brSt = Integer.parseInt(scan.nextLine());
        //Upis(brSt);
        new Datoteka().run();
    }
    public static Vector Odredi(String tekst){
    
        Vector vec = new Vector();
        tekst.toLowerCase();
        String[] pod = tekst.split(" ");
        for(String tocneRijeci:pod){
        
            if(tocneRijeci.startsWith("m")){
            
                vec.add(tocneRijeci);
            }
        }
        return vec;
    
        
    }
    public static ArrayList<Student> Upis(int brStudenata){
    
        ArrayList<Student> st = new ArrayList<Student>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<brStudenata;i++){
        
            System.out.println("Upisite ime Studenta");
            String ime = scan.nextLine();
            System.out.println("Upisite godinu studiranja");
            int godina = Integer.parseInt(scan.nextLine());
            Student stud = new Student(ime,godina);
            st.add(stud);
            
        }
        return st;
    
        
    }
    public static class Datoteka extends Thread{

        public void run(){
        
            try {
                File file = new File("C:\\Git\\Java\\Odredi_Student_Datoteka\\src\\odredi_student_datoteka\\Imena.txt");
                Scanner scan = new Scanner(file);
                //Predpostavljamo da su imena zapisana u jednome redu
                String linija = scan.nextLine();
                String[] pod = linija.split(" ");
                int vel = 0;
                for(int i=0;i<pod.length;i++){
                
                    if(pod[i].length()>vel){
                    
                        vel=pod[i].length();
                    }
                }
                System.out.println("Najvece ime sadrzi: "+vel);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Odredi_Student_Datoteka.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    }
}
