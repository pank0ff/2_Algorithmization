public class TwelfthTask {
    public static void bubbleSortAscending(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortDescending(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void calc(int nRows, int nColumns, double[][] b) {
        for (double[] a : b) bubbleSortAscending(a);
        System.out.print("ascending: ");
        for (int i = 0; i < nRows; i++) {
            System.out.println("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        for (double[] a : b) bubbleSortDescending(a);
        System.out.print("\ndescending: ");
        for (int i = 0; i < nRows; i++) {
            System.out.println("\n");
            for (int j = 0; j < nColumns; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
