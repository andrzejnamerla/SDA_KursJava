package PodstawyJAVA;

/**
 * Created by RENT on 2017-07-04.
 */
public class Kalkulator {
    public static void main(String[] args) {

        int a = 20;
        float b = 6;

        System.out.println("Operacje matematyczne dla liczb " + a + " i " + b + " :");

        float dod = a + b;
        System.out.println("Dodawanie \t" + dod);

        float odej = a - b;
        System.out.println("Odejmownaie " + odej);

        float mno = a * b;
        System.out.println("Mnozenie \t"+ mno);

        float dziel = a / b;
        System.out.println("Dzielenie \t" + dziel);
    }
}
