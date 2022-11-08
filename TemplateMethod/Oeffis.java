public abstract class Oeffis
{

    private String start;
    private String ziel;

    public Oeffis(String start, String ziel) {
        this.start = start;
        this.ziel = ziel;
    }

    public String getstart() {
        return start;
    }

    public void setstart(String start) {
        this.start = start;
    }

    public String getziel() {
        return ziel;
    }

    public void setziel(String ziel) {
        this.ziel = ziel;
    }

    public void post(){

       sucheVerbindung(this.start, this.ziel);
    }

    abstract boolean sucheVerbindung(String start, String ziel);
}
