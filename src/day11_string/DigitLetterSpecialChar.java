package day11_string;


import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {


        // Ascii table :  Digit : 48 -57
        // - Letter Upper case : 65 - 90
        // - Letter Lower case :
        // - Special Characters :

        //System.out.println("".charAt(0)); // error : StringIndexOutOfBoundsException: String index out of range: 0

        String str = new Scanner(System.in).nextLine(); // for one times

       //  System.out.println(str.length()); // 0

        if (str.length() >= 1 ){ // if the string has at least one character

            char f = str.charAt(0); // the first character of string

            if (f >= '0' && f <= '9' ){   // or f >= 48 && f <= 57
                System.out.println("first character is digit");
            }else if (f >= 'A' && f <= 'Z'){
                System.out.println("first character is uppercase letter");
            }else if ( f >= 'a' && f <= 'z'){
                System.out.println("first character is lowercase letter");
            }else{
                System.out.println("first character is special character");
            }

        }else{
            System.out.println("String is empty");
        }







    }


}
/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"
 */