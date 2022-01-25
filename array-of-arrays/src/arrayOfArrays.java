import java.util.Scanner;

public class arrayOfArrays {
    public static void main(String[] args) {
        System.out.println("write your choice (1 - 16)\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array. Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                FirstTask.calc(nRows, nColumns, b);
            }
            case 2 -> {
                System.out.println("enter the number of rows and columns \n");
                int n = input.nextInt();
                double[][] b = new double[n][n];
                System.out.println("enter the elements of the array. Number of elements: " + n * n + "\n");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                SecondTask.calc(n, b);
            }
            case 3 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array. Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Enter number of row: ");
                int k = input.nextInt();
                System.out.println("Enter number of column: ");
                int p = input.nextInt();
                ThirdTask.calc(nRows, nColumns, b, k, p);
            }
            case 4 -> {
                System.out.println("enter the number of rows and columns(even): \n");
                int n = input.nextInt();
                FourthTask.calc(n);
            }
            case 5 -> {
                System.out.println("enter the number of rows and columns(even): \n");
                int n = input.nextInt();
                FifthTask.calc(n);
            }
            case 6 -> {
                System.out.println("enter the number of rows and columns(even): \n");
                int n = input.nextInt();
                SixthTask.calc(n);
            }
            case 7 -> {
                System.out.println("enter the number of rows and columns(even): \n");
                int n = input.nextInt();
                SeventhTask.calc(n);
            }
            case 8 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array. Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Enter number of the first column: ");
                int k = input.nextInt();
                System.out.println("Enter number of the second column: ");
                int p = input.nextInt();
                EighthTask.calc(nRows, nColumns, b, k, p);
            }
            case 9 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array(>=0). Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                NinthTask.calc(nRows, nColumns, b);
            }
            case 10 -> {
                System.out.println("enter the number of rows and columns\n");
                int n = input.nextInt();
                double[][] b = new double[n][n];
                System.out.println("enter the elements of the array(>=0). Number of elements: " + n * n + "\n");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                TenthTask.calc(n, b);
            }
            case 11 -> EleventhTask.calc();
            case 12 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array(>=0). Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                TwelfthTask.calc(nRows, nColumns, b);
            }
            case 13 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                double[][] b = new double[nRows][nColumns];
                System.out.println("enter the elements of the array(>=0). Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextDouble();
                    }
                }
                ThirteenthTask.calc(nRows, nColumns, b);
            }
            case 14 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                FourteenthTask.calc(nRows, nColumns);
            }
            case 15 -> {
                System.out.println("enter the number of rows \n");
                int nRows = input.nextInt();
                System.out.println("enter the number of columns \n");
                int nColumns = input.nextInt();
                int[][] b = new int[nRows][nColumns];
                System.out.println("enter the elements of the array(>=0). Number of elements: " + nRows * nColumns + "\n");
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nColumns; j++) {
                        b[i][j] = input.nextInt();
                    }
                }
                FifteenthTask.calc(nRows, nColumns, b);
            }
            case 16 -> {
                System.out.println("enter the number of rows and columns\n");
                int n = input.nextInt();
                SixteenthTask.calc(n);
            }
            default -> System.out.println("You entered a number that is not in the range from 1 to 6\n");
        }
    }
}