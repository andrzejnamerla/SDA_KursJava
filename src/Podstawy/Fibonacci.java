package Podstawy;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-12.
 */
public class Fibonacci {

    public static int Fibonacci(int n){
        int fib0 = 0;
        int fib1 = 1;
        int wynik = 0;

        for (int i=1; i<n; i++){
            wynik = fib0 + fib1;
            fib0 = fib1;
            fib1 = wynik;
        }
        return wynik;
    }

    public static void ObliczanieCiaguFibonacci(){
        System.out.println("Ciag Fibonacci, podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int Fib = scanner.nextInt();
        System.out.println(Fibonacci(Fib));
    }

    public static void main(String[] args) {
        ObliczanieCiaguFibonacci();
    }
}
