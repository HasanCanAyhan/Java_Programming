package day08_ternaries_switch;

public class SwitchIntro {

    public static void main(String[] args) {


        char grade = 'Q';

            /*
            A : Excellent
            B : Great Job
            C : Good
            D : Passed
            F : Failed
             */

        /*
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }


         */



        switch (grade){  // if it is char/String/ int  , then case must be the same datatype ex : char/String/int

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

        }





}

}
