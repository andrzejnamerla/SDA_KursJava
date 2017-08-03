package PodstawyJava.Stos.Prosta;


public class StosMain {
    public static void main(String[] args) {
        Stos stos = new Stos(10);

        stos.push(4);
        stos.push(6);
        stos.push(10);

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());


    }
}
