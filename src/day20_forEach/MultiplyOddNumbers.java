package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0){
                continue;
            }

           numbers[i]  = numbers[i] * 2;
           //assign it back

        }

        System.out.println(Arrays.toString(numbers));//[2, 2, 6, 4, 10, 6, 14, 8, 18, 10]



    }

}
/*
Warmup-tasks
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];
	                output:
	                	array =[2,2,6,4,10]
 */