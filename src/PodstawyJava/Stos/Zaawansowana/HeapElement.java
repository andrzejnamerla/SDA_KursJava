package PodstawyJava.Stos.Zaawansowana;

public class HeapElement {
    private int Value;
    private HeapElement Prev = null;

    public HeapElement(int value, HeapElement prev) {
        this.Value = value;
        this.Prev = prev;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        this.Value = value;
    }

    public HeapElement getPrev() {
        return Prev;
    }

    public void setPrev(HeapElement prev) {
        this.Prev = prev;
    }
}
