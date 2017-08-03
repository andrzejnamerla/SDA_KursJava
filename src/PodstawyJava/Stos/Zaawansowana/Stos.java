package PodstawyJava.Stos.Zaawansowana;

public class Stos {
    private StosElement gora = null;

    public void push(int el) {
        StosElement tmp = new StosElement(el, this.gora);
        this.gora = tmp;
    }

    public int pop() {

        int tmp = gora.getWartosc();
        gora = gora.getPoprzedni();
        return tmp;
    }
}
