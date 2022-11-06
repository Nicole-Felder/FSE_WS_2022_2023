import java.util.List;

public class JSONExporter extends MusikExporter {

    public JSONExporter(MusikExporter naechsterExporter) {
        super(naechsterExporter);
    }

    @Override
    public void exportieren(String format, List<Musik> musikListe) {
        if (format.equals("JSON")) {
            System.out.printf("JSON %n");
            String export = "";
            for(int i = 0; i < musikListe.size(); i++){
                Musik musik = musikListe.get(i);
                export += "{"+ musik.getName() + ";" + musik.getBand() + ";" + musik.getSongs() + "}";
                if (i< musikListe.size()){
                    export += "%n";
                }
            }
            System.out.printf(export);

        } else {
            super.exportieren(format, musikListe);
        }
    }
}
