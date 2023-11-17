//Aufgabe 1: Berechnung der n�chsten Zahl
// Autor: Alexander Strey
import java.util.Random;
import java.util.Scanner;

public class AufgabeEins {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int a, b, m; // Au�erhalb der Schleife deklarieren
    
    // Benutzer fragen welche Werte er in den Variable m�chte
    //Variable a Eingeben
    // �berpr��fen ob es eine Zul��ssige Eingabe ist
  do {
            System.out.println("Gib der Konstante a einen positiven Wert");
            while (!scanner.hasNextInt()) {        // Pr�ft ob es sich um eine Ganzzahl handelt    
              scanner.next(); // Verhinder das die Schleife endlos l�uft
            }
            a = scanner.nextInt();
  } while (a <= 0); // Schleife wiederholt sich bis a>0 ist
  
    // Variable b eingeben
         do {
            System.out.println("Gib der Konstante b einen positiven Wert");
            while (!scanner.hasNextInt()) {       // Pr�ft ob es sich um eine Ganzzahl handelt
              scanner.next(); // Verhinder das die Schleife endlos läuft
            }
            b = scanner.nextInt();
         } while ( b <= 0); // Schleife wiederholt sich bis b>0 ist
         
        // Variable m Eingeben
      do {
            System.out.println("Gib der Konstante m einen positiven Wert");
            while (!scanner.hasNextInt()) {      // Pr�ft ob es sich um eine Ganzzahl handelt
              scanner.next(); // Verhinder das die Schleife endlos l�uft
            }
            m = scanner.nextInt();
        } while (m <= 0);  // Schleife wiederholt sich bis m>0 ist
           
        // Der Variablen einen Zuf�lligen Z Wert geben mit der Klasse "Random"
        Random rand = new Random();
        int z = 3;
          
        //Berechnung der Zufallszahl
        //int Zufallszahl = (a * z + b) % m;
        
        for (int i=0; i<=100;i++) {
          z = (a * z + b)% m;
         System.out.println("N�chsten Zufallszahl lauten: " + z);
        }
        
        //Ausgabe
        
        
        // Scanner wieder schlie�en     
        scanner.close();
         }    
}
