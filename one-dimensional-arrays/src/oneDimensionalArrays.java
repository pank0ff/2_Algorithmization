import java.util.Scanner;

public class oneDimensionalArrays {
    public static void main(String[] args) {
        System.out.println("write your choice (1 - 10)\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("enter the number of elements \n");
                int n = input.nextInt();
                int[] b = new int[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextInt();
                }
                System.out.println("enter the number K\n");
                int k = input.nextInt();
                FirstTask.calc(n, b, k);
            }
            case 2 -> {
                System.out.println("enter the number of elements \n");
                int n = input.nextInt();
                double[] b = new double[n];
                System.out.println("enter the elements of the array\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextDouble();
                }
                System.out.println("enter the number Z\n");
                double z = input.nextDouble();
                SecondTask.calc(n, b, z);
            }
            case 3 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                double[] b = new double[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextDouble();
                }
                ThirdTask.calc(n, b);
            }
            case 4 -> {
                System.out.println("enter the number of elements \n");
                int n = input.nextInt();
                double[] b = new double[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextDouble();
                }
                FourthTask.calc(n, b);
            }
            case 5 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                int[] b = new int[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextInt();
                }
                FifthTask.calc(n, b);
            }
            case 6 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                double[] b = new double[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextDouble();
                }
                SixthTask.calc(n, b);
            }
            case 7 -> {
                System.out.println("enter the even number of elements\n");
                int n = input.nextInt();
                while (n % 2 != 0) {
                    System.out.println("enter the EVEN number of elements\n");
                    n = input.nextInt();
                }
                double[] b = new double[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextDouble();
                }
                SeventhTask.calc(n, b);
            }
            case 8 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                int[] b = new int[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextInt();
                }
                EighthTask.calc(n, b);
            }
            case 9 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                int[] b = new int[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextInt();
                }
                NinthTask.calc(n, b);
            }
            case 10 -> {
                System.out.println("enter the number of elements\n");
                int n = input.nextInt();
                int[] b = new int[n];
                System.out.println("enter the elements of the array. Number of elements: " + n + "\n");
                for (int i = 0; i < n; i++) {
                    b[i] = input.nextInt();
                }
                TenthTask.calc(n, b);
            }

            default -> System.out.println("You entered a number that is not in the range from 1 to 6\n");
        }
    }
}