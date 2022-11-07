public class Euro2YenRechner extends WR {
    private double faktor;

    public Euro2YenRechner(WR naechsterWR, double faktor) {
        super(naechsterWR);
        this.faktor = faktor;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if (isZustandig("Euro2Yen")) {
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
        if (variante.equals("Euro2Yen")) {
            return true;
        } else {
            return false;
        }
    }
}
