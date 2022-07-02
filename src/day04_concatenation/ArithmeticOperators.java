package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200); // 300

        System.out.println(40 - 10); // 30

        System.out.println(50 / 6); // int result : 8

        System.out.println(50 / 6.0); // double result : 8.3333333.....
        System.out.println(50.0 / 6); // double result : 8.3333333.....

        System.out.println(50d / 6); //  double-decimal result : 8.3333333.....


        System.out.println(2.5 / 0.5 ); // double - decimal result : 5.0

        System.out.println(   (int)(2.5 / 0.5)); // int casting result int : 5

        //  System.out.println(9 / 0);

        System.out.println(20 * 12 ); // 240

        // Remainder : numerator - (denomitor * integer result)

        // 20 / 6 : ? ==>>>> Reminder : 20 - ( 6 * 3 ) = 2;  === ( 20 % 6)
        // 15 / 4 ==>>>>     remainder :15 - ( 4 * 3 ) = 3;  === (15 % 4)

        System.out.println(100 % 13 ); // 9 : Remainder

        System.out.println(45 % 8); // 5 : Remainder


    }


}
