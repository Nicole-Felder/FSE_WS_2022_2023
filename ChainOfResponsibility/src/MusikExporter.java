import java.util.List;

public abstract class MusikExporter {

    private MusikExporter naechsterMusikExporter;

    public MusikExporter(MusikExporter naechsterMusikExporter) {
        this.naechsterMusikExporter = naechsterMusikExporter;
    }

    public void exportieren(String format, List<Musik> musikListe) {
        if (naechsterMusikExporter != null) {
            naechsterMusikExporter.exportieren(format, musikListe);
        }
        else {
            System.out.printf("Nichts zum Exportieren gefunden %n");
        }
    }
}
