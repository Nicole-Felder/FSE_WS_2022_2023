import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oeffis oeffis = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Wo möchten Sie losfahren? ");
        String start = scan.nextLine();
        System.out.print("Wohin möchten Sie fahren? ");
        String ziel = scan.nextLine();
        System.out.print("Wie viele Personen? ");
        int anzahl = scan.nextInt();

        System.out.println("\nMit was möchten Sie fahren?\n" +
                "1 - Bus\n" +
                "2 - Strassenbahn");
        int auswahl = scan.nextInt();

        if (auswahl == 1) {
            oeffis = new Bus(start, ziel);
        } else if (auswahl == 2) {
            oeffis = new Strassenbahn(start, ziel, anzahl);
        }
        oeffis.sucheVerbindung(start, ziel);
    }
}