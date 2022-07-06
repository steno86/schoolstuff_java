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
        double betragRabattiert;
        
        //Programmstart
        System.out.print("Bitte die anzahl Kästen eingeben: ");
        menge = scanner1.nextInt();
        
        rabatt = Rabattklasse(menge);
        
        if (rabatt==0) {
        System.out.println("Für "+menge+" Kästen ist kein Rabatt vorgesehen.");
        }
        else {
            System.out.print("Ihr Rabatt beträgt "+rabatt+"%\nBitte noch den Rechnungsbetrag eingeben: ");
            betragRabattiert = Abzug(scanner2.nextDouble(), rabatt);
            System.out.println("Ihre neue Rechnung abzüglich Rabatt beträgt: "+betragRabattiert+" Euro.");
        }
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
    
    //Methode Abzug Rabatt vom Rechnungsbetrag
    public static double Abzug (double betrag, int rabatt) {
        double result = (betrag-((betrag/100)*rabatt));        
        return result;
    }
}
