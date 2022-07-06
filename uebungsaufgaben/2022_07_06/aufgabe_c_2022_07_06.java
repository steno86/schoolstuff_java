package aufgaben;

import java.util.Scanner;

/**
 *
 * @author Stefano Ricca
 * 
 * Aufgabe c) 06.07.2022
 */
public class aufgabe_c_2022_07_06 {
    public static void main(String[] args) {
        
        Scanner double1 = new Scanner(System.in);
        double[] zahlen = new double[4];
        double max;
        max = 0;
        
        for (int i=1; i<=4; i++) {
            System.out.print("Bitte die "+i+". Zahl eingeben: ");
            int index = i-1;
            zahlen[index] = double1.nextDouble();
        }
        
        for (double wert : zahlen) {
            if (wert > max){
                max = wert;
            }
        }
        
        System.out.println("\nDie höchste eingegebene Zahl war: "+max);
    }
}
