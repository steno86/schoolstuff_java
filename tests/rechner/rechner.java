package snippets;

import java.util.Scanner;

/**
 *
 * @author Stefano Ricca
 * Einfacher Rechner
 */
public class rechner {
    public static void main(String[] args) {
        
        Scanner scan5 = new Scanner(System.in);
        
        boolean validOperator;
        double nummer1, nummer2, ergebnis = 0;
        char operator;
        
        //Eingabe der ersten Zahl
        System.out.println("Bitte die erste Zahl eingeben:");
        nummer1 = scan5.nextDouble();
        //Eingabe der zweiten Zahl
        System.out.println("Bitte die zweite Zahl eingeben:");
        nummer2 = scan5.nextDouble();
        //Eingabe des Operators +, -, /, *
        
        do {
            System.out.println("Bitte Operator eingeben:");
            operator=scan5.next().charAt(0); //Nur das erste Zeichen der Eingabe wird benutzt
            
            switch (operator) {
                case '+' : validOperator = true;break;
                case '-' : validOperator = true;break;
                case '/' : validOperator = true;break;
                case '*' : validOperator = true;break;
                default : System.out.println("Falscher Operator");validOperator = false;break;
            }
            
        }
        while (validOperator == false);
        
            switch (operator) {
                case '+' : ergebnis = nummer1 + nummer2;break;
                case '-' : ergebnis = nummer1 - nummer2;break;
                case '/' : ergebnis = nummer1 / nummer2;break;
                case '*' : ergebnis = nummer1 * nummer2;break;
                default : System.out.println("Fehler! Programm beendet...");break;
        }
        System.out.println("Das Ergebnis ist: " + ergebnis);
        
    }
    
}
