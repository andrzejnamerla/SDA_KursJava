package ProgObiektowe.Matrix;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class MathMatrix {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tworzymy pierwsza macierz \nPodaj dwa wymiary macierzy (m i n): ");
        Matrix matrix1 = new Matrix(scanner.nextInt(), scanner.nextInt());
        matrix1.initializMatrix();;
        matrix1.printMatrix();

        System.out.println("Tworzymy druga macierz \nPodaj dwa wymiary macierzy (m i n): ");
        Matrix matrix2 = new Matrix(scanner.nextInt(), scanner.nextInt());
        matrix2.initializMatrix();
        matrix2.printMatrix();

        System.out.println("\nWynik dodawania macierzy: ");
        Matrix wynik = matrix1.addMatrix(matrix2);
        wynik.printMatrix();

        System.out.println("\nWynik odejmowania macierzy");
        Matrix wynik2 = matrix1.lessMatrix(matrix2);
        wynik2.printMatrix();
    }
}
