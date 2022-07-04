package it41;

/**
 *
 * @author Stefano Ricca
 * do-while-Schleife
 * bei der do-while-Schleife wird die Bedingung erst NACH
 * der ersten Ausführung der Schleife geprüft also wird der Inhalt mindestens
 * ein mal ausgeführt.
 * 
 */
public class ak_do_while_schleife {
    public static void main(String[] args) {
    
        
        //In dieser Schleife wird ein Würfel geworfen, natürlich muss dieser erst einmal
        //geworfen werden um die Bedingung überprüfen zu können.
        //Ein Counter zählt die Durchgänge für die Ausgabe am Ende aus
    
    int wuerfel1, counter=0;
        
        //Die Schleife wird mit do{} eingeleitet
        do { 
           System.out.println("Es wird gewürfelt...");
           wuerfel1=(int)((Math.random() *6)+1);
           counter++;
           if (wuerfel1<6) {
                System.out.println("Schade... Eine " +wuerfel1);
                }
           else {
               switch (counter) {
                   case 1 : System.out.println("Number one bullshit man!!!!"); break;
                   default :  System.out.println("Du hast nach "+counter+" Würfen eine 6 gewürfelt!"); break;
               }
                }
        }
        while (wuerfel1<6); //Die Überprüfung der Bedingung wird nach dem Schleifenblock
                            //durchgeführt
        
        System.out.println("PROGRAMMENDE");
    }
    
}
