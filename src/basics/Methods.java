package basics;

public class Methods {
    public static void main(String[] args) {
        /*1sly created separate public static method printName
        and then in main method entered printName and run code   */
        printName("Rasa"); //if we write more printName("n+x") it will print them all

        String introText = returnName("Bob"); //from public static String returnName method
        System.out.println(introText);

        System.out.println(returnName("John")); //from public static String returnName method

        personInfo("Usman", 35);//by using public static void personInfo
        personInfo("Israel", 33);

        //int calculation = sum(45, 6, 12);
        //System.out.println(calculation);

        int calculation = sum(45,6,12);
        if (calculation >= 100){
            System.out.println("over 100");
        }else{
            System.out.println("under 100");
        }

    }
    //Creating our own classes (after that main method must be called)
    //Static means not requiring to created object to call needed method

    public static void printName (String name){ //due to void no return
        System.out.println("Hello your name is " + name);
    }


    public static String returnName (String name){
        System.out.println("---- Inside returnName method");
        return "Hello your name is " + name;
    }

    public static void personInfo (String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n", name, age);
    }

    public static int sum (int num1, int num2, int num3){ //summing method and then call main method

        return num1 + num2 + num3;
    }







}
