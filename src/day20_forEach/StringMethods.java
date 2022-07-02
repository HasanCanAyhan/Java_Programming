package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // toCharArray() : returns char array
        // split(CharSequence) :   returns String array

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));
        //[C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("-------------------------------------------------------------");

        String str2 = "Today is a great day to learn java";

        // split means in German"teilt".

        String[] words = str2.split(" "); // 7 space - 8 wordss(word by word)

        String[] words1 = str2.split("great"); // 1 "great "- 2 elements

        String[] words2 = str2.split("Python"); // there is no "Python", then 1 element

        System.out.println(Arrays.toString(words));
        // [Today, is, a, great, day, to, learn, java] -->> we have 8 elements

        System.out.println(Arrays.toString(words1));
        // [Today is a ,  day to learn java]

        System.out.println(Arrays.toString(words2));
        // [Today is a great day to learn java]

        System.out.println("-------------------------------------------------------------");

        // Split method returns String Array from the given String.

        String sentence = "I love Java";

        // "Java love I"

        String[] arr = ArraysUtility.reverse(sentence.split(" ") ); // String array contains each words of the given string [I , love, Java]


        System.out.println(Arrays.toString(arr));  //  [Java, love, I]

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i]+ " ";
        }

        System.out.println("reversedSentence = " + reversedSentence);
        // reversedSentence = Java love I

    }

}
