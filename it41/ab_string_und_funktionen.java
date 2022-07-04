package it41;

/**
 *
 * @author Stefano Ricca
 */
public class ab_string_und_funktionen {

public static void main (String args[]) {

//  Verschiedene Datentypen
    
        String a="stefano"; //String, Datentyp für Text

        boolean b=a.isEmpty(); /*Gibt der Variable b eine Funktion. Es wird überprüft ob Variable a einen Wert enthält
                               a.isEmpty() die Funktion isEmpty() referenziert auf Variable a
                              isEmpty() hat den Rückgabetyp boolean*/
        
        int c=a.length(); //Gibt die Länge/Anzahl der Zeichen von Variable a aus

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


//  Verschiedene Funktionen

        String name = "Hallo Welt!";
        
        
        //boolean result = name.equalsIgnoreCase("bro");  // Überprüfung auf übereinstimmung, case insensitive
        int result = name.length();           //Gibt die Länge/Anzahl der Zeichen aus
        //char result = name.charAt(1);         //Welches Symbol steht an Stelle x, hier 1
        //int result = name.indexOf("r");       //An welcher stelle steht Symbol x, hier r
        //boolean result = name.isEmpty();      //Fragt ab ob die Var. name einen Wert enthaelt und speichert das Ergebnis in die Variable result
        //String result = name.toUpperCase();   //Wandelt hier alle Buchstaben in Grossbuchstaben um
        //String result = name.toLowerCase();   //Wandelt hier alle Buchstaben in Kleinbuchstaben um
        //String result = name.trim();          // Die Funktion Trim entfernt alle Leerzeichen vor und nach dem String
        //String result = name.replace('o', 'a');   //Ersetzt hier alle kleinen o durch kleine a
        
        System.out.println(result);


}


}
