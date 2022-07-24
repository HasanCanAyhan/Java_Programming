package day40_collections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        // without removeIf()
        //Collections' remove() method you should never use it in the loop.
        //but Iterator's remove() method you can use it


        Iterator<String> it = names.iterator();

        while (it.hasNext()){

            String each = it.next();

            String reversed = "";

            for (int i = each.length()-1 ; i >= 0 ; i--) {

                reversed += each.charAt(i);

            }


            if (each.equalsIgnoreCase(reversed)){
                //names.remove(each); //Collections' remove() method you should never use it in the loop.
                it.remove(); //but Iterator's remove() method you can use it
            }




        }

        System.out.println(names); // [Java, Python, Cydeo, Car]


        System.out.println("----------------------------------------------------------------");

        // with removeIf

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        //                    our custom method from StringUtility
        names2.removeIf( p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        //names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)   );
        //                                           converting to String                  p : orginal string

        System.out.println(names2);//[Java, Python, Cydeo, Car]

    }


}
