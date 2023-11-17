// Aufgabe 5
// Scanner importieren
import java.util.Scanner;

public class AufgabeFünf {
  
  public static void main(String[] args) {
    
  //Scanner erstllen für Benutzereingabe
  Scanner scanner = new Scanner(System.in);
  // Strings deklarieren
  String s1, s2, s3;
  
  do { 
  // Nach den Wörter abfragen die für s1 und s2 eingeben werden
  System.out.println("Erstes Wort");
  s1 = scanner.nextLine(); 
  
  } while (!nurBuchstaben(s1));
  
  do{
  System.out.println("Zweites Wort");
     s2 = scanner.nextLine();
     
  } while (!nurBuchstaben(s1));
    
  
    //Den dritten String s3 erzeugen mit Leerzeichen
     s3 = s1 + " " + s2;
  
  //Ausgabe
  System.out.println("Ergebnis: " +s3);
    
  // Scanner schließen
  scanner.close();
  }
  
  // Neue Methode erstellen zur Überprüfung für die Eingabe
  public static boolean nurBuchstaben(String input) {
    for (char c : input.toCharArray()) { //Ändert die Zeichenkette in ein Array um.
        if (!Character.isLetter(c)) { // Überprüfung das es sich um Buchstaben handelt
            return false; // Nur false wenn keine Buchstaben
        }
    }
    return true; // True wenn Buchstaben enthalten sind
}
}
    