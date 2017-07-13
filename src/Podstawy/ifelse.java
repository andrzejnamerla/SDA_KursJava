package Podstawy;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class ifelse {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();

        if (wiek>18){
            System.out.println("jestes pelnoletni");
        }
            else {
            System.out.println("nie jestes pelnoletni");
        }
    }
}