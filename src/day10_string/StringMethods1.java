package day10_string;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        // ------------- charAt()----------------------

        String str = "Cydeo";
        //   index :  01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

     //  char nChar = str.charAt(25); // error :  String index out of range: 25


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

       // System.out.println(nChar);


        System.out.println("----------------------------------");

        // ---------------------- length()---------------------------------------

        String sentence = "Java Programming Language";

        int length = sentence.length();

        System.out.println(length); // 25

        int lastIndex = length - 1; // 24 - last index number

        System.out.println(lastIndex);



        System.out.println("----------------------------------");



        String s1 = "Wooden Spoon";

        char f = s1.charAt(0); // first character

        int lastIndexNum = s1.length()-1; // last index number

        char l = s1.charAt(lastIndexNum); // last character

        System.out.println(f + " : " + l );

        System.out.println("----------------------------------");

        // equals()

        String name1 = "Umran";
        String name2 = new String("Umran");


        System.out.println(name1 == name2); // false

        System.out.println(name1.equals(name2)); // true

        System.out.println("----------------------------------");


        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println(r1 == r2); // true object comparing
        System.out.println(r1 == r3); // false  object comparing

        System.out.println(r2 == r3); // false object comparing

        System.out.println(r1.equals(r3)); // true  text comparing
        System.out.println(r2.equals(r3)); // true  text comparing

        System.out.println("----------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen ? yes/no");
        String answer = input.next();

        if( age >= 21 && answer.equals("yes")  ){     // ---->>> equals method must be used and Upper and Lover Case sensitive
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }


        input.close();




    }

}
