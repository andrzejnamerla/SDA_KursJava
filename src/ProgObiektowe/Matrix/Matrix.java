package ProgObiektowe.Matrix;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Matrix {
    private int[][] matrix;
    private int m;
    private int n;

    public Matrix() {
        m = 3;
        n = 3;
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


    public Matrix addMatrix(Matrix m) {
        Matrix tmpMatrix = new Matrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tmpMatrix.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
                //System.out.print(" "+tmpMatrix[i][j]+" ");
            }
            //System.out.println();
        }
        return tmpMatrix;
    }
}
