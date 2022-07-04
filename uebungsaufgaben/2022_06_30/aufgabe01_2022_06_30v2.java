package aufgaben;

/**
 *
 * @author Stefano Ricca
 * Aufgabe 1 30.06.2022 Version 2
 */
public class aufgabe01_2022_06_30v2 {
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
       System.out.println(h1_01+"\n"+"\n"+h2_02+"\n"+p1_01+p1_02+p1_03+p1_04+p1_05+"\n"+p2_01+"\n"+p3_01+"\n"+p4_01+"\n"+
               p5_01+"\n"+p6_01+p6_02+"."+p6_03+"."+p6_04+"."+p6_05+p6_06+"\n"+p7_01+p7_02+"."+p7_02+"."+p7_03+"."+p7_03+
               "\n"+p8_01+p6_02+"."+p6_03+"."+p1_02+"."+p6_02+"\n"+p9_01+p6_02+"."+p6_03+"."+p1_02+"."+p6_02);
       
   }   
}
