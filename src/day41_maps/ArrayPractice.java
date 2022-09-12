package day41_maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70,80,90,100,110));

        List<Integer>[] arrayOfLists = new List[3]; // that is array and store 3 list object

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;


        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]
        // arrays supports any object


        // 5 -->> 50

        arrayOfLists[0].set(4,50) ;
        //    arrayOfLists[0] returns list

        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]


        Set<Integer>[] arrayOfSet = new Set[5];
        //dataType is Set

        System.out.println(Arrays.toString(arrayOfSet)); // [null, null, null, null, null]

        arrayOfSet[0] = new LinkedHashSet<>();
        arrayOfSet[1] = new LinkedHashSet<>();
        arrayOfSet[2] = new LinkedHashSet<>();
        arrayOfSet[3] = new LinkedHashSet<>();
        arrayOfSet[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSet)); // [[], [], [], [], []]

        arrayOfSet[2].addAll(Arrays.asList(1,2,3,4));
        //  arrayOfSet[2] returns SetList

        System.out.println(Arrays.toString(arrayOfSet)); // [[], [], [1, 2, 3, 4], [], []]





    }

}
