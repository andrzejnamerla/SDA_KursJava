package PodstawyJava.Stos.Zaawansowana;

public class StosMain {
    public static void main(String[] args) {
        Stos stos = new Stos();

        stos.push(1);
        stos.push(2);
        stos.push(3);
        stos.push(4);
        stos.push(5);

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());

    }
}
