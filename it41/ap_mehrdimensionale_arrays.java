package it41;

/**
 *
 * @author Stefano Ricca
 * Mehrdimensionale Arrays
 * Datenstruktur (Datensammlung)
 * Prinzip: Wie normale (eindimensionale) Arrays, nur mit mehreren Dimensionen
 * 
 * Eindimensionales Array:
 *  |  (0)  |  (1)  |  (2)  |  (3)  |  (4)  |
 * 
 * Mehrdimensionales Array:
 *  | (0|0) | (0|1) | (0|2) | (0|3) | (0|4) |
 *  | (1|0) | (1|1) | (1|2) | (1|3) | (1|4) |
 *  | (2|0) | (2|1) | (2|2) | (2|3) | (2|4) |
 * 
 * Wie man sieht kann man ein mehrdimensionales Array wie
 * eine Tabelle verwenden. (Zeilenindex|Spaltenindex) 
 */
public class ap_mehrdimensionale_arrays {
    public static void main(String[] args) {
        
        String[][] firstANDlastname = new String[5][2];
        
        firstANDlastname[0][0] = "Stefano";
        firstANDlastname[0][1] = "Ricca";
        
        firstANDlastname[1][0] = "Kai";
        firstANDlastname[1][1] = "Diesam";
        
        firstANDlastname[2][0] = "Johann";
        firstANDlastname[2][1] = "Giesbrecht";
        
        //Test durch Ausgabe des Inhalts mit Hilfe einer for-Schleife
        //Äusere for-Schleife: Zeilenindex => i
        //Innere for-Schleife: Spaltenindex => j
        for (int i = 0; i < firstANDlastname.length; i++) { //die Funktion arrayname.length gibt die länge des Arrays aus
            for (int j = 0; j < firstANDlastname[i].length; j++) {
                System.out.print(firstANDlastname[i][j]+" ");
            }
            System.out.println();
        } 
    }
    
}
