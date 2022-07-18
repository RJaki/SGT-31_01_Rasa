public class MathClass {
    public static void main(String[] args) {

        float num = 5.999999999999f;
        System.out.println(num);

        //Rounding down
        System.out.println(Math.floor(num));

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles
        System.out.println(Math.round(num));

        //Absolute value
        System.out.println(Math.abs(-2));

        //Power
        System.out.println(Math.pow(2,2));

       //Square root
        System.out.println(Math.sqrt(64));

        //Finding max value between two values
        System.out.println(Math.max(100.5,6));

        //Finding min value between two values
        System.out.println(Math.min(55,43));

        //Randon value (1 to 20 in this case)
        System.out.println((int) (Math.random() * 20) +1); //usually 0-1, bet kadangi *20, tai max 20 ir +1, rodo, kad bus min 1.

        //Casting
        System.out.println((int) 99.989);
        System.out.println((10 + 5) * 2);


    }
}
