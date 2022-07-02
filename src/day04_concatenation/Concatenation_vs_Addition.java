package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {


       /* For Concatenation

         "text" + "text"
         "text" + number/any data
         any data + "text"

         -----------------

         For  Addition
        number + number
         */

        System.out.println("32" + 1);  // 321
        System.out.println("13" + "2"); // 132


        System.out.println("-----------------------");

        System.out.println(12+ 2.5); // 14.5

        System.out.println("-----------------------");

        System.out.println("The value is " + true);

        System.out.println("-----------------------");

        System.out.println("The value is " + 12 +15); // 1215
        System.out.println("The value is " + (12 +15)); // 27


    }

}
