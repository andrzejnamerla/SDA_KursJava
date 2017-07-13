package PodstawyJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class ZliczanieZnakow2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny napis (bez znaku dolara)");

        String napis = scanner.nextLine();


        int licznik = 0;
        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            if (znak == '$') {
                System.out.println("nie dozwolony znak");
                break;                  //wychodzi calkowice z petli
            } else if (znak == ' '){
                continue;               //wychodzi tylko z tej konkretnej iteracji petli
            }
            licznik++;
        }
        System.out.println("Dlugosc napisu bez bialych znakow to " + licznik);
    }
}

