package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {


       // 1.Assignment

        int a = 20;

        System.out.println(a); // 20

        System.out.println(a); // 20

        a = 40;

        System.out.println(a); // 40

        a = 90;

        System.out.println(a); // 90

        System.out.println("-------------------------------------------");

        // 2.Addition Assignment

        double balance = 100;

        balance += 1000; // balance = balance + 1000 ---->>> balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;

        System.out.println("balance = " + balance);

        System.out.println("-------------------------------------------");

        // 3.Subtraction  Assignment


        balance -= 1000;  // balance so far = 11600 - 1000

        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);

        System.out.println("-------------------------------------------");

        // 4. Multiplication  Assignment

        double salary = 45000;

        salary *= 2; // salary = 45000 * 2

        System.out.println("salary = " + salary);

        salary *= 3;

        System.out.println("salary = " + salary);

        System.out.println("-------------------------------------------");

        double eth = 4;

        eth *= 250;

        System.out.println("eth = " + eth);

        System.out.println("-------------------------------------------");

        // 5. Division  Assignment

        eth /=2;

        System.out.println("eth = " + eth);

        System.out.println("-------------------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;

        System.out.println("salary = " + salary);


        System.out.println("-------------------------------------------");

        // 6. Remainder Assignment

        int b = 35;

        b %= 7;   // b = 35 % 7

        System.out.println("b = " + b);

    }

}
