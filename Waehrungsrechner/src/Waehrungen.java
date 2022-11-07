public class Waehrungen {

    private String variante;
    private Double faktor;

    public Waehrungen(String variante, double faktor) {
        this.variante = variante;
        this.faktor = faktor;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public Double getFaktor() {
        return faktor;
    }

    public void setFaktor(Double faktor) {
        this.faktor = faktor;
    }
}
