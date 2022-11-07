public class Euro2DollarRechner extends WR {
    private double faktor;

    public Euro2DollarRechner(WR naechsterWR, double faktor) {
        super(naechsterWR);
        this.faktor = faktor;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if (isZustandig("Euro2Dollar")) {
            return betrag * getFaktor();
        } else {
            return super.umrechnen(variante, betrag);
        }
    }

    @Override
    public double getFaktor() {
        return this.faktor;
    }

    @Override
    public boolean isZustandig(String variante) {
        if (variante.equals("Euro2Dollar")) {
            return true;
        } else {
            return false;
        }
    }
}
