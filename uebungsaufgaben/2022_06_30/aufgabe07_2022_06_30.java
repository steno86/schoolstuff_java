package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 7 30.06.2022
 */
public class aufgabe07_2022_06_30 {
    public static void main (String args[]){
        
        //Definiere Startwert und Anzahl Ergebniswerte
        int startwert = 0, anzergebnisse = 151;
        
        //Berechne Zufallszahl
        int zufallszahl = (int)(Math.random()*anzergebnisse);
        
        //Ausgabe Zufallszahl
        System.out.println("Deine Zufallszahl zwischen einschliesslich 0 und 150 ist: "+zufallszahl);
        
        
    }
}
