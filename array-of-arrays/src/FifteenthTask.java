public class FifteenthTask {
    public static void calc(int nRows, int nColumns, int[][] b) {
        int maxNumber = b[0][0];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                if (b[i][j] > maxNumber) maxNumber = b[i][j];
            }
        }
        System.out.println("Original array: ");
        for (int i = 0; i < nRows; i++) {
            System.out.println("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                if (b[i][j] % 2 != 0) b[i][j] = maxNumber;
            }
        }
        System.out.println("\nFinal array: ");
        for (int i = 0; i < nRows; i++) {
            System.out.println("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
