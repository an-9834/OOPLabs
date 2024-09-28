import java.util.Scanner;
public class TriangleOfStars {
    public static void main(String[] args) {
        Scanner stars = new Scanner(System.in);
		int n = stars.nextInt();
        stars.close();
        for (int i = 1; i <= n; i++) {
            //Print space in rows
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            //Print stars in rows
            for (int k = 1; k <= (2*i-1); k ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.exit(0);

    }
}
