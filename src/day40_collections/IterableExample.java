package day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        /*
        for (Integer each : list) { // for each loop is also using Iterable(implicitly)
            if (each < 5){
                list.remove(each); // (object) , false result
            }
        }
         */


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 5){
                list.remove(i); // (index)
            }

        }

        System.out.println(list); // false result, because size of list is dynamic

        System.out.println("-------------------------------------------------------------");

        // Every single Collection object has a relationship with Iterable

        List<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        Iterator<Integer>  it = list2.iterator(); // return type Iterator<Integer> Intellij says.

        // with while loop : better to read!!

        while (it.hasNext()){ //for checking
            Integer each = it.next();// get the element

            if (each < 5){
                it.remove(); // remove method from Iterable -- not from Collection
            }

        }

        System.out.println(list2); // [5, 5, 6, 7, 5, 6, 7]


        System.out.println("----------------------------------------------------------");

        // with for-loop

        List<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));


        for(Iterator<Integer> i = list3.iterator();  i.hasNext(); ){

            Integer each = i.next();

            if (each < 5 ){
                i.remove();
            }

        }

        System.out.println(list3);


        System.out.println("-------------------------------------------------------------");

        // removeIf() uses implicitly iterator , comes from Collection

        List<Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list4.removeIf( each -> each < 5);

        System.out.println(list4);


        System.out.println("-------------------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();

        list5.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list5.removeIf( p -> p < 5);

        System.out.println(list5);



    }



}
