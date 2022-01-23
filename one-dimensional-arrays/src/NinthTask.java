public class NinthTask {
    public static void calc(int n, int[] b) {
        int[] a = new int[n];
        int numberOfMax = 0;
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if (b[i] == b[y]) a[i]++;
            }
        }
        int maxValue = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > maxValue) maxValue = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == maxValue)
                numberOfMax++;
        }
        int[] c = new int[numberOfMax];
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == maxValue) {
                c[y] = b[i];
                y++;
            }
        }
        int minValue = c[0];
        for (int i = 0; i < numberOfMax; i++) {
            if (c[i] < minValue) minValue = c[i];
        }
        System.out.println("minimal value: " + minValue);
    }
}
