public class NinthTask {
    public static void calc(int nRows, int nColumns, double[][] b) {
        double[] a = new double[nRows];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                a[j] += b[i][j];
            }
        }
        double maxSum = a[0];
        int indexOfMaxSum = 0;
        for (int i = 0; i < nRows; i++) {
            if (a[i] > maxSum) {
                maxSum = a[i];
                indexOfMaxSum = i + 1;
            }
        }
        System.out.print("max sum " + maxSum + ", in column " + indexOfMaxSum);
    }
}
