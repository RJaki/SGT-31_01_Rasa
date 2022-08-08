import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a+bcd"); //pattern to follow
        Matcher matcher = pattern.matcher("raabcd"); //to check if all string follows pattern

        System.out.println(matcher.matches()); //gives true or false output
        System.out.println(matcher.find()); //2nd way, it checks if some part of the string follows the pattern


        //Any lowercase letter or any number from 5-9,{3} 3 in curly brackets determine that only 3 letters/numbers acceptable
        System.out.println(Pattern.matches("[a-z5-9]{3}", "568"));

        //Example of acceptable plate number HP-5742
        //            PO-6235
        //            JR-234
        //            FR-23
        //            KC-2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's plate number");
        String plateNumber =scanner.nextLine().trim();

        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{1,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);
        boolean correctPlate = matcher1.matches();

        if (correctPlate){
            System.out.println("Your inputted plate number is correct");
        }else{
            System.out.println("Your inputted plate number is not correct");
        }






    }
}
