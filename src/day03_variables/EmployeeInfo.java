package day03_variables;

import javax.lang.model.SourceVersion;

public class EmployeeInfo {

    public static void main(String[] args) {

        // employee name is Daniel

        /*


        System.out.println("Daniel");
        System.out.println("Daniel");
        System.out.println("Daniel");

        System.out.println("--------------------");


        String name = "Daniel";

        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        */

        String employeeName = "Daniel";
        int age = 45;
        char gender = 'M';
        String companyName = "Apple Inc";
        String employeeId = "A10";
        String jobTitel = "Java Developer";
        int salary = 100000;
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitel);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("-------------------------");

        // soutv shortcut

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitel = " + jobTitel);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);

    }

}

/*
Declare the following variables with appropriate data types:

1. name

2. age
3. gender
4. companyName
5. employeeId
6. jobTitle
7. salary
8. isFullTime

 */