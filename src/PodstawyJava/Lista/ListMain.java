package PodstawyJava.Lista;

public class ListMain {
    public static void main(String[] args) {


        List list = new List();

        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        /*list.addSorted(3);
        list.addSorted(1);
        list.addSorted(4);
        list.addSorted(2);
        list.addSorted(5);*/

        list.bubbleSort();

        list.print();
        //list.printReverse();






    }
}
