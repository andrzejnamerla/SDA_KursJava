import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class PoleTrojkata {
    public static void main(String[] args) {
        System.out.println("\nObliczanie pola trojkata");
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;
        float ab;
        float ac;
        float bc;
        double p;
        double pole;

        System.out.println("Podaj dlugosc pierwszego z bokow ");
        a = scanner.nextFloat();
        System.out.println("Podaj dlugosc drugiego z bokow ");
        b = scanner.nextFloat();
        System.out.println("Podaj dlugosc tzreciego boku ");
        c = scanner.nextFloat();

        ab = a+b;
        ac = a+c;
        bc = b+c;

        if (ab > c && ac > b && bc > a){
            System.out.println("Obliczam pole...");
            p = 0.5 *(a+b+c);
            pole=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Pole trojkata to " + pole);
        } else {
            System.out.println("Nieprawidlowe wartosci, nie da sie zbudowac trojkata");
        }

    }
}
