package homeWork;

import java.util.Scanner;

public class HW3LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter year (positive number)");
        int year = scanner.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap year");
        } else if(year % 4 == 0 && year % 100 !=0){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
            }

        /*more efficient
        if((year % 4 == 0 && year 100 !=0) || year % 400 ==0) {
        System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
            }
         */




    }
}
