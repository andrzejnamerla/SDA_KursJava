package PodstawyJava.Lista;

public class List {
    private ListElement first;
    private ListElement last;

    public ListElement getFirst() {
        return first;
    }

    public void setFirst(ListElement first) {
        this.first = first;
    }

    public ListElement getLast() {
        return last;
    }

    public void setLast(ListElement last) {
        this.last = last;
    }

    public void add(int el) {
        ListElement tmp = new ListElement(el);
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

    public void print() {


        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();


        }

    }

    public void printReverse() {
        ListElement current = this.last;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrev();
        }
    }

    public void addSorted(int el) {
        ListElement tmp = new ListElement(el);

        if (this.first == null) {
            this.first = tmp;
            this.last = tmp;
        } else {
            ListElement current = this.first;
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > tmp.getValue()) {
                    tmp.setPrev(current.getPrev());
                    current.setPrev(tmp);
                    tmp.setNext(current);
                    if (tmp.getPrev() != null) {
                        tmp.getPrev().setNext(tmp);
                    } else {
                        this.first = tmp;
                    }
                    isAdded = true;
                }
                current = current.getNext();
            }

            if (!isAdded) {
                tmp.setPrev(this.last);
                this.last.setNext(tmp);
                this.last = tmp;
            }
        }
    }

    public void bubbleSort() {

        boolean isNotSorted = true;

        while (isNotSorted) {
            ListElement current = this.first;

            isNotSorted = false;

            if (current != null) {
                ListElement next = current.getNext();

                while (next != null) {
                    if (current.getValue() > next.getValue()) {
                        isNotSorted = true;
                        next.setPrev(current.getPrev());
                        current.setPrev(next);

                        current.setNext(next.getNext());

                        next.setNext(current);

                        if (current.getNext() != null) {
                            current.getNext().setPrev(current);
                        }

                        if (next.getPrev() != null) {
                            next.getPrev().setNext(next);
                        } else {
                            this.first=next;
                        }

                        next = current.getNext();
                    } else {
                        current = current.getNext();
                        next = next.getNext();
                    }
                }
            }
        }
    }

}
