package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){
            System.out.println("Hello " + i);

        }

        System.out.println("-----------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println("-----------------------------------------");

        int j = 0;
        while ( j < 5 ){
            System.out.println("Hello " + j);
            j++;
        }

        System.out.println("-----------------------------------------");

        int k = 0;

        do {
            System.out.println("Hello " + k);
            k++;
        }while( k < 5 );

        System.out.println("-----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while(score > 100 || score < 0){ // while the score is invalid
            System.out.println("Invalid score , pls re-enter your score");
            score = input.nextInt();// by writing score we are updating the score by getting the input from user
        }

        if(score >= 60 ){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



    }

}
