package ProgObiektowe.BinomialSolver;

import java.util.Scanner;


public class BinomialSolverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nObliczanie wielomianu drugiego stopnia \nax^2 + bx + c");
        System.out.println(" Podaj a, b i c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        BinomialSolver binomialSolver = new BinomialSolver(a, b, c);
        binomialSolver.binomial();

        if (binomialSolver.getDelta() > 0) {
            System.out.println("\nWynik obliczen x1 = " + binomialSolver.getX1() + ", x2 = " + binomialSolver.getX2());
            System.out.println("Wynik dla f(x1) = " + binomialSolver.getFx1() + ", f(x2) = " + binomialSolver.getFx2());
        } else if (binomialSolver.getDelta() == 0) {
            System.out.println("\nWynik obliczen x1 = " + binomialSolver.getX1());
            System.out.println("Wynik dla f(x1) = " + binomialSolver.getFx1());
        }

        System.out.println("\n Podaj wartosc wielomianu x");
        double x = scanner.nextDouble();
        System.out.println("f(" + x + ") = " + binomialSolver.calc(x));

    }
}
