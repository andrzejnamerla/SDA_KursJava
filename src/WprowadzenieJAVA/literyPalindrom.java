package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class literyPalindrom {
    public static void main(String[] args) {
        System.out.println("\nCzy wyrazenie jest palindromem");
        Scanner scanner = new Scanner(System.in);

        String napis;
        String napisWynik = " ";

        System.out.println("Podaj napis skladajacy sie z maksymalnie 30 znakow (liter)");
        napis = scanner.next();
        //sprawdzamy dlugosc zankow
        if (napis.length()<30){
            //moze sprobowac rozwiazac to while
            for (int j=0; j<napis.length(); j++){
                char znak = napis.charAt(j);
                napisWynik += znak;
            }
        } else {
            System.out.println("Za duza ilosc liter");
        }
        System.out.println(napisWynik);
    }
}
