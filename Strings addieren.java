// Aufgabe 5
// Scanner importieren
import java.util.Scanner;

public class AufgabeF�nf {
  
  public static void main(String[] args) {
    
  //Scanner erstllen f�r Benutzereingabe
  Scanner scanner = new Scanner(System.in);
  // Strings deklarieren
  String s1, s2, s3;
  
  do { 
  // Nach den W�rter abfragen die f�r s1 und s2 eingeben werden
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
    
  // Scanner schlie�en
  scanner.close();
  }
  
  // Neue Methode erstellen zur �berpr�fung f�r die Eingabe
  public static boolean nurBuchstaben(String input) {
    for (char c : input.toCharArray()) { //�ndert die Zeichenkette in ein Array um.
        if (!Character.isLetter(c)) { // �berpr�fung das es sich um Buchstaben handelt
            return false; // Nur false wenn keine Buchstaben
        }
    }
    return true; // True wenn Buchstaben enthalten sind
}
}
    