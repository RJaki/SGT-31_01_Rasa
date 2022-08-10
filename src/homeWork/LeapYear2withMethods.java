package homeWork;

import java.util.Scanner;

public class LeapYear2withMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        int year = scanner.nextInt();
        determineLeapYear(year);//calling a method which is created 1st-ly
        determineLeapYear(1992);
        determineLeapYear(2004);

        //Homework additional task
        System.out.println(determineLeapYear1(year));

    }
    public static void determineLeapYear (int year){

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

            }


            //Homework additional task
    public static String determineLeapYear1 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return year + " is leap year";
        } else {
            return year + " is not a leap year";
        }

    }

}
