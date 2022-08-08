package Tasks;

import java.util.Scanner;

public class StringInputPractise {
    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you Name and Age (John 30)");

        //Read string from user and get rid of spaces (trim)
        //Get substring of last 2 characters in the string
        //Convert those to integer
        //If age is over 70 then print "Senior" if not then "Adult"

        String input = scanner.nextLine().trim();
        System.out.println("Substring " + input.substring(input.length()-2));
        int age = Integer.parseInt(input.substring(input.length()-2));

        if (age > 70){
            System.out.println("Senior");
        }else{
            System.out.println("Adult");
        }



    }
}
