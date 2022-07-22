public class CharExample {
    public static void main(String[] args) {

        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Cast from int to char
        System.out.println((char) 122);

        //Print out all lower case alphabet letter
        /*
        char alphabet;
        for (alphabet = 'a'; alphabet <= 'z'; alphabet++){
            System.out.print(alphabet + " ");
        }

         */
        //Print out all lower case alphabet letter a, b, c...z
        //best scenario
        for (int i = 97; i <=122; i++){
            System.out.print((char)i + " ");
        }




    }
}
