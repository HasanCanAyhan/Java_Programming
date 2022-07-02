package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(100);

        System.out.println("---------------------------------");

        oddOrEven(10000);

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);


        int num3 = 79;
        oddOrEven(num3);


        int num4 = 39;
        oddOrEven(num4);


    }


    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }

    // create a method that can check if a person is eligible to buy alcohol (age)

    // create a method that can check if a number is odd, or even or zero (number)

    // create a method that can calculate the grade of the students (score)


}
