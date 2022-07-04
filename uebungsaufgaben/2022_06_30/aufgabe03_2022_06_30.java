package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 3 30.06.2022
 */
public class aufgabe03_2022_06_30 {
  public static void main (String args []){
      
      String stadt="Stuttgart";
      
      
      //a) Länge des Strings:
      int laenge = stadt.length();
      System.out.println("Die länge des Strings beträgt: "+laenge+" Zeichen");
      
      //b) 
      String ersetzt = stadt.replace("t", "a");
      System.out.println("Ersetze t durch a ergibt: "+ersetzt);
      
      //c)
      char stelle4 = stadt.charAt(3);
      System.out.println("An 4. Stelle des Wortes steht der Buchstebe "+stelle4);
  }  
}
