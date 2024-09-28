import java.util.Scanner;
<<<<<<< Updated upstream:Lab01/Ex63.jav

=======
>>>>>>> Stashed changes:Lab01/Ex63.java
public class Ex63 {
    public static void main(String[] args) {
        Scanner stars = new Scanner(System.in);
		int n = stars.nextInt();
        stars.close();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("*".repeat(2 * n - 1));
        }
        System.exit(0);
    }
}