package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // shortcut = fori

        int sum = 0;


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt();

        }

        System.out.println("sum = " + sum);


        // write a program that can ask the user to enter a number for five times, print the maximum number


        // write a program that can ask the user to enter a number for five times, print the minimum number



    }
}