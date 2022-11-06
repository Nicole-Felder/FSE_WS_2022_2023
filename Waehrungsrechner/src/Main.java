import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("In welche Waehrung soll umgerechnet werden?");
        System.out.println("1 - Dollar");
        System.out.println("2 - Yen");
        Integer auswahl = scan.nextInt();

        if (auswahl == 1) {
            System.out.println("Ihre Auswahl ist Euro zu Dollar");
        } else if (auswahl == 2) {
            System.out.println("Ihre Auswahl ist Euro zu Yen");
        } else {
            System.out.println("Ihre Auswahl ist ungueltig!");
        }

        System.out.println("Wie viel Euro sollen umgerechnet werden?");
        Integer betrag = scan.nextInt();
        System.out.println("Der Betrag ist: " + betrag);

    }
}