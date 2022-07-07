/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spielerei;

import java.util.Scanner;

/**
 *
 * @author BFW
 */
public class integer_array {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        
        int[] intArray = new int[4];
        int[] intArray2 = {10, 20, 30, 40, 50, 60};
        int counter, auswahl, auswahlToIndex;
    
        
        counter=0;
        auswahl=0;
        
        intArray[0] = 15;
        intArray[1] = 14;
        intArray[2] = 100;
        intArray[3] = 54195;
        
        
        
        
        //Auslesen mit foreach Schleife
        for (int number : intArray) {
            counter++;
            System.out.println(counter+". Zahl: "+number);
        }
        
        //Einfache Konsolenausgabe einzelner Werte
        System.out.println("Zahl 3: "+ intArray[2]);
        System.out.println("Zahl 1: "+ intArray[0]);
        
        //Auslesen mit Zählerschleife
        for (int i = 0; i<intArray.length; i++) {
            System.out.println("Array Index "+i+": "+intArray[i]);
        }
        
        //Benutzerabfrage welcher Wert angezeigt werden soll. Wird eine falsche Zahl eingegeben startet die Abfrage neu
        do {
            System.out.print("Welche Zahl aus dem Array 2 möchtest du wissen? (1 - "+intArray2.length+") : ");
            auswahl = eingabe.nextInt();
            if (auswahl > intArray2.length) {
                System.out.println("Falsche Eingabe!");
            }
            }
        while (auswahl > intArray2.length);
        auswahlToIndex = auswahl-1;
        System.out.println("Die " + auswahl + ". Zahl lautet: "+intArray2[auswahlToIndex]);
        
    }
    
}
