public abstract class WR { //implements IUmrechnen

    private WR naechsterWR;

    public WR(WR naechsterWR) {
        this.naechsterWR = naechsterWR;
    }

    public double umrechnen(String variante, double betrag) {
        if (naechsterWR != null) {
            return naechsterWR.umrechnen( variante, betrag);
        } else {
            System.out.printf("Kein Währungsrechner gefunden!");
            return 0;
        }

    }
    public abstract double getFaktor();
    public abstract boolean isZustandig(String variante);
}