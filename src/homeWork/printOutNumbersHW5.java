package homeWork;

import java.util.Scanner;

public class printOutNumbersHW5 {
    public static void main(String[] args) {
        //best option to do task

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");

        int input = scanner.nextInt();

        if (input >= 0){
            for (int i = input; i >= 0; i--){
                System.out.print(i + " ");
            }
        }else{
            for (int i = input; i<=0; input++){
                System.out.println(i + " ");
            }
        }
    }
}
