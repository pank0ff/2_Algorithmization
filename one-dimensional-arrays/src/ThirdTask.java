public class ThirdTask {
    public static void calc(int n, double[] b) {
        int numberOfZero = 0;
        int numberOfPozitive = 0;
        int numberOfNegative = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] > 0) numberOfPozitive++;
            else if (b[i] < 0) numberOfNegative++;
            else numberOfZero++;
        }
        System.out.println("Number of positive numbers: " + numberOfPozitive);
        System.out.println("Number of negative numbers: " + numberOfNegative);
        System.out.println("Number of zero numbers: " + numberOfZero);
    }
}
