public class ThirdTask {
    public static void calc(int nRows, int nColumns, double[][] b, int k, int p) {
        System.out.println("row number " + k);
        for (int i = 0; i < nColumns; i++) {
            System.out.print(b[k - 1][i] + " ");
        }
        System.out.println("\n" + "column number " + p);
        for (int i = 0; i < nColumns; i++) {
            System.out.print(b[i][p - 1] + " ");
        }
    }
}
