package homeWork;

import java.util.Scanner;

public class Palindrome9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");
        // MA DAM
        String y = "";

        for (int i = name.length()-1; i >= 0; i--){
            y = y + name.charAt(i);
            //System.out.println(y);
        }
        if (name.equals(y)) {
            System.out.printf("%s is a palindrome", name);
        }else{
            System.out.printf("%s is not a palindrome", name);
        }



        System.out.println();











    }

}
