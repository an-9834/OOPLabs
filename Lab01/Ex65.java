import java.util.Scanner;
import java.util.Arrays;

public class Ex65 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
        }

        double sum = Arrays.stream(arr).sum();


        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.printf("Sum= %.2f",sum);
        System.out.println();
        System.out.printf(" Average= %.2f", sum/n);
        
        input.close();   
    } 
}