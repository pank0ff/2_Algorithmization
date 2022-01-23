public class FourthTask {
    public static void calc(int n, double[] b) {
        double maxNumber = b[0];
        double minNumber = b[0];
        System.out.println("original array");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (b[i] > maxNumber) maxNumber = b[i];
            if (b[i] < minNumber) minNumber = b[i];
        }
        for (int i = 0; i < n; i++) {
            if (b[i] == maxNumber) b[i] = minNumber;
            else if (b[i] == minNumber) b[i] = maxNumber;
        }
        System.out.println("\nfinal array");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
