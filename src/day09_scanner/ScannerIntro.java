package day09_scanner;

import java.util.Scanner;

// import java.util.*; ------>  with doing that ; all of class in Jva will be executed

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // for reading user inputs


        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte(); // -128 ~ 127

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        long num4 = input.nextLong();

        input.close(); // scanner is closed, can not read user inputs again

        /*

        System.out.println("Enter your fifth number:");

        int num5 = input.nextInt();

        Scanner is closed at line 30, once it´s closed can not  read inputs
         */
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
        System.out.println("Third number is: " + num3);
        System.out.println("Fourth number is: " + num4);
      //   System.out.println("Fifth number is: " + num5);


      //  input.close(); // scanner is closed, can not read user inputs again




    }

}
