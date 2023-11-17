//Aufagbe Eins
//Autor Alexander Strey

import java.util.Scanner;

public class AufgabeEins {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

// Variablen erstellen und es wird überprüft ob die Eingabe erlaubt ist
while (true) {
long p;
        do{
            System.out.println("Geben sie ihre Port Nummer an");
            while (!scanner.hasNextLong()) {
            scanner.next();
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
            }
             p = scanner.nextLong();
        } while (p <=0 || p >= 65535); // Bedingung

        //IF Else schleifen machen für die einzelen Arten von Ports
        
        if (p == 21)
        System.out.println("Es handelt sich um ein Well-Know Port und zwar ein FTP-Port");//FTP Port
        else 

        if (p == 23)
        System.out.println("Es handelt sich um ein Well-Know Port und zwar ein Telnet-Port");//Telnet Port
        else 

            if (p == 25)
            System.out.println("Es handel sich um ein Well-Know Port und zwar ein SMTP Port");//SMTP Port
            else

            if (p == 80)
            System.out.println("Es handelt sich um ein Well-Know Port und zwar ein HTTP Port");//HTTP Port
            else

            if (p == 143)
            System.out.println("Es handelt sich um ein Well-Know Port und zwar einIMAP Port");//IMAP Port
            else

            if (p >= 0 && p <= 1023)
            System.out.println("Well-Know Port: Sonstiger Dienst");// Well Know Port , Sonstiger Dienst
            else

            if (p >= 1024 && p <= 49151)
            System.out.println("Es handelt sich um ein registered Port");// Registered Port
            else

            if (p >=41915 && p <= 65535)
            System.out.println("Es handelt sich um dynamic ports");// Dynamic Port
            

             // Abfrage, ob der Benutzer erneut nachfragen möchte
             System.out.println("Möchten Sie eine weitere Abfrage durchführen? (ja/nein)");
             String wiederholen = scanner.next();
 
             if (!wiederholen.equalsIgnoreCase("ja")) {
                 // Wenn der Benutzer nicht wiederholen möchte, die äußere Schleife verlassen
                 break;
             }
            }

            scanner.close(); // Scanner wieder schließen für Resourcen
        
    }
}