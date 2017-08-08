package PodstawyJava.Lista;

public class ListMain {
    public static void main(String[] args) {


        //List list = new List();

        ListaMergeSort list = new ListaMergeSort();

        list.add(6);
        list.add(8);
        list.add(4);
        list.add(20);
        list.add(2);
        list.add(0);

        list.print();
        System.out.println("---");

        list.sortMerge();
        list.print();

        /*ListaMergeSort list2 = new ListaMergeSort();

        list2.add(7);
        list2.add(0);
        list2.add(9);
        list2.add(8);

        list2.print();
        System.out.println("---");

        list.mergeLists(list2);
        list.print();
        System.out.println("---");

        list2.print();*/

        /*list.addSorted(3);
        list.addSorted(1);
        list.addSorted(4);
        list.addSorted(2);
        list.addSorted(5);*/

        //list.bubbleSort();

        //list.print();
        //list.printReverse();


    }
}
