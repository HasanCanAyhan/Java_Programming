package day38_exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        //for  checked exceptions 2 was :  try&catch and throws
        // unchecked just only try&catch

        // faster and cleaner code than try&catch


        /*
        System.out.println("Program1 started");

        //System.out.println(100 / 0); unchecked throws can not effect it

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("----------------------------------------------------");

        System.out.println("Program2 started");

        //System.out.println(100 / 0);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program2 ended");


         */

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");


        System.out.println("-------------------------------------------");

        System.out.println("Program3 started");

        Thread.sleep(5000);

        System.out.println("Program3 ended");

    }



}
