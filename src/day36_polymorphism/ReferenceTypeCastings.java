package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("--------------------------------------------------------------");

        Animal animal1 = new Dog();// upcasting ===>> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark(); there is no inside Animal Class , it is inside the dog class


        ( (Dog)animal1 ) .bark(); // first way - down casting

        //Dog dog1 = (Dog) animal1; // 2. way - down casting
        //dog1.bark();


        //( (Cat)animal1 ).scratch();  // ClassCastException - Dog cannot be cast to class
        // Dog can not be converted to Cat, because there is no "IS-A" relationship between Dog and Cat

        System.out.println("----------------------------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Black", 350);

        phone.call(911);
        phone.text(123456);

        //phone.selfDefense(); there is no inside the Reference Type- Phone

        ((Nokia) phone).selfDefense();

        // ((Iphone)phone).faceTime(123456); // Nokia object cannot be cast to class
        // Nokia can not be converted to Iphone, because there is no "IS-A" relationship between Nokia and Iphone

        ((Nokia) phone).selfDefense();

        System.out.println("---------------------------------------");

        Employee employee = new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        employee.work();
        System.out.println(   ((Developer) employee).getProgrammingLanguage()   ); // down - casting
        // Developer has only this unique method - getProgrammingLanguage()

        //Tester tester = (Tester) employee; // error : because there is no "IS-A" relationship between Developer and Tester
        // employee references Developer object


        System.out.println("-----------------------------------------------");

        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,55000); // upcasting:implicit-automatically

        electric.charge();

        ((Tesla)electric).selfDrive();
        ((AutoPilot)electric).selfDrive();
        // object Tesla is a relationship with AutoPilot

        System.out.println("_------------------------------------------");

        Employee employee1 = new Teacher("James",45,'M',"B1","Math Teacher",75000);



        Employee employee2 = new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        Employee employee3 = new Driver("Aaron",48,'M',"D1","Truck Driver",90000);

        Employee employee4 = new Tester("Emily",35,'F',"E1","Manual Tester",80000);

        employee1.work();// object type - teacher will be executed
        employee2.work();
        employee3.work();
        employee4.work();



    }


}
