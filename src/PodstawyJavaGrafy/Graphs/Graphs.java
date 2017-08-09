package PodstawyJavaGrafy.Graphs;

import java.util.Arrays;

public class Graphs {

    public static void main(String[] args) {
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
            System.out.println(test[i].toString());
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
    }

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

                Edge tmp = result[r];
                result[r] = result[h - 1];
                result[h - 1] = tmp;

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
                Edge tmp = e;
                e = result[index];
                result[index] = tmp;
            }
        }
        return result;
    }
}
