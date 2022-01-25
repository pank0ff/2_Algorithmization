public class EleventhTask {
    public static void calc() {
        int[][] b = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                b[i][j] = (int) (Math.random() * 15);
            }
        }
        System.out.print("original array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            for (int j = 0; j < 20; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (b[i][j] == 5) {
                    a[i]++;
                }
            }
        }
        System.out.println("\n\na line that contains 5 at least 3 times: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] >= 3) System.out.print((i + 1) + " ");
        }

    }
}
