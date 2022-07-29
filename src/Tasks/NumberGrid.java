package Tasks;

public class NumberGrid {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};

        //i - rows
        //j - columns
        for (int i = 0; i < array.length; i++) { //shows how many rows in Array
            for (int j = 0; j < array[i].length; j++) { //shows how many columns we have
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int [] tempArray : array) {
            for (int arrayNum : tempArray) {
                System.out.print(arrayNum + " ");
            }
            System.out.println();
        }


    }

}
