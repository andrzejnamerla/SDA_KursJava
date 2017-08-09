package PodstawyJavaGrafy.Graphs;

public class Graphs {

    public static void main(String[] args) {

        /*boolean[][] result = generateGnp(4, 0.5);
        for (boolean[] aResult : result) {
            System.out.println(Arrays.toString(aResult));
        }*/


        //Testowe wywolanie generowania tablicy E typu Edge
        int n = 4;
        Edge[] test = generateEdgeArray(n);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i].toString());
        }

        System.out.println(" --- --- --- ");

        int k = 4;
        Edge[] resultGnk = generateGnk(n, k);
        for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
            System.out.println(resultGnk[i].toString());
        }

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
}
