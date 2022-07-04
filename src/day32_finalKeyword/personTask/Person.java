package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    /*
    If we declare the variables as static,
    it(static) means there will be only one copy of each variable for all objects.
    But we are trying to create different instances/objects.
    We use final to make the variables of each object unchangeable.
     */

    private String name;
    private final char gender; // no default value , you should assign before using
    private final int age;
    private final LocalDate dateOfBirth;


    public static final int numberOfHead;


    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender,LocalDate dateOfBirth) {
        setName(name);
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    /*
    **** If the instance variable is final , we can only getter , we can not setter !!!!
     */

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Methods

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public final void breath(){ // to make sure that this implementation will not change for any sub class
        System.out.println(name + " is breathing");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }



}

/*
Variables :
    name, gender, age, dateOfBirth
    numberOfHead

Methods :
    eat(), drink(), sleep()
    breath()

 */