package it41;

/**
 *
 * @author Stefano Ricca
 */
public class ag_mathematische_funktionen {
   public static void main (String args[]){
       
       //Math.random()
       double a=Math.random(); //Die Funktion Math.random erstellt ein zufälliges double  grösser als 0 und kleiner als 1.0
       System.out.println("Die Zufallszahl ist: "+a);
       
       int ab=(int)((Math.random() *10)+2); //Zufällige ganze Zahlen: "+2" gibt den Kleinsten bzw den Startwert an
                                            //"*10" gibt an wie viele Zahlen ab dem Startwert genutzt werden, hier 10
                                            //also werden die Zufallszahlen im Bereich von +2 bis (2+10)=12 liegen.
       System.out.println("Die Ganzzahlige Zufallszahl zwischen 2 und 12 ist: "+ab);
       
       //Math.pow(x, y)
       double b=4, c=2;
       
       double d=Math.pow(b, c); //Die Funktion Math.pow(x, y) berechnet die Potenz von x hoch y
       System.out.println("Potenzrechner, 4 hoch 2 ist: "+d);
       
       //Math.sqrt(x)
       double e=Math.sqrt(d); //Die Funktion Math.sqrt(x) berechnet die Quadratwurzel von x (square root)
       System.out.println("Die Quadratwurzel von "+d+" ist "+e);
   }
 
}
