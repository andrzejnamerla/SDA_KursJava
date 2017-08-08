package PodstawyJava.Lista;

public class ListaMergeSort {
    private ListElement first = null;
    private ListElement last = null;
    private int counter = 0;

    public ListaMergeSort(ListElement first, ListElement last, int counter) {
        this.first = first;
        this.last = last;
        this.counter = counter;
    }

    public ListaMergeSort() {

    }

    public void sortMerge() {
        int newCounter = (int) Math.floor(this.counter / 2); //lub this.counter / 2

        ListElement current = this.first;

        for (int i = 0; i < newCounter; i++) {
            current = current.getNext();
        }


        ListaMergeSort newList1 = new ListaMergeSort(this.first, current.getPrev(), newCounter);
        ListaMergeSort newList2 = new ListaMergeSort(current, this.last, this.counter - newCounter);


        current.getPrev().setNext(null);
        current.setPrev(null);

        if (newCounter > 1) {
            newList1.sortMerge();
        }

        if ((this.counter - newCounter) > 1) {
            newList2.sortMerge();
        }

        newList1.mergeLists(newList2);

        this.first = newList1.getFirst();
        this.last = newList1.getLast();

    }

    public void add(int el) {
        counter++;

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

    public void mergeLists(ListaMergeSort listaMergeSort) {
        ListElement element = null;
        ListElement current = this.first;

        while ((element = listaMergeSort.get()) != null) {
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > element.getValue()) {
                    element.setPrev(current.getPrev());
                    current.setPrev(element);
                    element.setNext(current);
                    if (element.getPrev() != null) {
                        element.getPrev().setNext(element);
                    } else {
                        this.first = element;
                    }
                    isAdded = true;
                } else {
                    current = current.getNext();
                }
            }

            if (!isAdded) {
                current = element;
                element.setPrev(this.last);
                this.last.setNext(element);
                this.last = element;
            }
        }
    }

    public ListElement get() {
        if (this.first != null && this.last != null) {
            ListElement listElement = this.first;

            this.first = this.first.getNext();

            if (this.first != null) {
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }
            this.counter--;
            listElement.setNext(null);
            listElement.setPrev(null);
            return listElement;
        }
        return null;
    }

    public void addSorted(ListElement tmp) {

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

    public void print() {


        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();


        }

    }

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
}
