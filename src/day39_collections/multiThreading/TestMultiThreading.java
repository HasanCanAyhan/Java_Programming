package day39_collections.multiThreading;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        //At the same time executed
        // Hello World 1 of thread1,thread2,thread3,thread4,thread5 at the same time

        thread1.start(); // co-related with run() method
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // thread1, thread2, ... will run at the same time!!!!
    }


}
