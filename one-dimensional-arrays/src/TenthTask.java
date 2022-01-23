public class TenthTask {
    public static void calc(int n, int[] b) {
        System.out.println("original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        if (n % 2 == 0) {
            for (int i = 1; i < n / 2; i++) {
                b[i] = b[i * 2];
            }
            for (int i = n / 2; i < n; i++) {
                b[i] = 0;
            }
        } else {
            for (int i = 1; i < (n + 1) / 2; i++) {
                b[i] = b[i * 2];
            }
            for (int i = (n + 1) / 2; i < n; i++) {
                b[i] = 0;
            }
        }
        System.out.println("\nfinal array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
