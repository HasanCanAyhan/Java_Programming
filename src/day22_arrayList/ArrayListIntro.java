package day22_arrayList;

import java.util.Arrays;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {


        int[] array = new int[5]; // {0,0,0,0,0,0} ,max and min size = 5(fixed)--->> that is disadvantage!

        array[0]= 10;// {10,0,0,0,0}
        array[1]= 20;//{10,20,0,0,0}
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //array[5] = 60;

        System.out.println(Arrays.toString(array));


        System.out.println("----------------------------------------------");

        // ARRAY LIST

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list); // Empty List , size:0
        System.out.println(list.size()); // 0



    }

}
