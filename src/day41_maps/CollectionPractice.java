package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {


        /*
        List<int[]> list = new ArrayList<>();
        // nested list : list of list
        // list of array


         */

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));


        List<List<Integer>> lists = new ArrayList<>(); // store 2 list object
        //lists.addAll(Arrays.asList(list1,list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);        //[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]

        // we want to find the element 10

        System.out.println(lists.get(1)); // [7, 8, 9, 10, 11]
        //[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]
        //     get(0)                get(1)


        System.out.println(lists.get(1).get(3)); // 10
        //                      list1 .  element

        System.out.println("-------------------------------------------------------");

        for ( List<Integer> eachList :  lists){

            for (Integer eachElement : eachList) {

                System.out.println(eachElement);
            }

        }


        System.out.println("-------------------------------------------------------------");
        //List<int[][]>  l = new ArrayList<>(); // only store 2-dimentional array

        List<Set<Integer>>  listOfSets = new ArrayList<>();

        listOfSets.add( new LinkedHashSet<>()); // 0
        listOfSets.add( new LinkedHashSet<>()); // 1
        listOfSets.add( new LinkedHashSet<>()); // 2
        listOfSets.add( new LinkedHashSet<>()); // 3


        System.out.println(listOfSets);

        // {10,5,20}

        listOfSets.get(0).addAll(Arrays.asList(10,5,20,10,5,20));
        listOfSets.get(1).addAll(Arrays.asList(30,15,30));
        listOfSets.get(2).addAll(Arrays.asList(300,150,40));
        listOfSets.get(3).addAll(Arrays.asList(3000,1,5));


        System.out.println(listOfSets); // [[10, 5, 20], [30, 15], [300, 150, 40], [3000, 1, 5]]


        System.out.println("---------------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        //    it is also object , collection support any object
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        //System.out.println(listOfArrays);

        listOfArrays.get(0)[2] = 35;
        //        array    [2]


        System.out.println( Arrays.toString(  listOfArrays.get(0) )   ); // [1, 2, 35, 4]


        System.out.println("---------------------------------------------------");

        //List<List<Employee>> teams  = new ArrayList<>();
        // store list object of Employee






    }

}
