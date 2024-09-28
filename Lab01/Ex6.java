import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int size = scanner.nextInt();
        int row = size;
        int column = size;

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] sumMatrix = new int[row][column];

        // Input for first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Adding the matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
