package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

     //   new GarbageCollection().finalize();

        // First way by using null

        String s1 = "Java";

        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);

     //   System.out.println(s1.toUpperCase()); //it gives error : "NullPointerException"

     //   System.out.println(s1.replace(null,"Python"));  //it gives error : "NullPointerException"

        String a = ""; // that is object
        String b = null;  // that is nothing


        System.out.println("------------------------------------------------------------------");

        // Another Way by creating new object by assigning a reference to another

        String str1 = "Python";
        str1 = "CYDEO";

        System.out.println(str1);


        System.out.println("------------------------------------------------------------------");


        Dog dog1 = new Dog();
        dog1.setInfo("Loki","Chow chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck","Bulldog", 'M',5,"Small","White");


        //dog1 = null; one way
          dog1 = dog2; // after this line dog1 will be eligible for garbage collection

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize();



    }

}
