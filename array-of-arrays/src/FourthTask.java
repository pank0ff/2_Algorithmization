public class FourthTask {
    public static void calc(int n) {
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    b[i][j] = n - j;
                }
            }
        }
        System.out.print("final array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
