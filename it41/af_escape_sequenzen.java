package it41;

/*
@author Stefano Ricca
 Verschiedene Escape Sequenzen sind:
 \n New Line
 \r Carriage Return
 \t Tab
 \b Backspace
 \f Form Feed
 \  Funktionen/Symbole funktionslos setzen, bsp \" innerhalb eines String anzeigen
 */
public class af_escape_sequenzen {
    public static void main (String args[]){
        System.out.println("Mit der escape sequenz \\n komme ich in eine \nneue Zeile");  //Die escape sequenz \n springt in eine neue Zeile, 
                                                                                          //das \\n hebt die Sequenz auf und gibt es doch als Text aus
        System.out.println("\t \t \t \t \\t Sind Tabulatorsprünge");
        
        System.out.println("Mann kann \"\" auch in einem String anzeigen");
    }
}
