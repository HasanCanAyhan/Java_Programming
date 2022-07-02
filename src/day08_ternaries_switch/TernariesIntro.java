package day08_ternaries_switch;

public class TernariesIntro {

    public static void main(String[] args) {


        int score = 85;

        String result ;

        if (score >= 60){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("---------------------------------------------------");


        // Ternary ~  Short-hand If Else

        // condition must be before the question mark

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);


        System.out.println("---------------------------------------------------");

        int age = 34;

        /*
        String r;

        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not eligible";
        }


         */

        // with ternary :

        String result3 =   (age >= 21) ? "Eligible" : "Not eligible";

        System.out.println(result3);




    }
}
