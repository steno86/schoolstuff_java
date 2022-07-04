package it41;

/**
 *
 * @author Stefano Ricca
 */
public class aa_datentypen {

public static void main (String args[]) {

//Definition Mehrerer Variablen mit unterschiedlichen Datentypen
int x; //Variable x deklarieren, Datentyp Integer
x=36; //Variable x befüllen
double y=100.125; //Variable y, Datentyp double
char mm='g'; //Variable mm, Datentyp character - einzelnes Zeichen, muss zwischen '' geschrieben werden
boolean mann=true; //Variable mann, Datentyp boolean, kann nur true und false sein
String name="Stefano Ricca, 36 Jahre alt."; //Variable name, Datentyp String, dies ist kein primitiver Datentyp mehr!

/*
Ausgabe unterschiedlicher Variablen
System.out.println("Ausgabe mit Zeilenumbruch print line");
System.out.print("Ausgabe ohne Zeilenumbruch print");
*/
System.out.println("Betrag: "+(x+y+1000)+" Euro");
System.out.println(mm);
System.out.println("Ausgabe Boolean: "+mann);
System.out.println(name);
    
}

}
