public class FirstTask {
    public static void calc(int nRows, int nColumns, double[][] b) {
        for (int i = 0; i < nColumns; i++) {
            if (i % 2 == 0) {
                if (b[0][i] > b[nRows - 1][i]) {
                    System.out.println("column number " + i + 1);
                    for (int j = 0; j < nRows; j++) {
                        System.out.println(b[j][i]);
                    }
                }
            }
        }
    }
}
