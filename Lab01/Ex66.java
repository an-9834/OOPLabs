import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: "); int row = sc.nextInt();
        System.out.print("Number of columns: "); int column = sc.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] sum_matrix = new int[row][column];

        System.out.println("Input the Maxtrix1: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input the Maxtrix2: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum_matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
