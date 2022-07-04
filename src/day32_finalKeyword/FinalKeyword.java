package day32_finalKeyword;

import java.time.LocalDate;


class CydeoStudent  { // String class is = public final class String

    public final void language(){
        System.out.println("Java Programming");
    }

}


public final class FinalKeyword extends CydeoStudent{

    /*
    @Override
    public void language() { // final methods can never be overridden
        System.out.println("Python Programming");
    }


     */


    public  FinalKeyword(){

    }




    /*
    FINAL KEYWORD:

    - can not re-assign, inherit, override
    - used to restrict the user
    - makes the features unchangeable
    - only applicable to a variable, method, or a class
    - Final Variable : Stop value change
    - Final Method : Prevent Method Overridding
    - Final Class : Prevent Inheritance

    -Constructor can not be final

    - Private and final methods can be overloaded but they cannot be overridden

     */

    public static void main(String[] args) { // you shouldn´t make main method final , pointless!!


        final char gender = 'M';

        System.out.println(gender); // M

        // gender = 'F'; --->> error

        System.out.println(gender); // F


        System.out.println("---------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

       // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("---------------------------------------");


        new CydeoStudent().language();
        new FinalKeyword().language();

        System.out.println("---------------------------------------");

        // Garbage Collection

        final String name = "James"; // so after final keyword object won't be eligible for garbage collection

        //name = null;

        // name = "Daniel"; --> new Object

        System.out.println(name);


    }






}
