//Aufgabe 2
// Scanner Bibliothek importieren
import java.util.Scanner;

public class AufgabeZwei {
  
public static void main(String[] args) {
  // Scanner erstellen, der die Benutzer eingabe ermöglicht
  
  Scanner scanner = new Scanner(System.in);
  
  // Die Variablen deklarieren
  char a, b, c, d;
  
        // Nach dem ersten Buchstaben fragen
  // Überprüfen ob es eine richtige Eingabe ist. Bedingung: Es muss ein Buchstabe sein
  do {
        System.out.print("Erster Buchstabe: ");
         a = scanner.next().charAt(0);
  } while (!Character.isLetter(a)); // Bedingung
  
  // Nach dem zweiten Buchstaben fragen
  do {
        System.out.print("Zweiter Buchstabe: ");
         b = scanner.next().charAt(0);
  } while (!Character.isLetter(b)); // Bedingung

  //Nach dem dritten Buchstaben fragen
  do {
        System.out.print("Dritter Buchstabe: ");
         c = scanner.next().charAt(0);
  } while (!Character.isLetter(c));// Bedingung
  
  // Nach dem vierten Buchstaben fragen
   do {
        System.out.print("Vierter Buchstabe: ");
         d = scanner.next().charAt(0);
  } while (!Character.isLetter(d)); // Bedingung
  
           // Nach m Fragen 
            System.out.println("Gib der Konstante m einen Wert");
            while (!scanner.hasNextInt()) {      // Prüft ob es sich um eine Ganzzahl handelt(Bedingung)
              scanner.next(); // Verhindert das die Schleife endlos läuft
            }
        int m = scanner.nextInt();
 
    //Berechnung des Hash-Werts
    
    int hashwert = (a + b + c + d) % m;
    
    //Ausgabe
    System.out.println("Der Hashwert ist:" + hashwert);
    
    scanner.close(); // Scanner schließen
   }
}
      