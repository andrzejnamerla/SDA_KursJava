package Podstawy;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class tablicaPodnoszenieDoKwadratu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc elementow");
        int licznik;
        licznik = scanner.nextInt();
        float[] liczby = new float[licznik];

        System.out.println("Podaj kolejno liczby do podniesienia do kwadratu:  ");
        for (int i=0; i<licznik; i++){
            liczby[i]=scanner.nextFloat();
            liczby[i] = liczby[i] * liczby[i];
        }

        System.out.println("Kolejne liczby podniesione do kwadratu: ");
        for (float elem:liczby){
            System.out.print(elem + ", ");
        }



    }
}