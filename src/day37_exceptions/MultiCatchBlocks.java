package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive(); // NullPointerException

        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){ // Runtime is our guarantee!:) // Parent exception class can not be placed before child exception class
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }



        System.out.println("Program1 ended");

        /*
        try {

        }catch (){

        }try {

        }try{

        }


         */





    }


}
