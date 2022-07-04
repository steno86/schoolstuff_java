package it41;

/**
 *
 * @author Stefano Ricca
 * 
 * Methoden
 * Eine MEthode ist ein Stück vorprogrammierter Code, denwir immer
 * wieder ausführen können ohne diesen neu schreiben zu müssen.
 * 
 */
public class aq_methoden {
    public static void main(String[] args) {
        
        System.out.println("Vor dem Methodenaufruf");
        doSomething(); //Hier wird die Methode doSomething die unten erstellt wurde aufgerufen
        System.out.println("Nach dem Methodenaufruf");
        doAddition(15, 20); //Hier wird die Methode doAddition aufgerufen die unten erstellt wurde und die Zahlen 15 und 20 an sie übergeben.
        
    }
    
    //Hier Wird die Methode dosomething erstellt
    public static void doSomething() {  //void ist der Rückgabetyp wenn nichts von der Methode zurückgegeben werden soll
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println(result);
    }
    public static void doAddition (int number1, int number2) {
        int a = number1;
        int b = number2;
        int result = a + b;
        System.out.println(result);
    }
}
