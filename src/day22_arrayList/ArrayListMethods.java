package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // instance called with object
        // static called with class

        // add()

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3

        //list.add(5.5);


        System.out.println(list); // [10, 20, 30, 10]

        list.add(1, 15); // i5 will go to 1.index and 20 will go to the next right side.

        System.out.println(list);// [10, 15, 20, 30, 10]

        list.add(2, 25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]

        System.out.println("---------------------------------------");

        // get()

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohammed");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size()); // total element
        System.out.println(studentsList); // [Mohammed, Abdurasul, Abidullah, Tatiana]

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent); // Mohammed

        String lastStudent = studentsList.get(  studentsList.size()-1         );
        System.out.println(lastStudent); // Tatiana

        System.out.println("---------------------------------------");


    }

}
