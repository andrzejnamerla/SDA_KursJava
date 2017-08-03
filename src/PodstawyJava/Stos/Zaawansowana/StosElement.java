package PodstawyJava.Stos.Zaawansowana;

public class StosElement {
    private int wartosc;
    private StosElement poprzedni = null;

    public StosElement(int watrosc, StosElement poprzedni) {
        this.wartosc = watrosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public StosElement getPoprzedni() {
        return poprzedni;
    }

    public void setPoprzedni(StosElement poprzedni) {
        this.poprzedni = poprzedni;
    }
}
