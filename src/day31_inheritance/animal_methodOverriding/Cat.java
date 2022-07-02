package day31_inheritance.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // method overriding

    /*
     - we can not override methods with private access modifier, or with static & final specifiers
     - Only the instance methods(not private & not final) can be overriden
     - Access modifier has to be same or more visible
     - Return type has to be same
     - Method name has to be same
     */


    /*
    @Override
    public void eat(){ // only one eat method created inside the Animal Class
        // Execution depends on object ex : cat.eat() , animal.eat()
        System.out.println("Cat "+getName() + " is eating cat food");
    }


     */

    // shortcut : generate -> Override Methods
    @Override
    public void eat() {
        System.out.println("Cat "+getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+getName()  + " sleeps 12 hours in a day");
    }


    public  void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }




}
