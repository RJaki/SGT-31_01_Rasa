package homeWork;

import java.util.Scanner;

public class HW5Printoutnumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.print(number + " ");
            number--;
        }
        while (number <0) {
            System.out.print(number + " ");
            number++;
        }
        if (number == 0) {
            System.out.print(number);
        }




    }

}
