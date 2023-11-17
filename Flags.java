// Aufgabe Drei
// Scanner Importieren
import java.util.Scanner;

public class AufgabeDrei {
  
  public static void main(String[] args) {
    // Scanner erstellen für Benutzereingabe
    Scanner scanner = new Scanner(System.in);  
    // Short Variable flags
    // Irgendeine Short Variable eingeben
    
    short flags = 28332;
    
    // String erstellen um den Wert von Flags in eine binäre darstellung zu bringen
    // Auch die binäre Form ausgeben
    // Es werden nur 15 Ziffern statt 16 Ausgegeben, weil der Befehl Integer.toBinaryString(flags) die short Variable in eine Int Varaiable
    // Mit dem String.format Befehl kann ich mir trotzdem 16 Ziffern anzeigen lassen.
    // Mit dem Replace Befehl gebe ich der 16. Ziffer den Wert 0
    String a = String.format("%16s", Integer.toBinaryString(flags)).replace(' ', '0');
    System.out.println("Binäre Darstellung: " + a);
    
   //Variable k den Wert abfragen und überprüfen
      byte k;
      
    do{ 
      System.out.println("Wert zwischen 0-15 eingeben");
      while (!scanner.hasNextByte()) { // Bedingung
        scanner.next(); // Verhindert das die Schleife endlos läuft
      }
       k = scanner.nextByte();
    } while ( k < 0 || k > 15); // Bedingung
    
    // Eingebene K Wert die Stelle der binären Zahl ausgeben
    // Von Position k den Bit lesen
    int bitwert = (flags >> k) & 1; // flags wird um k verschoben. Die 1 bewirkt das alles auf 0 gesetzt wird außer, das letzte.
    
    //Ausgabe
    // Unterschiedliche Ausgabe je nach, ob es 1 oder 0 ist
    // Überprüfung
    if (bitwert == 0) {
      System.out.println("Die Lampe " + k + " leuchtet nicht, weil der Wert " + bitwert + " ist");
    } else {
      System.out.println("Die Lampe " + k + " leuchtet, weil der Wert " + bitwert + " ist");
    }
    scanner.close(); // Scanner schließen
  }
}
    
    
    
    
         
    