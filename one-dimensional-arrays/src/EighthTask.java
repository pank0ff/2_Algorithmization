public class EighthTask {
    public static void calc(int n, int[] b) {
        int minNumber = b[0];
        int numberOfMin = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] < minNumber) minNumber = b[i];
        }
        for (int i = 0; i < n; i++) {
            if (b[i] == minNumber) numberOfMin++;
        }
        int[] a = new int[n - numberOfMin];
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] != minNumber) {
                a[y] = b[i];
                y++;
            }

        }
        System.out.println("original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nfinal array:");
        if (n == numberOfMin) System.out.println("empty");
        else for (int i = 0; i < n - numberOfMin; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
