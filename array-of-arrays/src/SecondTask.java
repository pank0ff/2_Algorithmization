public class SecondTask {
    public static void calc(int n, double[][] b) {
        System.out.println("main diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i][i]);
        }
        System.out.println("secondary diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i][n - 1 - i]);
        }
    }
}
