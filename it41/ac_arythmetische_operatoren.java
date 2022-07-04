package it41;

/**
 *
 * @author Stefano Ricca
 */
public class ac_arythmetische_operatoren {
    
    public static void main (String args[]) {
    
    int a=4;
    int b=15;
    
//  Einfache Addition
    System.out.println(a +"+"+ b);
    int r=a+b;
    System.out.println("Die Summe beider Zahlen ergibt " + r);
    
//  Modulo
    int r2=b%a;       //Modulo von Variable b % Divident
    System.out.println(r2);
    
    int r3=b%2;
    System.out.println(r3);
    
//  Inkrementation
    int abc=10;
    abc++;  //abc = abc + 1
    System.out.println(abc);
    
//  Dekrementation
    int def=10;
    def--; //def = def - 1
    System.out.println(def);
    
// Zusatz und Wertzuteilung xx+=10 ist dasselbe wie xx=xx+10, geht auch mit 2 Variablen, xx+=zz    
    int xx=10;
    xx+=10;
    System.out.println(xx);
    
    }
    
    
}
