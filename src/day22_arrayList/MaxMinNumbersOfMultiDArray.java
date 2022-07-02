package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

        //index of elemts:  0    1   2      0   1    2       0    1   2
        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} }; // indexes of array : 0~2
        //index of 1 D array:   0                1                2

        int max = array[0][0];
        int min = array[0][0];

        // for 2 dimensional array it must be 2 for-loop
        // for 10  dimensional array it must be 10 for-loop

        for ( int[] each1D  : array ){

            for (int eachElement : each1D) {

                if (eachElement > max){
                    max = eachElement;
                }

                if (eachElement < min){
                    min = eachElement;
                }

            }

        }

        System.out.println("max = " + max); // max = 1000
        System.out.println("min = " + min); // min = -200

    }

}
/*

2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000
 */
