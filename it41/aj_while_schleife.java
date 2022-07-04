package it41;

/**
 *
 * @author Stefano Ricca
 * for-Schleife
 * die for-Schleife hat die Besonderheit das
 * die überprüfung der Bedingung VOR ausführung der Schleife
 * abgefragt wird. Trifft die Bedingung zu wird der inhalt der
 * Schleife NICHT ausgeführt.
 */
public class aj_while_schleife {
    public static void main(String[] args) {
        //In dieser Schleife sollen die Zahlen vom Startwert
        //bis 10 ausgegeben werden
        
        int startwert = 1;
        
        while (startwert <=10) {
            System.out.println(startwert);
            startwert++;
        }
    }
}
