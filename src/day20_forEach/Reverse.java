package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length]; // {5,4,3,2,1};

        /*
        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
               reverse[j] = array[i];
        }


         */

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];

        }

        System.out.println("reverse = " + Arrays.toString(reverse));
        // reverse = [5, 4, 3, 2, 1]

        System.out.println("---------------------------------------------------------");

        int[] nums = {100, 200, 300, 400, 500};

        nums = ArraysUtility.reverse(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        // nums = [500, 400, 300, 200, 100]

        System.out.println("------------------------------------------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};

        a1 = ArraysUtility.reverse(a1);
        System.out.println("a1 = " + Arrays.toString(a1));
        //a1 = [4.5, 3.5, 2.5, 1.5]




    }

}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};
	        output:
	            reversedArray = {5,4,3,2,1};
 */