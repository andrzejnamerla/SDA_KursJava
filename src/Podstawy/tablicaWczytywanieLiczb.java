package Podstawy;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class tablicaWczytywanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int licznik;

        System.out.println("Podaj ilosc liczb do wczytania: ");
        licznik = scanner.nextInt();

        if (licznik>=1 && licznik<=30){
            System.out.println("Wprowadz nastepujaca ilosc liczb " + licznik);
            int[] tablicaLiczb = new int[licznik];
            for (int i=0; i<tablicaLiczb.length; i++){
                System.out.println("Podaj " + (i+1) +" liczbe:");
                tablicaLiczb[i]=scanner.nextInt();

            }
            System.out.println("Wszystkie wprowadzone liczby tablicy: ");
            //pierwszy sposob wyswietlania tablicy
            for (int i=0; i<tablicaLiczb.length; i++) {
                System.out.print(tablicaLiczb[i] + ", ");
            }
            System.out.println("\n");
            //drugi sposob wyswietlania tablicy, petla for each dla tablic
            for (int elem: tablicaLiczb){
                System.out.print(elem + ", ");

                //"ciagniecie" danej lini ctrl + shift + strzalki
                //"elegancka" zamiana nazwy danej zmiennej shift + F6
            }

        } else {
            System.out.println("Zla ilosc liczb do wczytania");
        }
    }
}