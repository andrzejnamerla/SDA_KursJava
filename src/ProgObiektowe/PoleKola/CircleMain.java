package ProgObiektowe.PoleKola;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-14.
 */
public class CircleMain {
    public static void main(String[] args) {
        System.out.println("\nProgram oblicza obwod i pole kola.");
        Scanner scanner = new Scanner(System.in);
        //definicja obiektow
        Circle kolo1 = new Circle();
        Circle kolo2 = new Circle();

        System.out.println("Podaj promein: ");
        double promien = scanner.nextDouble();
        kolo1.ustawPromien(promien);

        System.out.println("\nPierwsze Kolo: ");
        System.out.println("Wartosc promienia: " + kolo1.pobierzPromein());
        kolo1.Obwod();
        System.out.println("Pole wynosi: " + kolo1.Pole());

        /*kolo2.ustawPromien() = 10;*/
        /*System.out.println("\nDrugie Kolo: ");
        kolo2.Obwod();
        System.out.println("Pole wynosi: " + kolo2.Pole());*/




    }
}
