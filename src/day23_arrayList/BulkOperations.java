package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        //addAll()

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        list1.addAll(1, numbers);

        System.out.println(list1); // [1, 10, 20, 30, 40, 2, 3]


        System.out.println("----------------------------------------------------");


        ArrayList<Integer> scores = new ArrayList<>();

        // Arrays Utility
        // asList() : returns

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));
        //        addAll()     gets     CollectionType
        System.out.println(scores); // [75, 85, 95, 70, 80]


        System.out.println("----------------------------------------------------");


        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));

        System.out.println(students); // [Gadir, Hasan, Shukur, Sumeye,  Tatiana, Abidullah, Bilal]


        System.out.println("----------------------------------------------------");

        // Collection doesnt accept primitive type

        // Array  ---->>> ArrayList

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8}; // Array, it is not collection

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // 2.Way

        // l1.addAll( Arrays.asList(nums) ); // 1.Way

        System.out.println(l1);

        System.out.println("----------------------------------------------------");

        // containsAll()

        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", " Kuzzat"));

        System.out.println("hasAlena = " + hasAlena); // true
        System.out.println("hasAlenaGadir = " + hasAlenaGadir); // true
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat); // false : one of them does not exist

        System.out.println("----------------------------------------------------");

        // removeAll()

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        list.removeAll(Arrays.asList(10, 20)); // size will be decreased

        System.out.println(list); // [30, 40, 50, 60, 70]

        System.out.println("----------------------------------------------------");

        // retainAll() means "keep"  and  opposite of removeAll method

        // removes not matching

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena"));

        developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println(developers);
        // [Alena, Muhtar, Khashayar, Muhtar, Muhtar, Alena]


        System.out.println("----------------------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //groceriesList.removeAll( Arrays.asList("Rice","Orange","Strawberry","Blueberry","Paper towels" )  );
        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato")); // Those will be retain.

        System.out.println(groceriesList);
        // [Eggs, Potato, Milk, Tomato]


    }

}
