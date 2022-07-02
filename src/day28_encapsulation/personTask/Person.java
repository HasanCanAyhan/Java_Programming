package day28_encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;


    // Those instance variable has to be set


    public Person(String name) { // allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { // allows us to create Person object just by setting the name & age  of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {// allows us to create Person object just by setting the name & language  of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {// allows us to create Person object just by setting the name & gender  of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {// allows us to create Person object just by setting the name & age & gender  of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {// allows us to create Person object just by setting the name & age & gender & language of the person

        this(name, age, gender);
        this.language = language;
    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;
    }

    public static  void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is eating " + drink);
    }

    public String toString() { // it is instance method
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }


}

/*
Warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()



Custom Class:
	1. Class & Object
	2. Instance Variables & instance methods
	3. Statics (Static Variables, Static Methods, static Block)
	4. Constructor


 */