package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class ZliczanieZnakow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny napis");

        String napis = scanner.nextLine();

        int licznik = 0;
        for (int i = 0; i < napis.length(); i++) {
            licznik++;
        }
        System.out.println("Dlugosc napisu z bialymi znakami to " + licznik);

        int licznik2 = 0;
        for (int j = 0; j < napis.length(); j++) {
            char znak = napis.charAt(j);
            if (znak != ' ') {
                licznik2++;
            }
        }
        System.out.println("Dlugosc napisu bez bialych znakow to " + licznik2);
    }
}
