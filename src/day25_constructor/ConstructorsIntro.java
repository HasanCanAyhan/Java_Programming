package day25_constructor;

public class ConstructorsIntro {


    /* NOTES:

    -A special method that every class must have
    -It´s used when we creasts objects of a class
    -We can use constructors to initilize the object´s instance variables
    -Execution of a constructor always depends on the object
     */

    /*

    Creating Constructors

    -Constructor is a special method that matches the name of the class and has no return type nor a specifier.
    -2 Types : 1.No-Argument-Default Constructor
               2.Parameterized with parameters
     */


    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }

    public ConstructorsIntro(){ // it doesn´t have return type and specifier
    // default constructor
        System.out.println("Object is created by using default constructor");
    }


    public  void add(){

    }


    public static void main(String[] args) {

       ConstructorsIntro obj1 =  new ConstructorsIntro(10);

       ConstructorsIntro obj2 =  new ConstructorsIntro();
       ConstructorsIntro obj3 = new ConstructorsIntro();



    }




}
