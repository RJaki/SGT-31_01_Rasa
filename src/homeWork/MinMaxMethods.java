package homeWork;

import java.util.Arrays;

public class MinMaxMethods {
    public static void main(String[] args) {

        int [] my_array = {10,243,964,23,62,1534,234,54,4,46,600};
        System.out.println("Original array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array: " + max(my_array));
        System.out.println("Minimum value for the above array: " + min(my_array));

    }

    public static int max (int [] my_array){
        int max = 0;
        for (int i = 0; i< my_array.length; i++){
            if (my_array[i]> max){
                max = my_array[i];
                i++;
            }

        }
        return max;
    }


    public static int min (int [] my_array){
        int min = my_array[0];
        for (int i = 0; i< my_array.length; i++){
            //min = Math.min(min, my_array [i]);
            if (my_array[i]< min){
                min = my_array[i];
                i++;
            }

        }
        return min;
    }


}
