package it41;

/**
 *
 * @author Stefano Ricca
 * Verschachtelte Schleifen
 * Innerhalb einer Schleife können sich weitere Schleifen befinden
 */
public class am_verschachtelte_schleifen {
    public static void main(String[] args) {
        
        for (int i = 1; i < 4; i++) {
            
            for (int j = 1; j < 4; j++) {   //Beachtet werden muss die Gültigkeit der Variablen, die inneren
                System.out.print("X ");     //Schleifen benötigen eine andere Zählervariable
            }
            
            System.out.println();
        
        }
    }
}
