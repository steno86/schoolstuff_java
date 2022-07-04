package it41;

/**
 *
 * @author Stefano Ricca
 * Verzweigungen
 */
public class ah_verzweigungen {
    public static void main(String[] args) {
        
        int zahl1=15;
        int zahl2=10;
        
        
        System.out.println("Einseitige Verzweigung:");
        //Beispiel für eine einseitige Verzweigung, trifft die Bedingung zu,
        //wird der if-Anweisungsblock ausgeführt, wenn nicht wird ohne ihn auszuführen
        //im Programmcode fortgefahren.
        if (zahl1>10) {
            System.out.println("Die Zahl ist grösser als 10 \n");
        }
        
        
        System.out.println("Zweiseitige Verzweigung:");
        //Beispiel für eine zweiseitige Verzweigung, trifft die Bedingung zu,
        //wird der if-Anweisungsblock ausgeführt, wenn nicht der else-Anweisungsblock
        if (zahl1>zahl2) {
            System.out.println("Zahl 1 ist grösser wie Zahl 2 \n");
        }
        else {
            System.out.println("Zahl 1 ist NICHT grösser wie Zahl 2 \n");
        }
        
        
        System.out.println("Verzweigung mit mehreren Bedingungen:");
        //Beispiel für eine Verzweigung mit mehreren Bedingungen
        //Zuerst wird mit if die erste Bedingung abgefragt, mit else if die weiteren
        //welche hintereinander abgefragt werden.
        //Mit else am Schluss wird eine Ausweichmöglichkeit geboten sollte keine abgefragte Bedingung zutreffen.
        //Von der kompletten Funktion mit allen Abfragen wird IMMER NUR EIN Befehlsblock ausgeführt
        if (zahl1<zahl2) {
            System.out.println("Zahl 1 ist kleiner wie Zahl 2 \n");
        }
        else if (zahl1>zahl2) {
            System.out.println("Zahl 1 ist grösser wie Zahl 2 \n");
        }
        else {
            System.out.println("Beide Zahlen sind gleich gross \n");
        }
    }
}
