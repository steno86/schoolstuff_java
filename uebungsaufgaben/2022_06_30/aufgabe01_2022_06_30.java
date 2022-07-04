package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 1 30.06.2022
 */
public class aufgabe01_2022_06_30 {
  public static void main (String args[]){
       
       
       //Definition der String Variablen
       String  h1_01="Ethernet-Adapter Ethernet:", 
               h2_02="   Verbindungsspezifisches DNS-Suffix:", 
               p1_01="   Beschreibung. . . . . . . . . . . : Intel(R) Ethernet Connection (", p1_03=") I", p1_05="-V", 
               p2_01="   Physische Adresse . . . . . . . . : 00-23-24-DF-73-9D",
               p3_01="   DHCP aktiviert. . . . . . . . . . : Ja",
               p4_01="   Autokonfiguration aktiviert . . . : Ja",
               p5_01="   Verbindungslokale IPv6-Adresse  . : fe80::8d4e:774:ac03:c569%18(Bevorzugt)",
               p6_01="   IPv4-Adresse  . . . . . . . . . . : ", p6_06="(Bevorzugt)",
               p7_01="   Subnetzmaske  . . . . . . . . . . : ",
               p8_01="   Standardgateway . . . . . . . . . : ",
               p9_01="   DHCP-Server . . . . . . . . . . . : ";
       
       //Definition der integer Variablen
       int     p1_02=2, 
               p1_04=219,
               p6_02=10,
               p6_03=55,
               p6_04=100,
               p6_05=102,
               p7_02=255,
               p7_03=0;
       
               
       
       
       
       
       //Ausgabe 
       System.out.println(h1_01);
       System.out.println();
       System.out.println(h2_02);
       System.out.println(p1_01+p1_02+p1_03+p1_04+p1_05);
       System.out.println(p2_01);
       System.out.println(p3_01);
       System.out.println(p4_01);
       System.out.println(p5_01);
       System.out.println(p6_01+p6_02+"."+p6_03+"."+p6_04+"."+p6_05+p6_06);
       System.out.println(p7_01+p7_02+"."+p7_02+"."+p7_03+"."+p7_03);
       System.out.println(p8_01+p6_02+"."+p6_03+"."+p1_02+"."+p6_02);
       System.out.println(p9_01+p6_02+"."+p6_03+"."+p1_02+"."+p6_02);
       
   }   
}
