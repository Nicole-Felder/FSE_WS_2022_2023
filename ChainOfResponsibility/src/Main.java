import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musik> musikListe = new ArrayList<>();
        musikListe.add(new Musik("Arbeitslos durch die Nacht", "Turbobier", 1));
        musikListe.add(new Musik("Das fliegende Hochhaus", "Graffitibrüder", 57));

        MusikExporter kette = new CSVExporter(new JSONExporter(null));
        kette.exportieren("CSV", musikListe);
        kette.exportieren("JSON", musikListe);
    }
}