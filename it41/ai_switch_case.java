package it41;

/**
 *
 * @author Stefano Ricca
 * Switch Case Anweisungen
 */
public class ai_switch_case {
    public static void main(String[] args) {
        
        int wuerfel1;
        
        wuerfel1=(int)((Math.random() *6)+1);
        //System.out.println("Wurfkontrolle: "+wuerfel1);
        
        
        // Es muss unbedingt auf das break geachtet werden um eine Ausführung
        // der folgenden Anweisungen zu unterbinden
        switch(wuerfel1) {
            case 1: System.out.println("Du hast eine 1 gewürfelt");
                    break;
            case 2: System.out.println("Du hast eine 2 gewürfelt");
                    break;
            case 3: System.out.println("Du hast eine 3 gewürfelt");
                    break;
            case 4: System.out.println("Du hast eine 4 gewürfelt");
                    break;
            default: System.out.println("Du hast höher 4 gewürfelt");
                    break;
        }
        
    }
}
