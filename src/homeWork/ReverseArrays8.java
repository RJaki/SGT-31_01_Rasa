package homeWork;

import java.util.Arrays;

public class ReverseArrays8 {
    public static void main(String[] args) {

        int [] myArray = {1789,2035,1899, 1456, 2013, 4458,2458,1254,1456};
        System.out.print("Original Array : " + Arrays.toString(myArray));



        for (int i = 0; i < myArray.length/2; i++){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 -i] = temp;
        }
        System.out.print('\n' + "Reverse Array : " + Arrays.toString(myArray));








    }
}
