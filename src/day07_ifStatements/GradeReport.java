package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {


        int score = 85; // 0 ~ 100

        String result = "Your grade is: ";
        
        if (score >= 90){ // false : score < 90
            result += "A";
        } else if (score >= 80 && score < 90) { // false : score < 80
            result+= "B";
        } else if (score >= 70 && score < 80) { // false : score < 70
            result += "C";
        } else if (score >= 60 && score < 70) { // false : score < 60
            result += "D";
        }else { //  score < 60
            result += "F";
        }

        System.out.println(result);

        // or :  System.out.println( "Your grade is: " + result );


    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A

Note: Assume that the given score is between 0 ~ 100
 */