import java.util.Arrays;

public class SixteenthTask {
    public static void calc(int n) {
        int[][] b = new int[n][n];
        if (n % 2 == 0) {
            b = magicSquareOfEvenOddOrder(n);
        } else {
            b = magicSquareOfOddOrder(n);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }

    private static int[][] magicSquareOfOddOrder(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], 0);
        }
        int count = 1, y = 0, x = matrix.length / 2;
        while (true) {
            matrix[y][x] = count;

            count++;
            if (((y == 0) && (x >= n - 1)) && (matrix[n - 1][0] != 0)) {
                y++;
            } else {
                y--;
                if (y < 0) {
                    y = n - 1;
                }
                x++;
                if (x == n) {
                    x = 0;
                }
                if (matrix[y][x] != 0) {
                    y += 2;
                    x--;
                }
            }

            if (count == n * n + 1) break;
        }
        return matrix;
    }

    private static int[][] magicSquareOfEvenOddOrder(int n) {
        int half = n / 2;

        int[][] matrix = new int[n][n];
        int[][] tempMatrix;
        tempMatrix = magicSquareOfOddOrder(half);

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }
        for (int i = 0; i < half; i++) {
            for (int j = half; j < n; j++) {
                int x = j - half;
                matrix[i][j] = (tempMatrix[i][x] + 2 * half * half);
            }
        }
        for (int i = half; i < n; i++) {
            for (int j = 0; j < half; j++) {
                int x = i - half;

                matrix[i][j] = (tempMatrix[x][j] + 3 * half * half);
            }
        }
        for (int i = half; i < n; i++) {
            for (int j = half; j < n; j++) {
                int x = i - half, y = j - half;
                matrix[i][j] = (tempMatrix[x][y] + half * half);
            }
        }
        int move = 0;
        for (int i = 6; i < n; i++) {
            if ((i % 4 != 0) && (i % 2 == 0)) move++;
        }
        for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {
            for (int i = 0; i < tempMatrix.length; i++) {

                int key = matrix[i][j];
                matrix[i][j] = matrix[half + i][j];
                matrix[half + i][j] = key;
            }
        }
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                int key = matrix[0][0];
                matrix[0][0] = matrix[half][0];
                matrix[half][0] = key;
            }
            if (j == 1) {
                int key = matrix[half - 1][0];
                matrix[half - 1][0] = matrix[n - 1][0];
                matrix[n - 1][0] = key;
            }
        }
        for (int j = half + 1; j < n - 1; j++) {
            for (int i = 1; i < half - 1; i++) {
                int key = matrix[i][1];
                matrix[i][1] = matrix[half + i][1];
                matrix[half + i][1] = key;
            }
        }
        return matrix;
    }
}
