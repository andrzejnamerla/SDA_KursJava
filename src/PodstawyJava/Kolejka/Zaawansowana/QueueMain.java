package PodstawyJava.Kolejka.Zaawansowana;

public class QueueMain {
    public static void main(String[] args) {


        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());


    }
}
