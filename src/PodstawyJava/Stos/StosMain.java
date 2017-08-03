package PodstawyJava.Stos;


public class StosMain {
    public static void main(String[] args) {
        Stos stos = new Stos(10);

        stos.pusch(4);
        stos.pusch(6);
        stos.pusch(10);

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());


    }
}
