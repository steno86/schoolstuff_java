package aufgaben;

import java.util.Scanner;

/**
 *
 * @author Stefano Ricca
 * 
 * Aufgabe a) 06.07.2022
 */
public class aufgabe_a_2022_07_06 {
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner (System.in);
        Scanner scanner2 = new Scanner (System.in);
        
        int menge, rabatt;
        double betragRechnung;
        
        
        System.out.println("Bitte die anzahl Kästen eingeben:");
        menge = scanner1.nextInt();
        
        rabatt = Rabattklasse(menge);
        
        System.out.println("Ihr Rabatt beträgt "+rabatt+"%");  
    }
    
    //Methode zur Rabattberechnung
    public static int Rabattklasse (int anzahl) {
        int rabatt=0;
        
        if (anzahl >= 100) {
            rabatt=10;
        }
        else if (anzahl >= 50) {
            rabatt=7;
        }
        else if (anzahl >= 10) {
            rabatt=5;
        }
        else {
            rabatt=0;
        }
        
        return rabatt; 
    }
    
    
}
