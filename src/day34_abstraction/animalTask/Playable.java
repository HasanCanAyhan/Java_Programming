package day34_abstraction.animalTask;

public interface Playable {


    boolean isFriendly = true; // static & final , public is given by default-automatically
    // normally like this : public static final boolean isFriendly

    /*
    private static void main(String[] args) {

        System.out.println(isFriendly);

        //isFriendly = false;

    }


    // default method for instance method

    default void method1(){

    }
     */

    void play(); // abstract method
    // normally like this:  public abstract void play();




}
