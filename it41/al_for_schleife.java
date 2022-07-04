package it41;

/**
 *
 * @author Stefano Ricca
 * for-Schleife (Zählergesteuerte Schleife)
 * die for-Schleife kommt zum Einsatz wenn bekannt ist
 * wie oft die Schleife durchlaufen werden soll. Dafür wird
 * eine Zählervariable benötigt.
 */
public class al_for_schleife {
    public static void main(String[] args) {
        
        
        for (int i = 0; i<=10; i++) {    //for (zählervariable; bedingung; erhöhung/verminderung Zählervariable)
            //Schleifenblock
            System.out.println((i+1)+". Durchlauf");
        }
    }
}
