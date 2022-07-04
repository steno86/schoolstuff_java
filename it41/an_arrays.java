package it41;

/**
 *
 * @author Stefano Ricca
 * Arrays
 * Arrays sind Variablen in denen mehrere Werte gespeichert werden können
 */
public class an_arrays {
    public static void main(String[] args) {
        
        String[] names = new String[6]; //links vom "=":  Datentyp+[]+bezeichner
                                        //rechts vom "=": new legt neues Objekt an, Typ ist String [6] Werte kann dieses Array beinhalten
                                        //Die Größe eines Arrays wird IMMER bei der Initialisierung festgelegt!!!!
        
        names[0] = "Stefano"; //Weise dem Index 0, also dem ersten Wert im Array den Wert Stefano zu.
        names[1] = "Johann";
        names[2] = "Sarah";
        names[3] = "Kai";
        names[4] = "Ismail";
        names[5] = "Andreas";
        
        System.out.println(names[1]); //Gibt den Wert mit Index 1 aus dem Array names aus
        
        //Ausgabe des gesamten Arrays per for-Schleife
        for (int i = 0; i < names.length; i++) { //die Funktion arrayname.length gibt die länge des Arrays aus
            System.out.println(names[i]);
        }
        
    }
}
