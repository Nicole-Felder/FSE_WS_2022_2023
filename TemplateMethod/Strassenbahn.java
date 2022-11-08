public class Strassenbahn extends Oeffis {

    private int anzahl;

    public Strassenbahn(String benutzername, String passwort, int anzahl) {
        super(benutzername, passwort);
        this.anzahl = anzahl;
    }

    @Override
    public boolean sucheVerbindung(String start, String ziel) {
        System.out.println("Eine Verbindung wird gesucht ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\nVerbindung: \nVon " + start + " \nNach " + ziel + " \nFür " + anzahl + " Personen \nwurde gefunden!\n");
        return true;
    }
}
