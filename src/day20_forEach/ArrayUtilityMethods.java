package day20_forEach;

import java.util.Arrays;
//keyword package class; we can call methods with the name of Arrays class , ex : Arrays.method()

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        // Arrays Class : presented in " java.util" package
        /*
        methods:
            toString()
            sort()
            equals()
            copyOf()
            copyOfRange()

         */

        // toString() : Returns a string representation of the contents of this array

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score)); // [70, 100, 80, 90, 65]

        // or:

        String result = Arrays.toString(score);
        System.out.println(result); // [70, 100, 80, 90, 65]

        System.out.println("-----------------------------------------------------");

        // equals() : Returns boolean, checks if both the arrays are equal or not.

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2); // checks index by index in the same order
        System.out.println(r1); // true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2); // false because in different orders

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2)); // false different orders


        System.out.println("-----------------------------------------------------");

        // sort() : sorts the complete array in ascending order from smallest to largest

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums)); // [100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500]

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); // [0, 4, 5, 75, 80, 88, 90, 99, 100, 500, 1000]
        System.out.println("Min number : " + nums[0]); // 0
        System.out.println("Max number : " + nums[nums.length-1]); // 1000


        System.out.println("-----------------------------------------------------");

        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1); // b1 = {A,B,C}
        Arrays.sort(b2); // b2 = {A,B,C}

        System.out.println(Arrays.equals(b1,b2)); // true , with helping of sort method


        System.out.println("-----------------------------------------------------");


        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students)); // [Yaxier, Madiyar, Ali, Abidullah, Alena]

        Arrays.sort(students);

        System.out.println(Arrays.toString(students)); // [Abidullah, Alena, Ali, Madiyar, Yaxier] according to Ascii Table

        System.out.println("-----------------------------------------------------");

        // copyOf(array, new length) :  Returns new array, copies the specified array, (truncating or padding with zeros if necessary)

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array,7);
        System.out.println(Arrays.toString(array2)); // [10, 20, 30, 40, 50, 60, 70]

        int[] array3 = Arrays.copyOf(array,4);
        System.out.println(Arrays.toString(array3)); // [10, 20, 30, 40]

        int[] array4 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(array4)); // [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

        System.out.println("-----------------------------------------------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        // merge 2.Approach

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);

        for (int i = 0 , j = n1.length; i < n2.length; i++, j++) {
                n3[j]  =  n2[i];
        }

        System.out.println(Arrays.toString(n3)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        System.out.println("-----------------------------------------------------");

        // copyOfRange(array, begIndex, endIndex) : Returns new array, copies the specified range of the specified array

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch,4); // 1-4 elements (0 - 3 index numbers)

        System.out.println(Arrays.toString(result1)); // [A, B, C, D]

        char[] result2 = Arrays.copyOfRange(ch,2,4+1); // we should write 5 because 5 will be excluded

        System.out.println(Arrays.toString(result2));//[C, D, E]

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length); // from index 2 to the end .

        System.out.println(Arrays.toString(result3)); // [C, D, E, F, G]




    }

}
