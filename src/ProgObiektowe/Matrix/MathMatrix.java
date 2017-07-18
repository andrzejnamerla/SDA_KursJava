package ProgObiektowe.Matrix;

/**
 * Created by RENT on 2017-07-18.
 */
public class MathMatrix {
    public void start(){
        System.out.println("Tworzymy pierwsza macierz ");
        Matrix matrix1 = new Matrix();
        matrix1.initializMatrix();;
        matrix1.printMatrix();

        System.out.println("Tworzymy druga macierz ");
        Matrix matrix2 = new Matrix();
        matrix2.initializMatrix();
        matrix2.printMatrix();

        System.out.println("\nWynik dodawania macierzy: ");
        matrix1.addMatrix(matrix2).printMatrix();
    }
}
