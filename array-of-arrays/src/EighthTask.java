public class EighthTask {
    public static void calc(int nRows, int nColumns, double[][] b, int k, int p) {
        double[] a = new double[nRows];
        System.out.print("original array of arrays: ");
        for (int i = 0; i < nRows; i++) {
            System.out.print("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        for (int i = 0; i < nRows; i++) {
            a[i] = b[i][k - 1];
        }
        for (int i = 0; i < nRows; i++) {
            b[i][k - 1] = b[i][p - 1];
        }
        for (int i = 0; i < nRows; i++) {
            b[i][p - 1] = a[i];
        }
        System.out.print("\nfinal array of arrays: ");
        for (int i = 0; i < nRows; i++) {
            System.out.print("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
