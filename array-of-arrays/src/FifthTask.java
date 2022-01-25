public class FifthTask {
    public static void calc(int n) {
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                b[i][j] = i + 1;
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
