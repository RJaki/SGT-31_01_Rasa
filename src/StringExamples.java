import java.sql.SQLOutput;
import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        String text1 = "This is text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //CONCATENATION OF STRINGS

        String input1 = "This is ";
        String input2 = "input text.";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //Comparing Strings
        String val1 = "Test ";
        String val2 = "Test";
        System.out.println(val1.equals(val2));
        System.out.println(val2.equals(val1));

        //String class methods

        String inputText = "This is my text";

        //Length (shows how many char there are incl. spaces)
        System.out.println(inputText.length());

        //To uppercase
        System.out.println(inputText.toUpperCase());
        System.out.println(inputText);

        //To lowercase
        System.out.println(inputText.toLowerCase());

        //String class methods - INDEXOF()
        String speakingText = "This is test";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf(" is "));

        //REPLACEALL()
        //Šūdas

        String textForTV = "This phone is complete šūdas. And this case is also šūdas.";
        System.out.println(textForTV.replaceAll("šūdas", "š****"));

        //Character index
        System.out.println(textForTV.charAt(textForTV.length()-1));
        System.out.println(textForTV.charAt(5));
        System.out.println(textForTV.charAt(4));
        System.out.println(textForTV.charAt(3));
        System.out.println(textForTV.charAt(2));
        System.out.println(textForTV.charAt(1));
        System.out.println(textForTV.charAt(0));

        //Substring
        System.out.println(textForTV.substring(5)); //starts from written index
        System.out.println(textForTV.substring(5,10)); //write 1st and last needed character from text

        //Parsing
        //Converting String to primitive data types

        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.4567899765567";
        String boolValue = "true";
        String longValue = "1000000000000000000";

        System.out.println(Integer.parseInt(intValue)+4);
        System.out.println(Float.parseFloat(floatValue));
        System.out.println(Double.parseDouble(doubleValue));
        System.out.println(Boolean.parseBoolean(boolValue));
        System.out.println(Long.parseLong(longValue));

        //Test comment

        //Trim method (delete spaces before and at the end
        System.out.println("   This is test   ".trim());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password (qwert*)");
        String pswd = scanner.nextLine().trim().toLowerCase();
        //Checks if pswd is correct
        if (pswd.equals("qwerty")){
            System.out.println("Password correct");
        }else{
            System.out.println("Incorrect password");
        }





    }
}
