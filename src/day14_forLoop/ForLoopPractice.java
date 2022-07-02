package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i=10;  i >=  5; i-- ){// i: 10 , 9, 8, 7, 6, 5, 4
            System.out.println("Hello Cydeo " + i);// 1, 2, 3, 4, 5, 6
        }

        System.out.println("-----------------------------------------");




        // sum of all the numbers 1 ~ 100
        System.out.println("--------------------------");
        int sum = 0;
        for (int i = 1;  i <= 100; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);// 5050

        System.out.println("---------------------------");
        sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i %2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);// 2550

        // print all the alphabet letters A ~ Z

        System.out.println("--------------------------");

        for( char i = 65; i <= 90; i++ ){
            System.out.println(i);
        }

        // 2.Solution
        for(char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Hello");


        // print the alphabet letters in backwards Z ~ A
        System.out.println("--------------------------");

        for (char i = 90; i >= 65; i--){
            System.out.println(i);
        }

        // 2.Solution

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " "); // print code!
        }

        System.out.println();

        System.out.println("CYDEO");









    }
}
