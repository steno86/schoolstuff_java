package aufgaben;

import java.util.Scanner;

/**
 *
 * @author Stefano Ricca
 * Aufgabe b) 06.07.2022
 */
public class aufgabe_b_2022_07_06 {
    public static void main(String[] args) {
        
        Scanner double1 = new Scanner (System.in);
        Scanner int1 = new Scanner (System.in);
        
        double anschWert, anfWert, restWert, abschreibung;
        int nutzDauer, nutzJahr;
        
        nutzJahr = 1;
        
        
        
        System.out.print("Bitte den Anschaffungspreis eingeben: ");
        anschWert = double1.nextDouble();
        anfWert = anschWert;
        
        System.out.println("");
        
        System.out.print("Bitte die geplante Abschreibungszeit in Jahren eingeben: ");
        nutzDauer = int1.nextInt();
        abschreibung = (anschWert/nutzDauer);
        
        
        System.out.println("");
        
        
        System.out.println("Nutzungsjahr   Anfangswert   Abschreibung   Restwert");
        for (int i = nutzDauer; i>0; i--) {
            restWert = anfWert-abschreibung;
            System.out.println("      "+nutzJahr+"         "+anfWert+"         "+abschreibung+"       "+restWert);
            anfWert=anfWert-abschreibung;
            nutzJahr++;
        }
    }
}
