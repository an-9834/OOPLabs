import java.util.Scanner;

public class Ex225 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        double num1 = nums.nextInt();
        double num2 = nums.nextInt();
        nums.close();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println((double)Math.round(num1 * num2 * 1000)/1000);  // Làm tròn đến 3 chữ số sau dấu .
        System.out.println((double)Math.round(num1 / num2 * 1000)/1000);  // Làm tròn đến 3 chữ số sau dấu ,
        System.exit(0);
    }
}