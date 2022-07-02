package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {


        Employee e1 = new Employee("Khashaya",32,'M',"Java Developer",95000, LocalDate.of(2022,12,2));
        Employee e2 = new Employee("Muhammed",31,'M',"Project Manager",120000, LocalDate.of(2021,12,2));

        System.out.println(e1);
        System.out.println(e2);


    }
}
