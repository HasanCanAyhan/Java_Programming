package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String[] arr = {"A","B","C","D"}; // array is not a collection

        ArrayList<String> list = new ArrayList<>(    Arrays.asList(arr)    );

        System.out.println(list);

        System.out.println("---------------------------------------------");

        // Array supports primitive and non-primitive

        // Collection :  size is dynamic , it has lots of methods, but support non-primitive

        // ArrayList --->>> Array
        ArrayList<String> list2 = new ArrayList<>(  Arrays.asList("Java","Python","C#") );

        String[] languages = list2.toArray(new String[0]); // or :  list2.size()

        System.out.println(Arrays.toString(languages));

        System.out.println("---------------------------------------------");

        //         name must be same with Array name
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //name must be same with ArrayList
        Integer[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));
        // [1, 2, 3, 4, 5, 6, 7]




    }

}
