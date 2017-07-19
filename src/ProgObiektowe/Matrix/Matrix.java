package ProgObiektowe.Matrix;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Matrix {
    private int[][] matrix;
    private int m = 0;
    private int n = 0;

    public Matrix(int m, int n) {
        if (m < 0 && n < 0) {
            System.out.println("Nieprawidlowe wielkosci macierzy");
        } else {
            this.m = m;
            this.n = n;
        }
        matrix = new int[m][n];
    }

    public void initializMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Podaj wartsc " + i + " " + j + " macierzy ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void printMatrix() {
        System.out.println("Podana macierz: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public Matrix addMatrix(Matrix m2) {
        Matrix tmpMatrix = new Matrix(m, n);
        if (matrix.length != m2.matrix.length) {
            System.out.println("Macierze nie maja tych samych wymiarow");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    tmpMatrix.matrix[i][j] = matrix[i][j] + m2.matrix[i][j];
                    //System.out.print(" "+tmpMatrix[i][j]+" ");
                }
                //System.out.println();
            }
        }
        return tmpMatrix;

    }

    public Matrix lessMatrix(Matrix m2) {
        Matrix tmpMatrix = new Matrix(m, n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tmpMatrix.matrix[i][j] = matrix[i][j] - m2.matrix[i][j];
            }
        }
        return tmpMatrix;
    }
}
