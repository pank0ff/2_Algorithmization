public class SeventhTask {
    public static void calc(int n, double[] b) {
        double maxSum = b[0] + b[n - 1];
        for (int i = 0; i < n; i++) {
            if ((b[i] + b[n - i - 1]) > maxSum) maxSum = (b[i] + b[n - i - 1]);
        }
        System.out.println("maximum sum of numbers equidistant from the end: " + maxSum);
    }
}
