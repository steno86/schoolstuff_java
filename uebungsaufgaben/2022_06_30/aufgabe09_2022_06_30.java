package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 9 30.06.2022
 */
public class aufgabe09_2022_06_30 {
    public static void main (String args[]){
        
        
        //Definiere 2 zufällige Zahlen zwischen 0 und 20
        int a=(int)(Math.random() *21);
        int b=(int)(Math.random() *21);
        
        //Zufallszahlen ausgeben
        System.out.println("Deine zufallszahlen zwischen 0 und 20 sind:\na="+a+"\nb="+b);
        
        //Überprüfung von a>10 UND b>11
        if ((a>10)&(b>11)) {
            System.out.println("a ist grösser 10 UND b ist grösser 11");
        }
        else if ((a<10)&(b>11)) {
            System.out.println("a ist kleiner 10 UND b ist grösser 11");
        }
        else if ((a<10)&(b<11)) {
            System.out.println("a ist kleiner 10 UND b ist kleiner 11");
        }
        else if ((a>10)&(b<11)) {
            System.out.println("a ist grösser 10 UND b ist kleiner 11");
        }
        else {
            System.out.println("Irgendein Fehler ist passiert...");
        }
    }
}
