package ProgObiektowe.excepions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-25.
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{11, 22, 33, 44, 55};
        System.out.println("Podaj element ktory chce wyswietlic: ");
        int numer=-1;

        try {
            numer = scanner.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Nie podales liczby");
        }

        try {
            System.out.println("Twoj element tablicy to " + arr[numer]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nie ma takiego elementu tablicy " + ex.getMessage() + "\n");
            //lub
            //ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Wystapil ogolny wyjatek " + ex.getMessage());
        } finally {
            System.out.println("Jestem w bloku finally i sprztamy");
        }
        System.out.println("END");

    }
}
