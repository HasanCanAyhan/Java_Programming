package day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }


        System.out.println("--------------------------");

        for (int i = 0; i < 5 ; i++) { // i : 0

            for (int j = 0; j < 5 ; j++) { // inner loop 5 times executed
                System.out.println("Wooden Spoon");
            }

        }


    }

}
