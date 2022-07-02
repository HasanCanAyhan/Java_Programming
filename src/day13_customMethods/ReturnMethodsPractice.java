package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {



        System.out.println(isOdd(5));

        System.out.println("----------------------------------");

        System.out.println(isEven(10));

        System.out.println("----------------------------------");

        System.out.println(maxNumber(11,14));

        System.out.println("----------------------------------");

        System.out.println(minNumber(12, 15));

    }


    public static boolean isOdd(int num){

        boolean isOdd = (num % 2 != 0);

        return isOdd;

    }

    public static boolean isEven(int num){

        boolean isEven = num % 2 == 0;
        return isEven;
    }


    public static String maxNumber(int num1 , int num2){

        String maxNumber;

        return maxNumber = (num1 > num2) ? num1 + " is the max number" : num2 + " is the max number";



    }

    public static String minNumber (int num3, int num4) {
        String minNumber;
        return minNumber=(num3<num4)?num3+" is minimum number" :num4 + " is minimum number";

    }



}

/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */


