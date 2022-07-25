public class ArrayExamples {
    public static void main(String[] args) {

        //Declare array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Rasa";
        names[1] = "Ieva";
        names[2] = "Mantas";

        //How to get array's elements value
        System.out.println(names[1]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 5;
        grades[2] = 3;
        grades[3] = 9;
        grades[4] = 7;
        grades[5] = 2;
        grades[6] = 9;
        grades[7] = 10;
        grades[8] = 5;
        grades[9] = 1;

        //How to get Array's size
        System.out.println("Array's size " + grades.length);

        //Print out all elements
        for (int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");

        }

    }
}
