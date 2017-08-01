package PodstawyJavaAlgorytmy.BubblesSort;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */

public class bubbles {


        public static void main(String[] args) {


            System.out.println("Podaj wielkość tablicy");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int[] tablicaWe = new int[n];

            // wypełnienie tablicy liczbami podanymi przez użytkownika
            System.out.println("Podaj kolejo "+ n +" elemntow tablicy: ");
            for (int i =0; i < tablicaWe.length; i++) {
                tablicaWe[i] = scanner.nextInt();
            }

            System.out.println("Tablica wejsciowa: ");
            for(int i = 0; i < tablicaWe.length; i++) {
                System.out.print(tablicaWe[i] + " ");
            }
            System.out.println();

            bubbleSort(tablicaWe);

            System.out.println("Tablica wyjsciowa: ");
            for(int i = 0; i < tablicaWe.length; i++) {
                System.out.print(tablicaWe[i] + " ");
            }


        }


        public static int[] bubbleSort(int[] tab) {
            int n=tab.length-1;
            boolean zamiana=true;
            while (zamiana) {
                zamiana = false;
                while (n > 0) {
                    if (tab[n] < tab[n - 1]) {
                        int temp = tab[n];
                        tab[n] = tab[n - 1];
                        tab[n - 1] = temp;
                        zamiana = true;
                    }
                    n--;
                }
                n=tab.length-1;
            }

            return tab;
        }

/*
        public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
        }
*/

}




