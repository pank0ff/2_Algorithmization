public class SixthTask {
    public static void calc(int n) {
        int[][] b = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (j >= i) b[i][j] = 1;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = n / 2; j < n; j++) {
                if (n - j > i) b[i][j] = 1;
            }
        }
        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (n - i - 1 <= j) b[i][j] = 1;
            }
        }
        for (int i = n / 2; i < n; i++) {
            for (int j = n / 2; j < n; j++) {
                if (j <= i) b[i][j] = 1;
            }
        }
        System.out.println("Final array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
