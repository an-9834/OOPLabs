package hust.soict.dsai.lab01;

import java.util.Scanner;
public class Ex64 {
    private static boolean Leap(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) return (year % 400 == 0);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int year, month;

        System.out.print("Enter the year: ");
        while(true) {
            if(nums.hasNextInt()) {
                year = nums.nextInt();
                if(year >= 0) break;
                System.out.print("Invalid year\nPlease enter again: ");
                continue;
            }
            System.out.print("Invalid year\nPlease enter again: ");
            nums.next();
        }

        String[] ValidMonth = {
                "January", "Jan.", "Jan",
                "February", "Feb.", "Feb",
                "March", "Mar.", "Mar",
                "April", "Apr.", "Apr",
                "May", "May", "May",
                "June", "June", "Jun",
                "July", "July", "Jul",
                "August", "Aug.", "Aug",
                "September", "Sep.", "Sep",
                "October", "Oct.", "Oct",
                "November", "Nov.", "Nov",
                "December", "Dec.", "Dec"
        };
        System.out.print("Enter the month: ");
        while(true) {
            if(nums.hasNextInt()) month = nums.nextInt();
            else {
                String strMonth = nums.next();
                month = 0;
                for (int i = 0; i < 36; i++) {
                    if (strMonth.equals(ValidMonth[i])) {
                        month = i/3 + 1;
                        break;
                    }
                }
            }
            if(month >= 1 && month <= 12) break;
            System.out.print("Invalid month\nPlease enter again: ");
        }

        if(month == 2) {
            System.out.print((Leap(year) == true ? "29" : "28"));
        } else if((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
            System.out.print("31");
        } else {
            System.out.print("30");
        }
        nums.close();
    }
}
