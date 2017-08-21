package PodstawyJavaGrafy.Graphs;

import java.util.Arrays;
import java.util.ArrayList;

public class Graphs {

    //Nowy Mian, pobrac poprawiona wersje z Javapoz
    public static void main(String[] args) {

        /* Generator GNP
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        */
//        generateGnp(4,0.5);

        /* Generator Gnk
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        generateGnk(4, 3);


        /* Transform A to E
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        *  */
//        transformAtoE(4, 0.5);

        /*
        * Transform E to A
        *  n - liczba naturalna
        *  k - liczba krawędzi
        * */
//        transformaEtoA(4, 3);

//        generateGnkV2(4,3);

        transformAtoS(4);
    }

    //Nowe metody
    public static void transformAtoS(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.5);
        PrintStructures.printA(a);
        StructS[] result = Transforms.transformAtoS(a, n);
//        System.out.println(result.toString());
        PrintStructures.printStructS(result);
    }

    public static void transformaEtoA(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n, k);
        PrintStructures.printE(result);
        boolean[][] a = Transforms.transformEtoA(n, result, k);
        PrintStructures.printA(a);
    }

    public static void transformAtoE(int n, double p) {
        boolean[][] a = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(a);
        Edge[] e = Transforms.transformAtoE(a, n);
        PrintStructures.printE(e);
    }

    public static void generateGnp(int n, double p) {
        boolean[][] result = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(result);
    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n,k);
        PrintStructures.printE(result);
    }

    public static void generateGnkV2(int n, int k) {
        ArrayList<EdgeV2> result = GraphGnk.generateGNKv2(n,k);
        PrintStructures.printEV2(result);
    }





    //Moj stary FileMain
   /* public static void main(String[] args) {
        System.out.println();
        int n = 4;
        int k = 4;
        double p = 0.5;

        boolean[][] resultGnp = generateGnp(n,p);
        for (boolean[] aResult : resultGnp) {
            System.out.println(Arrays.toString(aResult));
        }

        System.out.println("\n --- --- --- \n");

        //Transformata A do E
        Edge[] resultAtoE = transformAtoE(resultGnp,n);
        for (int i = resultAtoE.length-1; i>=resultAtoE.length - k; i--){
            System.out.println(resultAtoE[i].toString());
        }

        System.out.println("\n --- --- --- \n");

        //Testowe wywolanie generowania tablicy E typu Edge
        Edge[] test = generateEdgeArray(n);
        for (int i = 0; i < test.length; i++) {
            System.out.println(tes
    t[i].toString());
        }

        System.out.println("\n --- --- --- \n");

        Edge[] resultGnk = generateGnk(n, k);
        for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
            System.out.println(resultGnk[i].toString());
        }

        System.out.println("\n --- --- --- \n");

        //Transformacja E do A
        boolean[][] resultEtoA = transformEtoA(n, resultGnk, k);
        for (int i = 0; i < resultEtoA.length; i++) {
            System.out.println(Arrays.toString(resultEtoA[i]));
        }

        System.out.println("\n --- --- --- \n");
    }*/


    //Moje stare metody, przeniesione do klas
    /*
    private static Edge[] generateEdgeArray(int n) {
        int h = n * (n - 1) / 2;
        Edge[] result = new Edge[h];
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge();
                newEdge.a = i;
                newEdge.b = j;
                result[index] = newEdge;
                index++;
            }
        }
        return result;
    }

    private static boolean[][] generateGnp(int n, double p) {
        boolean[][] result = new boolean[n][n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.random() < p) {
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
            result[i][i] = true;
        }
        result[n - 1][n - 1] = true;
        return result;
    }

    private static Edge[] generateGnk(int n, int k) {
        Edge[] result = generateEdgeArray(n);
        int h = n * (n - 1) / 2;

        if (k >= h) {
            while (k > 0) {
                int r = (int) Math.floor(Math.random() * h);

                Edge BinaryTree = result[r];
                result[r] = result[h - 1];
                result[h - 1] = BinaryTree;

                h--;
                k--;
            }
        }
        return result;
    }

    private static boolean[][] transformEtoA(int n, Edge[] struct, int k) {
        boolean[][] result = new boolean[n][n];
        int h = struct.length;

        for (int i = h - 1; i > h - 1 - k; i--) {
            result[struct[i].a][struct[i].b] = true;
            result[struct[i].b][struct[i].a] = true;
        }

        return result;
    }

    private static Edge[] transformAtoE(boolean[][] a, int n) {
        Edge[] result = generateEdgeArray(n);
        int index = result.length - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) { //if true
                    result = moveItem(result, i, j, index);
                    index--;
                }
            }
        }
        return result;
    }

    private static Edge[] moveItem(Edge[] result, int i, int j, int index) {
        for (Edge e : result) {
            if (e.a == i && e.b == j) {
                Edge BinaryTree = e;
                e = result[index];
                result[index] = BinaryTree;
            }
        }
        return result;
    }*/

}
