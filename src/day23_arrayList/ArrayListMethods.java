package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        // set()

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>(); // mutable you can change it

        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); // [Eggs, paper Towels, Apples, Cooking oil]

        // groceriesList[2] = "Oranges";

        groceriesList.set(2,"Oranges");  // size will not change will be same.

        System.out.println(groceriesList); // [Eggs, paper Towels, Oranges, Cooking oil]

        groceriesList.add(2,"Chicken"); // add methods increase the size

        System.out.println(groceriesList); //  [Eggs, paper Towels, Chicken, Oranges, Cooking oil]


        System.out.println("---------------------------------------");

        // remove() : 2 option

        groceriesList.remove(0);
        System.out.println(groceriesList); // [paper Towels, Chicken, Oranges, Cooking oil]

        groceriesList.remove("paper Towels");

        System.out.println(groceriesList); // [Chicken, Oranges, Cooking oil]


        System.out.println("---------------------------------------");

        // remove method ex : Integer

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        //                             wrapper class object
       boolean r1 = numbers.remove(  Integer.valueOf(10)   ); // 10 is object

        System.out.println(numbers); // [20, 30, 40, 50]

        System.out.println(r1); // true

        System.out.println("---------------------------------------");

        // clear()

        numbers.clear();

        System.out.println(numbers); // []
        System.out.println(numbers.size()); // 0

        System.out.println("---------------------------------------");

        // indexOf() -  lastIndexOf()

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl")         ); // 0
        System.out.println(  names.lastIndexOf("Vasyl")   ); // 1

        System.out.println(  names.lastIndexOf("Sumeye") ); // 5

        System.out.println("---------------------------------------");

        // contains() , one element

        boolean hasMuhtar = names.contains("Muhtar");
        System.out.println("hasMuhtar = " + hasMuhtar); // false

        boolean hasAli = names.contains("Ali");
        System.out.println("hasAli = " + hasAli); // true


        System.out.println("---------------------------------------");

        // equals()

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 =  list1;

        list1.add(10);

        System.out.println(list1); // [10]
        System.out.println(list2); // [10]

        System.out.println( list1 == list2 ); // true


        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println( l1 == l2); // false  different objects

        System.out.println(l1.equals(l2)); // true

        System.out.println("---------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));// false-- because different order

        System.out.println("---------------------------------------");

        // isEmpty()

        System.out.println(  n1.isEmpty()  ); // false
        System.out.println(  n2.isEmpty()  ); // false

        n1.clear();
        n2.clear();

        System.out.println(  n1.isEmpty()  ); // true
        System.out.println(  n2.isEmpty()  ); // true

    }



}
