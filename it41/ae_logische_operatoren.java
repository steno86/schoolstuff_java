package it41;

/**
 *
 * @author Stefano Ricca
 */
public class ae_logische_operatoren {

public static void main (String args[]) {
    
//  Logische Operatoren
// &    Logisches AND (Konjunktion)
// |    Logisches OR (Disjunktion)
// ^    Logisches XOR (exklusive Disjunktion)
//
// ||   Bedingte Disjunktion
// &&   Bedingte Konjunktion
// !    Logisches NOT (Negation)
// &=   Zuordnung durch logische Konjunktion
// |=   Zuordnung durch logische Disjunktion
// ^=   Zuordnung durch logische exkl. Disjunktion
// ==   Gleich
// !=   Ungleich
// ?:   Dreifacher Operator für bedingte



int x=50;
int y=9;
if(x>20 && y>20){
System.out.println("Beide Zahlen erfüllen die Bedingung!");
}
else {
System.out.println("Eine/Beide Zahlen erfüllen nicht die Bedingung!");
}
// Negation
boolean a=true;
boolean b=false;
a=!b; // a variable bekommt den negierten Wert der Variable B!
System.out.println(a);
}
}

