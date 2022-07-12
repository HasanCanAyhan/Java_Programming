package utilities;

public class Library {

    // custom method
    public static void sleep(double seconds)  {

        // try&catch block is parmanent solution
        try {
            Thread.sleep(  (long) (seconds * 1000 )  ); // it should be milisecond
            // this method takes long argument
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }



}
