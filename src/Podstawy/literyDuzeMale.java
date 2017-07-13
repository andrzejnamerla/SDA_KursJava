package Podstawy;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class literyDuzeMale {
    public static void main(String[] args) {
        System.out.println("\nZamiana duzych liter na male i odwrotnie");
        Scanner scanner = new Scanner(System.in);

        String napis;

        System.out.println("Podaj napis skladajacy sie z maksymalnie 30 znakow (liter)");
        napis = scanner.next();

        if (napis.length()<30){
            System.out.println("Podales odpowiednio dlugi napis");
            System.out.println("Dostepne funkcje: \n1 zamiana wszystkich liter na duze \n2 zamiana wszystkich liter na male \n3 zamiana duzych liter na male i malych na duze");
            int opcja = scanner.nextInt();
            String napisWynik = " ";
            switch(opcja){
                case 1:{
                    for (int i=0; i<napis.length(); i++) {
                        char znak = napis.charAt(i);
                        //sprawdzam czy znak jest mala litera
                        if (znak >= 97 && znak <= 122) {
                            znak -= 32;
                        }
                        napisWynik += znak;
                    }
                    System.out.println("Wynik operacji: " + napisWynik);
                    break;
                    }
                case 2: {
                    for (int i = 0; i < napis.length(); i++) {
                        char znak = napis.charAt(i);
                        //sprawdzam czy znak jest duza litera
                        if (znak >= 65 && znak <= 90) {
                            znak += 32;
                        }
                        napisWynik += znak;
                    }
                    System.out.println("Wynik operacji: " + napisWynik);
                    break;
                }
                case 3: {
                    for (int i=0; i<napis.length(); i++) {
                        char znak = napis.charAt(i);
                        if (znak >= 97 && znak <= 122) {
                            znak -= 32;
                        } else if (znak >= 65 && znak <= 90){
                            znak += 32;
                        }
                        napisWynik += znak;
                    }
                    System.out.println("Wynik operacji: " + napisWynik);
                    break;
                }
                default:
                    System.out.println("Nieprawidlowy wybor");
                    break;
            }
        } else {
            System.out.println("Za duza ilosc liter");
        }
    }
}
