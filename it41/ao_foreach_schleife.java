package it41;

/**
 *
 * @author Stefano Ricca
 * foreach-Schleife
 * Schleifentyp um Datenstrukturen (z.B. Arrays) Schrittweise zu durchlaufen
 * Speichert bei jedem Durchlauf eine Kopie des aktuellen Wertes der Datenstruktur
 * in einer Variable, welche man im Schleifenkörper verwenden kann
 * ACHTUNG!: Nur lesender Zugriff möglich!
 */
public class ao_foreach_schleife {
    public static void main(String[] args) {
        
        //Verkürzte erstellung eines Arrays direkt mit Werten, durch die Anzahl
        //der Werte wird automatisch die Länge des Arrays festgelegt.
        String[] names = {"Stefano", "Kai", "Ismail"};
        
        //Diese Schleife 
        for(String name : names) {      //Durchlaufe das Array names und speichere den jeweiligen Wert in der Variable name vom Typ String
            System.out.println(name);   //Der Wert der Variable name ist NICHT veränderbar sondern nur eine Kopie des Wertes aus dem Array
        }
    }
    
}
