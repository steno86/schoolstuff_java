/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snippets;

/**
 *
 * @author BFW
 */
public class wuerfel {
    public static void main(String[] args) {
        //Funktion die eine zufällige Ganzzahl von 1 bis 6 ausgibt, wie ein Würfel
        
        int wuerfel1;
        
        wuerfel1=(int)((Math.random() *6)+1);
        
        System.out.println(wuerfel1);
    }
  
}
