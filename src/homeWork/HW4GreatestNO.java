package homeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW4GreatestNO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the 1st number");
        int numb1 = scanner.nextInt();
        System.out.println("Inpul the 2nd number");
        int numb2 = scanner.nextInt();
        System.out.println("Input the 3rd number");
        int numb3 = scanner.nextInt();

        if (numb1 > numb2 && numb1 >= numb3){
            System.out.println("The greatest: " + numb1);
        } else if(numb2 > numb1 && numb2 >= numb3){
            System.out.println("The greatest: " + numb2);
        } else {
            System.out.println("The greatest: " + numb3);
        }

        //Most efficient approach
        System.out.println(Math.max(Math.max(numb1, numb2), numb3));



    }
}
