import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class bmi {
    public static void main(String[] args) {
        System.out.println("Kalkulator BMI");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj wzrost (w metrach) ");
        float wzrost = scanner.nextFloat();
        System.out.println("Podaj swoja wage (w kg)");
        float waga = scanner.nextFloat();

        float bmi = waga / (wzrost * wzrost);
        System.out.println("Twoje BMI to: " + bmi);

        if (bmi < 18.5){
            System.out.println("Masz niedowage");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Waga okej");
        } else {
            System.out.println("Masz nadwage");
        }

        /*
        if (bmi < 18.5){
            System.out.println("Masz niedowage");
        } else if (bmi > 25) {
            System.out.println("Masz nadwage");
        } else {
            System.out.println("Waga ok");
        }
        */

    }
}
