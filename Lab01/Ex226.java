import java.util.Scanner;

public class Ex226 {
    static void FirstDegreeEqn(){
        Scanner coefficient= new Scanner(System.in);
        double a = coefficient.nextDouble();
        double b = coefficient.nextDouble();

        if(a != 0){
            System.out.printf("x= %.2f", -b/a);
        }
        else {
            if(b==0){
                System.out.println("Infinite solutions");
            }
            else{
                System.out.println("No solution");
            }
        }
        coefficient.close();
    }

    static void LinearSystem(){
        Scanner coefficient= new Scanner(System.in);
        double a11 = coefficient.nextDouble();
        double a12 = coefficient.nextDouble();
        double b1 = coefficient.nextDouble();
        double a21 = coefficient.nextDouble();
        double a22 = coefficient.nextDouble();
        double b2 = coefficient.nextDouble();

        double D = a11*a22- a12*a21;
        double D1 = b1*a22 - a12*b2;
        double D2 = a11*b2- a21*b1;
        
        if(D!=0){
            System.out.printf("x1= %.2f", D1 / D);
            System.out.printf(" x2= %.2f", D2 / D);
        }
        else {
            if(D1 != 0 && D2 != 0){
                System.out.println("No solution");
            }
            else{
                System.out.println("Infinite solutions");
            }
        }
        coefficient.close();
    }

    static void SecondDegreeEqn(){
        Scanner coefficient= new Scanner(System.in);
        double a = coefficient.nextDouble();
        double b = coefficient.nextDouble();
        double c = coefficient.nextDouble();
        
        double delta = b*b - 4*a*c;
        if(a != 0){
            if(delta > 0){
                System.out.printf("x1= %.2f x2=%.2f", (-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a));
            }
            else {
                if(delta == 0){
                    System.out.printf("x= %.2f", -b/(2*a));
                }
                else{
                    System.out.println("No solution");
                }
            }
        }
        else{
            if(b != 0){
                System.out.printf("x= %.2f", -c/b);
            }
            else {
                if(c == 0){
                    System.out.println("Infinite solutions");
                }
                else{
                    System.out.println("No solution");
                }
            }
        }
        coefficient.close();
    }

    public static void main(String[] args){
        System.out.println("Choose option: \n1. FirstDegreeEqn \n2. Linear system \n3. SecondDegreeEqn");
        Scanner option = new Scanner(System.in);
        int opt = option.nextInt();
        System.out.println(opt);
        if (opt==1){
            System.out.println("Enter values a= b=");
            FirstDegreeEqn();
        }
        else if(opt==2){
            System.out.println("Enter values a11= a12= b1= \na21= a22= b2=");
            LinearSystem();
        }
        else{
            System.out.println("Enter values a= b= c=");
            SecondDegreeEqn();
        }
        option.close();
    } 
}