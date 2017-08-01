package PodstawyJavaAlgorytmy.InsertSort;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class Insert {

    public static void main(String[] args) {
        System.out.println("Podaj wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] tablicaWe = new int[n];

        // wypełnienie tablicy liczbami podanymi przez użytkownika
        System.out.println("Podaj kolejo " + n + " elemntow tablicy: ");
        for (int i = 0; i < tablicaWe.length; i++) {
            tablicaWe[i] = scanner.nextInt();
        }

        System.out.println("Tablica wejsciowa: ");
        for(int i = 0; i < tablicaWe.length; i++) {
            System.out.print(tablicaWe[i] + " ");
        }
        System.out.println();

        insertionsort(tablicaWe);

        System.out.println("Tablica wyjsciowa: ");
        for(int i = 0; i < tablicaWe.length; i++) {
            System.out.print(tablicaWe[i] + " ");
        }
    }

    public static void insertionsort(int[] tablica) {
        //pętla dla wartości nieposortowanych
        for (int i = 1; i < tablica.length; i++) {

            //pętla dla wartości posortowanych
            for (int j = i - 1; j >= 0; j--) {
                if (tablica[j] > tablica[j + 1]) {
                    swap(tablica, j, j + 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }
}
