public class SecondTask {
    public static void calc(int n, double[] b, double z) {
        int numberOfChanges = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] > z) {
                b[i] = z;
                numberOfChanges++;
            }
        }
        System.out.println("new array:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nnumber of replacements: " + numberOfChanges);
    }
}
