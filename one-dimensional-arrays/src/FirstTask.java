public class FirstTask {
    public static void calc(int n, int[] b, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] % k == 0) sum += b[i];
        }
        System.out.println("sum: " + sum);
    }
}
