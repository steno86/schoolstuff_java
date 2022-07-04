package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 3 04.07.2022
 */
public class aufgabe03_2022_07_04 {
    public static void main(String[] args) {
        
        double rechnung1 = 155.50, rechnung2 = 355.50;
        boolean vergleich;
        int Nummer1 = 15;
        
        //Schritt 1
        rechnung1+=100;
        System.out.println("Rechnung1 = " + rechnung1);
        
        //Schritt 2
        rechnung2-=100;
        System.out.println("Rechnung2 = " + rechnung2);
        
        //Schritt 3
        System.out.println("Sind beide rechnungen gleich hoch?");
        vergleich = (rechnung1 == rechnung2);
        System.out.println(vergleich);
        
        //Schritt 4
        Nummer1 = (int)Math.pow(Nummer1, 3);
        System.out.println("Der Kubikwert von 15 ist: " + Nummer1);
        
        //Schritt 5
        if (Nummer1 > (rechnung2 *= 1000 + 200)) {
            System.out.println("Nummer1 ist grösser wie rechnung2");
        }
        else {
            System.out.println("Nummer1 ist nicht grösser wie rechnung2");
        }
    }
}
