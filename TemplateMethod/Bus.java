public class Bus extends Oeffis {

    public Bus(String start, String ziel) {
        super(start, ziel);
    }

    @Override
    public boolean sucheVerbindung(String start, String ziel) {
        System.out.println("Eine Verbindung wird gesucht ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\nVerbindung \nVon " + start + " \nNach " + ziel + " \nwurde gefunden!\n");
        return true;
    }

}
