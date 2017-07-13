package PodstawyJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n (obliczanie silni)");
        int n = scanner.nextInt();

        int wynik = 1;
        for (int i=1; i<=n; i++){
            wynik = wynik *i;

        }
        System.out.println("Wynik to " + wynik);
    }
}
