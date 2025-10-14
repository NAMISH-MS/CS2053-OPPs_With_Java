import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: matrix size
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        // Input: matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sumDiagonal = 0, sumUpper = 0, sumLower = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumDiagonal += mat[i][j];
                } else if (i < j) {
                    sumUpper += mat[i][j];
                } else if (i > j) {
                    sumLower += mat[i][j];
                }
            }
        }

        System.out.println("Sum of diagonal elements: " + sumDiagonal);
        System.out.println("Sum of upper diagonal elements: " + sumUpper);
        System.out.println("Sum of lower diagonal elements: " + sumLower);

        sc.close();
    }
}