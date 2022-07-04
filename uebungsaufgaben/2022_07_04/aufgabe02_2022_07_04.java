/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 2 04.07.2022
 */
public class aufgabe02_2022_07_04 {
    public static void main(String[] args) {
        
        int schuhgroesse = 45;
        
        System.out.println("Schuhmacher:  \"Ist deine Schuhgrösse 37?\"");
        if (schuhgroesse == 37) {
            System.out.println("Kunde:  \"Ja!\"");
            System.out.println("Schuhmacher: \"Super, hier sind deine Schuhe!\"");
        } 
        else {
            System.out.println("Kunde:  \"Nein!\"");
            System.out.println("Schuhmacher:  \"Tut mir leid ich schaue weiter...\"");
            System.out.println("Schuhmacher:  \"Ist deine Schuhgrösse 40?\"");
            if (schuhgroesse == 40) {
                System.out.println("Kunde:  \"Ja!\"");
                System.out.println("Schuhmacher: \"Super, hier sind deine Schuhe!\"");
        } 
            else {
                System.out.println("Kunde:  \"Nein!\"");
                System.out.println("Schuhmacher:  \"Tut mir leid ich schaue weiter...\"");
                if (schuhgroesse == 45) {
                    System.out.println("Schuhmacher:  \"Ist deine Schuhgrösse 45?\"");
                    System.out.println("Kunde:  \"Ja!\"");
                    System.out.println("Schuhmacher: \"Super, hier sind deine Schuhe!\"");
        } 
                else {
                    System.out.println("Kunde:  \"Nein!\"");
                    System.out.println("Schuhmacher:  \"Tut mir leid ich habe deine Schuhe nicht fertig.\"");
        }
        }
        
        }
        
        
        
    }
}
