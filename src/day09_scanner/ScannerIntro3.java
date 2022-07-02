package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0); // first character

        // System.out.println("Your have entere: " + ch);



        System.out.println("Would you like to continue?");
        // String answer = input.next(); // yes i want to continiue ===> yes
        String answer = input.nextLine(); // yes i want to continiue ===> yes i want to continiue

        System.out.println("You are entered: " + answer);

        input.close();



    }

}
