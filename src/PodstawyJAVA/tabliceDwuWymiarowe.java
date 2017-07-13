package PodstawyJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class tabliceDwuWymiarowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] macierz = new int[x][y];

        System.out.println("Podaj elementy macierzy: ");
        for (int i=0; i < macierz.length; i++) {
            for (int j=0; j < macierz[i].length; j++){
                System.out.println("Podaw wartosc " + i + " " + j + " macierzy");
                macierz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Podana macierz: ");
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                System.out.print("["+macierz[i][j]+"] ");
            }
            System.out.println();
        }
    }
}
