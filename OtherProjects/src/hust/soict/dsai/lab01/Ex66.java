package hust.soict.dsai.lab01;

import java.util.Scanner;

public class Ex66 {

    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int row = nums.nextInt();
        int column = nums.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] sum_Matrix = new int[row][column];

        System.out.println("Input the Matrix1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = nums.nextInt();
            }
        }

        System.out.println("Input the Matrix2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = nums.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum_Matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum_Matrix[i][j] + "\t");
            }
            System.out.println();
        }
        nums.close();
    }
}
