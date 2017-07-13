package PodstawyJAVA;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class tabLiczbyLosowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] tablica = new int[30];

        for(int i=0; i<tablica.length; i++){
            tablica[i]=random.nextInt(100);
        }
        System.out.println("Podaj liczbe, sprawdze czy taka jest: ");
        int liczba = scanner.nextInt();
        boolean znaleziona=false;

        for (int i=0; i<tablica.length; i++){
            if(tablica[i]==liczba){
                znaleziona = true;
                break;
            }
        }

        if (znaleziona) {
            System.out.println("Znaleziono liczbe");
        }else {
            System.out.println("Nie znaleziono");
        }

        System.out.println();
        for (int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        for (int watosc : tablica) {
            System.out.print(watosc + " ");
        }
        System.out.println();
    }
}
