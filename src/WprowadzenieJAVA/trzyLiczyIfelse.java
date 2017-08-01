package WprowadzenieJAVA;

import java.util.Scanner;

/*
 * Created by RENT on 2017-07-05.
 */
public class trzyLiczyIfelse {
    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby. \nPierwsza liczba: ");
        Scanner scanner = new Scanner(System.in);
        int pierwsza = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int druga = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int trzecia = scanner.nextInt();

        String najwieksza = "Najwieksza liczba to ";
        String najmniejsza = "Najmniejsza liczba to ";

        if (pierwsza > druga && pierwsza > trzecia) {
            System.out.println(najwieksza + pierwsza);
        } else if (druga > trzecia) {
            System.out.println(najwieksza + druga);
        } else {
            System.out.println(najwieksza + trzecia);
        }

        //pierwsza metoda
        if (pierwsza < druga && pierwsza < trzecia) {
            System.out.println(najmniejsza + pierwsza);
        } else if (druga < trzecia){
            System.out.println(najmniejsza + druga);
        } else {
            System.out.println(najmniejsza + trzecia);
        }

        //druga metoda
        System.out.println("\nDruga metoda wybierania.");
        int max; //dodatkowa zmienna, powinna byc zadeklarowana na pocztaku programu
        int min;

            //porownywanie pierwszych dwoch
        if (pierwsza > druga){
            max = pierwsza;
            min = druga;
        } else {
            max = druga;
            min = pierwsza;
        }
            //porownywanie z trzeca
        if (trzecia > max) {
            max = trzecia;
        }
        if (trzecia < min) {
            min = trzecia;
        }

        System.out.println(najwieksza + max);
        System.out.println(najmniejsza + min);


    }
}
