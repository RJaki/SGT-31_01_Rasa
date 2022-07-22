package homeWork;

import java.util.Scanner;

public class HW5v2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();

        for(int i = number; i > 0; i--){
            System.out.print(number-- + " ");
        }
        for (int i = number; i< 0; i++) {
            System.out.print(number++ + " ");
        }
        if (number == 0){
            System.out.println(number);
        }

    }
}
