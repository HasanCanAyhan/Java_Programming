package day18_garbageCollection;

/*
NOTE : if the variables inside the method , we can call it "Local variable".
 */

class Car{

    // All it are stored in Heap
    public String brand;
    public String model;
    public String color;
    public int year;

}

public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // local variable -references 100 , so  a and 100 are  stored in Stack

        Car car = new Car();
        //  car : reference variable in the Stack Memory
        // new Car : in the Heap

        System.out.println("-------------------------------------");

        String batch1 = new String("Java");
        String batch2 = new String("Java");   // 3 different objects
        String batch3 = new String("Java");

        String batch4 = new String("Java");  // 1 object 3 reference variable
        String batch5 = batch4;
        String batch6 = batch5;

    }

    public static void method1(){

        int b = 200; //  b and 100 are  stored in Stack

    }

    public static void method2() {

        String c = "Hello World"; // object is "Hello World"  --->>> it is still in the heap  inside the Strig pool
        //for c in Stack  in Heap

        String d = new String("Hello World");
        //    stack    heap

    }


    }
