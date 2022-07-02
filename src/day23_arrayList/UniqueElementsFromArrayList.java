package day23_arrayList;

import java.util.ArrayList;

public class UniqueElementsFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);


        String result = "";

        for (Integer eachElement : numbers) {

            int count = 0;

            for (Integer number : numbers) {

                if(eachElement.equals(number)){
                    count++;
                }

            }

            if(count == 1){
                result += ""+eachElement;
                break;
            }


        }

        System.out.println("result = " + result);



    }


}
/*
3. Write a program that can return the first unique elements from an array list
            Ex:
                ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

            output:
                2
 */
