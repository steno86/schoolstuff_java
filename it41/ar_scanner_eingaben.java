package it41;

import java.util.Scanner; //Import der Klasse für den Scanner

/**
 *
 * @author Stefano Ricca
 * Benutzereingaben mit der Scanner-Methode
 */
public class ar_scanner_eingaben {
    public static void main(String[] args) {
        
        
        /**
         * WICHTIG!!!!!!
         * NIE mit dem gleichen Scanner integer und Strings einlesen, dafür lieber einen neuen Scanner anlegen
        */
        Scanner input1 = new Scanner(System.in); //Erstellen des Scanners über die zuvor importierte Klasse
        Scanner input2 = new Scanner(System.in);
        
        //Eingabe und ausgabe einer Zahl
        int zahl;
        System.out.println("Bitte Zahl eingeben:");
        zahl = input1.nextInt(); //Es wird der Scanner aufgerufen um die Benutzereingabe in die Variable zahl gespeichert.
        System.out.println("Eingegebene Zahl: "+zahl);
        
        //Eingabe und Ausgabe eines Strings
        //String name;
        
        System.out.println("Bitte Name eingeben: ");
        String name = input2.nextLine();
        System.out.println("Der eingegebene Name ist: "+name);
        
        
    }
}
