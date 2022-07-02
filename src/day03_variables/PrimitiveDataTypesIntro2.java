package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType variableName = Data

        // 128 Characters in Java

        char a = '@';
        char b = '!';
        //  char ab = 'ab';
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------");

        char ch1 = 'A';
        char ch2 = 65;  // 65  means  "A" according to Ascii-Table code

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-------------------------");

        char ch3 = 45000;  // '꿈'

        System.out.println(ch3);

        System.out.println("-------------------------");

        int sum = 'A' + 'B';
        //         65 + 66

        System.out.println(sum);

        System.out.println("-------------------------");

        // char ch4 = -100; // error ; from 0 to 65,535

        System.out.println("-------------------------");

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);



    }


}