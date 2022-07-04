package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 5 30.06.2022
 */
public class aufgabe05_2022_06_30 {
    public static void main (String args[]){
        
        //Definiere Variable für Startwert
        int startwert=100;
        
        //Definiere Schrittweite
        int schrittweite=2;
        
        //Inkrementieren
        int inkrement=startwert+=schrittweite;
        
        //Dekrementieren
        int dekrement=startwert-=schrittweite;
        
        //Ausgabe
        System.out.println("Bei Startwert 100 ergibt Inkrementation um "+schrittweite+" = "+inkrement+"\n   und eine Dekrementation um "+schrittweite+" ergibt "+dekrement);
    }
}
