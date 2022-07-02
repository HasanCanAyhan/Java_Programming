package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names); // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye] - orginal


        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);

        }

        names = nonDup; // in order to make it should be eligible for garbage collection
    //  refVar

        System.out.println(names); // [Vasyl, Sumeye, Ali]


    }

}
