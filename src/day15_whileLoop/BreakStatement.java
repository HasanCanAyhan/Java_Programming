package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        // Break statement  has to be either "Switch" or "Loop"
        for (int i = 0; i < 10 ; i++) {

            if(i == 6){ // if i's value reaches 6
                break; // exits the loop
            }

            System.out.println(i); // 1 2 3 4 5

        }


        System.out.println("--------------------------------------");


        for (char i = 'A'; i <= 'Z' ; i++) {

           //System.out.println(i);// tıll J , j ıncluded

            if(i == 'J'){
                System.out.println("Loop is terminated");
                break;
             //    System.out.println("Loop is terminated"); --> error
            }

            System.out.print(i);// till I . I included

        }


        System.out.println("--------------------------------------");

        for (;;){
            System.out.println("Hello");
            break;
            // System.out.println("World"); ---> error
        }





    }


}
