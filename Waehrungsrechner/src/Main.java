import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String variante;
        Double ergebnis;

        Scanner scan = new Scanner (System.in);
        System.out.println("In welche Waehrung soll umgerechnet werden?");
        System.out.println("1 - Dollar");
        System.out.println("2 - Yen");
        Integer auswahl = scan.nextInt();


        if (auswahl == 1) {
            //setVariante("Euro2Dollar");
            variante = "Euro2Dollar";
            System.out.println("Ihre Auswahl ist Euro zu Dollar");
        } else if (auswahl == 2) {
            //setVariante("Euro2Yen");
            variante = "Euro2Yen";
            System.out.println("Ihre Auswahl ist Euro zu Yen");
        } else {
            variante = "";
            System.out.println("Ihre Auswahl ist ungueltig!");
        }

        System.out.println("Wie viel Euro sollen umgerechnet werden?");
        
        Integer betrag = scan.nextInt();
        System.out.println("Der Betrag ist: " + betrag);

        List<Waehrungen> umrechnerListe = new ArrayList<>();
        umrechnerListe.add(new Waehrungen("Euro2Dollar", 1.1));
        umrechnerListe.add(new Waehrungen("Euro2Yen", 147));

/*
        WaehrungenExporter kette = new CSVExporter(new JSONExporter(null));
        kette.exportieren("CSV", umrechnerListe);
        kette.exportieren("JSON", umrechnerListe);

 */

        WR waehrungsrechner = new Euro2YenRechner(new Euro2DollarRechner(null, 1.1), 147);
        ergebnis = waehrungsrechner.umrechnen(variante, betrag);
        //ergebnis = waehrungsrechner.umrechnen(variante, betrag);

        //Double ergebnis = waehrungsrechner.umrechnen(variante, betrag);

        System.out.println(betrag + " " + variante + " ergibt " + ergebnis);
    }

    /* 
    public String variante;

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
    */
}