import java.util.Scanner;

public class midElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: matrix size
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input: matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (n % 2 == 1) {
            // Odd size: single middle element
            int mid = n / 2;
            System.out.println("Middle element: " + matrix[mid][mid]);
        } else {
            // Even size: 4 central elements
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            System.out.println("Middle elements: ");
            System.out.println(matrix[mid1][mid1] + " " + matrix[mid1][mid2]);
            System.out.println(matrix[mid2][mid1] + " " + matrix[mid2][mid2]);
        }

        sc.close();
    }
}