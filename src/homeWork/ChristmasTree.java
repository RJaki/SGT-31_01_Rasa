package homeWork;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("basics.Input tree size");
        int size = scanner.nextInt();
        //Each level
        for (int i = 0; i < size; i++){
            //Spaces
            for (int j = 0; j <size -1 - i; j++){
                System.out.print(" ");
            }
            //Stars (we can use the same variable because it is different loop
            for (int j = 0; j <(2 * i + 1); j++){
                System.out.print("*");
            }
            //Move to next line
            System.out.println();
        }
        //Base level
        for (int i = 0; i < size - 1; i++){
            System.out.print(" ");
        }
        System.out.println("#");












    }
}
