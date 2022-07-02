package day09_scanner;

import java.util.Scanner;

public class EligibleOrNotEligible {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter his/her age: ");
        int age = input.nextInt();

        String result = "";

        if(age >= 21){
            result = "Eligible";
        }else{
            result = "Not Eligible";
        }

        System.out.println(result);

        input.close();



    }

}
/*
2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol
 */