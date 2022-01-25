public class SeventhTask {
    public static void calc(int n) {
        double[][] b = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = Math.sin((i * i - j * j) / n);
            }
        }
        int numberOfPositive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] > 0) numberOfPositive++;
            }
        }
        System.out.println("Final array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        System.out.print("\nnumber of pozitive: " + numberOfPositive);
    }
}
