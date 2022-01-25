public class TenthTask {
    public static void calc(int n, double[][] b) {
        System.out.println("positive numbers in the main diagonal:");
        for (int i = 0; i < n; i++) {
            if (b[i][i] > 0) System.out.println(b[i][i] + " ");
        }
    }
}
