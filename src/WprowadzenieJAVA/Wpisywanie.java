package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-04.
 */
public class Wpisywanie {
    public static void main(String[] args) {

        System.out.println("Jak masz na imie? (i nacinski Enter)");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();

        System.out.println("Czesc " + imie);
    }
}
