package homeWork;

import java.util.Scanner;

public class HwArray6 {
    public static void main(String[] args) {



        System.out.println("Enter the required size of the array ::");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array one by one ");

        for (int i = 0; i < size; i++){
            System.out.println("Please enter element number: " + (i+1));
            myArray [i] = scanner.nextInt();
        }

        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();

        //Printing out all array's elements using For-each loop
        System.out.print("Source Array: ");
        for(int temp : myArray) {
            System.out.print(temp + " ");
            }



    }

}
