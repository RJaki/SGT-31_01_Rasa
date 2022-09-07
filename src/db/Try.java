package db;

public class Try {
    public static void main(String[] args) {

        //try & catch block
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[2]);
            //System.out.println(numbers[3]);
        }catch (Exception e){ //usually we name exception 'e'
            System.out.println(e);
            System.out.println("Something went wrong");

        }

        System.out.println("Hello world");



    }
}
