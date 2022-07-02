package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10, 20, 30, 40, 50}; // Array Literal


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers)); // numbers = [0, 0, 0, 0, 0]
        System.out.println("nums = " + Arrays.toString(nums)); // nums = [10, 20, 30, 40, 50] we know elements

        System.out.println("-------------------------------------------------------------------");

        //elements:          1        2          3           4        5         6          7
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index:           0         1        2          3            4        5          6

        int n = 1; // user enters from 1 to 7

        System.out.println( days[n-1] ); // in order to reach the first index number


        System.out.println("-------------------------------------------------------------------");

        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Now","Dec"};

        /*

        month = new String[12];
        month[0] = "Jan";
        .....

         */

        System.out.println("month = " + Arrays.toString(month));


        System.out.println("-------------------------------------------------------------------");

        // int[] numbers2 = new int[100];

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);//reversed month - Dec ~ jan
        }




    }

}
