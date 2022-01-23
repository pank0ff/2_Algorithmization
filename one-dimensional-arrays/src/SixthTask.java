public class SixthTask {
    public static void calc(int n, double[] b) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int sumOfDividers = 0;
            for (int y = 1; y <= i + 1; y++) {
                if ((i + 1) % y == 0) sumOfDividers++;
            }
            if (sumOfDividers == 2) sum += b[i];
        }
        System.out.println("sum: " + sum);
    }
}
