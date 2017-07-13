package PodstawyJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Tablica {
    public static void main(String[] args) {
        System.out.println("\nTworzymy tablice");
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];

        for (int i=0; i < liczby.length; i++){
            System.out.println("Wpisz " + (i+1) + " element tablicy");
            int element = scanner.nextInt();
            liczby[i]=element;
        }
        System.out.println("Wyswietlam dane zapisane w tablicy");
        for (int i=0; i < liczby.length; i++){
            System.out.print(liczby[i] + ", ");
        }
        System.out.println("\n");
    }
}
