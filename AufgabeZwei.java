//Aufgabe Zwei
//Autor Alexander Strey


import java.util.Scanner;

public class AufgabeZwei {
    
    // Methode zur Verschlüsselung eines Strings mit der Cäsar-Verschlüsselung
    public static String verschlüsselung(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Überprüfen, ob das Zeichen ein Großbuchstabe ist
            if (Character.isUpperCase(ch)) {
                char gb = (char) ((ch + shift - 'A') % 26 + 'A');
                result.append(gb);
            }
            // Überprüfen, ob das Zeichen ein Kleinbuchstabe ist
            else if (Character.isLowerCase(ch)) {
                char kb = (char) ((ch + shift - 'a') % 26 + 'a');
                result.append(kb);
            }
            // Wenn das Zeichen kein Buchstabe ist, füge es unverschlüsselt hinzu
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        // Abfrage der n-Variable und Überprüfung
        do{
            System.out.println("Geben sie Ihre Wert für die Ver- oder entschlüsselung ein zwischen 0 und 25");
            while (!scanner.hasNextInt()) {
            scanner.next();
            }
             n = scanner.nextInt();
        } while (n <=0 || n >= 26);
    
 
        scanner.nextLine(); // Leerzeichen konsumieren

        //Nachfragen eines Strings
        System.out.print("Geben Sie den zu verschlüsselnden/entschlüsselnden Text ein: ");
        String text = scanner.nextLine();

        //Nachfragen ob verschlüsselt oder es entschlüsselt werden soll
        System.out.print("Möchten Sie den Text verschlüsseln (v) oder entschlüsseln (e)? ");
        String choice = scanner.nextLine();

        String result = "";

        //Verschlüssungen oder Entschlüsselung ausgeben
        if (choice.equalsIgnoreCase("v")) {
            result = verschlüsselung(text, n);
            System.out.println("Verschlüsselter Text: " + result);
        } else if (choice.equalsIgnoreCase("e")) {
            result = verschlüsselung(text, 26 - n); // Entschlüsselung ist Verschlüsselung mit dem Gegenwert
            System.out.println("Entschlüsselter Text: " + result);
        } else {
            System.out.println("Ungültige Eingabe für die Auswahl.");
        }

        scanner.close();
    }
}