package it41;

/**
 *
 * @author Stefano Ricca
 * Methoden mit Rückgabewert
 * Ein Rückgabewert ist ein Wert, den eine Methode an ihren Aufrufer zurückgibt
 *     -> Kann als Ergebnis der Methode angesehen 
 */
public class as_methoden_mit_rueckgabewert {
    public static void main(String[] args) {
        
    //Methodenaufruf Beispiele der doAddition Methode
        System.out.println(doAddition(17, 13));
        
        int resultFromdoAddition = doAddition(17, 13);
        
        System.out.println("In der Variable steht: "+resultFromdoAddition);    
    }
    
    //Hier wird die Methode doaddition erstellt
    public static int doAddition (int number1, int number2) { //Das int anstatt dem void legt den Datentyp des Rückgabewertes fest
        //int result = number1 + number2;
        //return result;   //mit return wird festgelegt welchen Wert die Methode zurückgeben soll
        
        //Beste Schreibweise für den obigen Befehl:
        return number1 + number2;
    }
    
}
