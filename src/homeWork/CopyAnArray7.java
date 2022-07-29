package homeWork;

import java.util.Arrays;

public class CopyAnArray7 {
    public static void main(String[] args) {

        int [] sourceArray = {25,14,56,36,56,77,18,29,49};

        System.out.print("Source Array :" + Arrays.toString(sourceArray));

        int [] newArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++){
            newArray [i] =  sourceArray[i];
        }

        System.out.print('\n' + "New Array : " + Arrays.toString(newArray));

    }

}
