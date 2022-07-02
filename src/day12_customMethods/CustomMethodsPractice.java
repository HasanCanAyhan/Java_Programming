package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(10.5, 20.5);

        System.out.println("------------------------------------");

        maxNum(15000,16000);

        System.out.println("------------------------------------");

        maxNum(-200 , -20);

        System.out.println("------------------------------------");

        initial("Mohammed","Karim"); // M.K

        System.out.println("------------------------------------");

        initial("Hasan", "Ayhan"); // H.A

        System.out.println("------------------------------------");

        initial("Java","Programming"); // J.P

    }


    // create a method that can check if a person is eligible to buy alcohol (age)

    public static void eligibleToBuyAlcohol(int age){

        if (age >= 18){
            System.out.println("Eligible to buy alcohol");

        }else{
            System.out.println("Not eligible to buy alcohol");
        }


    }


    // create a method that can check if a number is odd, or even or zero (number)

    public static void oddOrEvenOrZero(int number){

        if (number == 0 ){
            System.out.println(number + " is zero.");
        }else if(number %2 != 0){
            System.out.println(number + " is odd.");
        }else if (number %2 == 0 && number != 0){
            System.out.println(number + " is even.");
        }

    }



    // create a method that can calculate the grade of the students (score)
    public static void grade(int score){

        if (score >= 90){
            System.out.println(score + " is A");
        }else if (score >= 80 && score < 90){
            System.out.println(score + " is B");
        }else if (score >= 70 && score < 80){
            System.out.println(score + " is C");
        }else if (score >= 60 && score < 70){
            System.out.println(score + " is D");
        }else{
            System.out.println(score + " is F");
        }



    }



    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal" (num1 ,num2)

    public static void maxNum(double num1, double num2){

        if( num1 > num2){
            System.out.println(num1 + " is maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }


    }





    //Create a method that can display the initials of a person (firstName. lastName)

/*
firstName = "Cydeo"
lastName = "School"

initial ===> C.S

 */

    public static void initial(String firstName, String lastName){


        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial is= " + initial);




    }





}



// create a method that can check if a person is eligible to buy alcohol  (age)


// create a method that can check if a number is odd, or even or zero (number)


// create a method that can calculate the grade of the students  (score)


// create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal" (num1 , num2)


//Create a method that can display the initials of a person (firstName. lastName)

/*
firstName = "Cydeo"
lastName = "School"

initial ===> C.S

 */

