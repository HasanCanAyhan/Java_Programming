package day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // accepts duplicates , keeps insertion order , has index (index number)
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);
        //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90] order is preserved and duplicates is accepted

        System.out.println("------------------------------------------------------");

        Set<Integer> set1 = new HashSet<>(); // set is interface we can not create object from it
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set1);// [null, 200, 40, 10, 90, 300] // order is random and duplicates is not accepted and null is accepted

        System.out.println("------------------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set2);
        // [10, 200, 300, 40, 90, null]
        // first                  last keeps the insertion order

        System.out.println("------------------------------------------------------");

        String str = null;
        //System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        //set3.addAll(Arrays.asList(null,null,null,null,null)); // error : NullPointerException, doesnt accept null values

        System.out.println(set3);// [10, 40, 90, 200, 300]

        System.out.println("------------------------------------------------------");

        String[] words = {"Java", "Java","Java","Python","Python","C#","C++","Ruby","C#","C#"};

        // we want to see element as non duplicates and keeps order : LinkedHashSet

        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);
        //[Java, Python, C#, C++, Ruby]


        //System.out.println(result.get(1)); Set does not have index number, thats why we can not use get(i) method


        /*
        for (String each : result) {
            System.out.println(each);
        }

         */



        //                                  ()Constructor takes Collection argument
        System.out.println( new ArrayList<>(result).get(1)   ); // Python

        // converting to array ==>> toArray() method from Collection Interface

        words = result.toArray(new String[0]); // converting Set to Array , reason is faster!!

        System.out.println("words Array :  = " + Arrays.toString(words));
        // words Array :  = [Java, Python, C#, C++, Ruby]

        System.out.println("------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,20,20,30,30,30,40,40,40,50,50,5,5,5,1,1,1,2,2,2));

        // TreeSet

        Set<Integer> n = new TreeSet<>(numbers);

        System.out.println(n);
        // [1, 2, 5, 10, 20, 30, 40, 50] - non duplicated elements and ascending order


        // numbers = new ArrayList<>(n);



    }


}
