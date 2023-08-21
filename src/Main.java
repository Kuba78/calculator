import java.util.Scanner;

public class Main {
    private static final Scanner eingabe = new Scanner(System.in);

    public static void main (String[] args) {
        while (true) {
            System.out.println("Hauptmenue");
            System.out.println("==========");
            System.out.println("1 - addieren");
            System.out.println("2 - subtrahieren");
            System.out.println("3 - multiplizieren");
            System.out.println("4 - dividieren");
            System.out.println("5 - Rechner beenden");

            int auswahl = eingabe.nextInt();
            if (auswahl == 5) {
                System.out.println("Rechner wird beendet.");
                break;
            }

            System.out.print("Bitte gib die erste Zahl ein: ");
            int zahl1 = eingabe.nextInt();
            System.out.print("Bitte gib die zweite Zahl ein: ");
            int zahl2 = eingabe.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Ergebnis: " + addieren(zahl1, zahl2));
                    break;
                case 2:
                    System.out.println("Ergebnis: " + subtrahieren(zahl1, zahl2));
                    break;
                case 3:
                    System.out.println("Ergebnis: " + multiplizieren(zahl1, zahl2));
                    break;
                case 4:
                    if (zahl2 != 0) {
                        System.out.println("Ergebnis: " + dividieren(zahl1, zahl2));
                    } else {
                        System.out.println("Division durch Null ist nicht erlaubt.");
                    }
                    break;
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }
    }

    private static int addieren(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    private static int subtrahieren(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    private static int multiplizieren(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    private static double dividieren(int zahl1, int zahl2) {
        return (double) zahl1 / zahl2;
    }
}


