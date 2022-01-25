public class FourteenthTask {
    public static void calc(int nRows, int nColumns) {
        int[][] b = new int[nRows][nColumns];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = 0;
                if (i < b[i].length && i <= j) {
                    for (int h = i; h >= 0; h--) {
                        b[h][j] = 1;
                    }
                }
            }
        }
        System.out.println("final array: ");
        for (int i = 0; i < nRows; i++) {
            System.out.print("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
