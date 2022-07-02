package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        // one dimensional array contains elements
        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {1000,2000};

        System.out.println("-------------------------");

        int[][] arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100}   }; // index : 0 ~  2
        //                        one dimensional array
        //index :             0             1                2

        System.out.println(arr2D.length); //  one dimensional array

        System.out.println(Arrays.toString(arr2D[1])); // [40, 50, 60, 70, 80]

        System.out.println(Arrays.toString(arr2D[2])); // [90, 100]      ------>>> this print system for one dimensional arrays

        System.out.println(Arrays.toString(arr2D[0])); // [10, 20, 30]


        System.out.println(  arr2D[2][0]  ); // 90 for element

        System.out.println(  arr2D[1][2]  ); // 60  -->> this print system for element



    }

}