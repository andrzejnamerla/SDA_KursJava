package ProgObiektowe.abstractExample;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-24.
 */
public class abstractMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura[] figuras = new Figura[10];
        boolean exit = false;
        int opcja;
        int licznikFigur = 0;

        while (exit == false) {
            System.out.println("\nDostepne metody do obliczen pola i obwodu dla fidur \n(maksymalnie 10 figur): \n1. Kwadrat \n2. Prostokat \n3. Kolo \n4. Wyswietl obliczone wyniki \n0. Koniec");
            opcja = scanner.nextInt();
            switch (opcja) {
                case 1: {
                    System.out.println("Podaj dlugosc boku (a) ");
                    figuras[licznikFigur] = new Kwadrat(scanner.nextDouble());
                    System.out.println(figuras[licznikFigur].ObliczPole());
                    System.out.println(figuras[licznikFigur].ObliczObwod());
                    licznikFigur++;
                    break;
                }
                case 2: {
                    System.out.println("Podaj dlugosc bokow (a i b) ");
                    figuras[licznikFigur] = new Prostokat(scanner.nextDouble(), scanner.nextDouble());
                    System.out.println(figuras[licznikFigur].ObliczPole());
                    System.out.println(figuras[licznikFigur].ObliczObwod());
                    licznikFigur++;
                    break;
                }
                case 3: {
                    System.out.println("Podaj promien (r) ");
                    figuras[licznikFigur] = new Kolo(scanner.nextDouble());
                    System.out.println(figuras[licznikFigur].ObliczPole());
                    System.out.println(figuras[licznikFigur].ObliczObwod());
                    licznikFigur++;
                    break;

                }
                case 4: {
                    System.out.println("Wyswietlam wszystkie zapisane figury: ");
                    for (int i = 0; i < licznikFigur; i++) {
                        System.out.println((i + 1) + ". " + figuras[i].getOpis() + " pole: " + figuras[i].getPole() + ", obwod: " + figuras[i].getObwod());
                    }
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Nie prawidlowy wybor");
                    break;
                }
            }
        }
    }
}
