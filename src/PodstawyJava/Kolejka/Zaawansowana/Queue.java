package PodstawyJava.Kolejka.Zaawansowana;

public class Queue {
    private QueueElement first;
    private QueueElement last;

    public void add(int el) {
        QueueElement tmp = new QueueElement(el);
        tmp.setPrev(this.last);

        if (this.last != null) {
            this.last.setNext(tmp);
        }

        this.last = tmp;

        if (this.first == null) {
            this.first = tmp;
        }

    }

    public int get() {
        if (this.first != null && this.last != null) {
            int value = this.first.getValue();

            this.first = this.first.getNext();

            if (this.first != null) {
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }
            return value;
        } else {
            return -1;
        }
    }


}
