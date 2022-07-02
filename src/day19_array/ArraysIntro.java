package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("--------------------------------------------");

        //             5 is the size of the array ; 5 element we stored in to the Array. 5--> ARRAY LENGTH
        int[] scores = new int[5]; // index : 0 ~ 4

        scores[2] = 78;
        // That means index 2 in the Array will be 78.
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

       // scores[5] = 100; // index number 5 , but we have max index number 4 -->> ArrayIndexOutOfBoundsException
       // scores[-1] = 65; // indexnumber -1, but we have min index number 0 -->> ArrayIndexOutOfBoundsException

        //scores = new int[10];// index: 0 ~ 9  it is different object we will get 10 zeros.

        //scores = new int[50]; // index: 0 ~ 49

        System.out.println( Arrays.toString(scores) );

        System.out.println(scores[2]); // 78

        System.out.println("-----------------------------------------");

        for (int i = 0; i < scores.length  ; i++) { // i : index numbers of scores array
            System.out.println( scores[i]  );
        }

        System.out.println("-----------------------------------------");

        System.out.println(scores[scores.length -1 ]); // last index number : 95





    }

}
