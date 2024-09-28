import java.util.Arrays;
import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int n = nums.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = nums.nextInt();
        }
        nums.close();
        
        double tong = Arrays.stream(a).sum();
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        System.out.println((int)tong);
        System.out.println((double)Math.round(tong / n * 1000) / 1000); //Làm tròn giá trị trung bình đến 3 chữ số sau dấu ,

    }
}
