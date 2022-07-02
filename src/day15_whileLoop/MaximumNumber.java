package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        Scanner input =  new Scanner(System.in);

        int max = -2147483648; // 10 ----> 20  // Any integer number that user enter will ALWAYS be greater than -2147483648

        for (int i = 0; i < 5 ; i++) { // 0 ,1, 2, 3, 4

            System.out.println("enter a number : ");
            int num = input.nextInt(); // 10 , 5 , 3 , 20 , 15 ------    -20,35,15,40,0

            if(num > max){ // if the user entered entry is greater then the current max number that we have
                max = num;// then user entered number should be the maximum number
            }


        }

        System.out.println("maximum number is: " + max);

        input.close();


    }

}
/*

Warmup tasks:
	1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

 */