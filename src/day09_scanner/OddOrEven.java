package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int num = input.nextInt();
        String result = "";

        if (num %2 == 0){
            result = "Even";
        }

        if (num %2 != 0){
            result = "Odd";
        }

        System.out.println(result);

        input.close();





    }

}
/*

 1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */