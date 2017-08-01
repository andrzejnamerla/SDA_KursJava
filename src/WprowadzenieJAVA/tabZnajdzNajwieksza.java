package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class tabZnajdzNajwieksza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc elementow");
        int licznik = scanner.nextInt();
        int[] tablica = new int[licznik];

        System.out.println("Podaj kolejne liczby:  ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();
        }
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max)
                max = tablica[i];
        }
        System.out.println("Najwieksza liczba to: " + max);
        }
}
