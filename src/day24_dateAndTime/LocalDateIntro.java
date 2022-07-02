package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {


        // now()

        LocalDate today = LocalDate.now(); // 2022-6-16
        //                  object

        System.out.println(today); // year-month-day

        System.out.println("--------------------------------------");

        // of()

        LocalDate birthDay = LocalDate.of(1999,2,28);

        System.out.println(birthDay); // 2000-05-25

        /*
        LocalDate day = LocalDate.of(-1000,13,32);
        System.out.println(day); // Invalid


         */

        System.out.println("------------------------------------------------");

        System.out.println(today.getYear()); // 2022

        System.out.println(today.getMonth()); // JUNE

        System.out.println(today.getMonthValue()); // 6

        System.out.println(today.getDayOfWeek());// THURSDAY

        System.out.println(birthDay.getDayOfWeek()); // SUNDAY

        System.out.println(today.getDayOfMonth()); // 16

        System.out.println(today.getDayOfYear()); // today is 167.day of the year


        System.out.println("----------------------------------------------------------------------------");

        //Immutable
        today = today.plusYears(1); // 2023-6-16
        System.out.println(today);

        System.out.println("----------------------------------------------------------------------------");


        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);// 2027-6-4

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate); // 2028-01-04

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("------------------------------");


        LocalDate yourBirthDay = LocalDate.of(2005,4,1);
        LocalDate yourBrotherBirthday = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay); // 2005-04-01
        System.out.println(yourBrotherBirthday); // 2003-01-01

        System.out.println("------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1); // false

        System.out.println("------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore( LocalDate.of(2022,12,31)  ) ); // false
        System.out.println(grad_date.isAfter( LocalDate.of(2022,12,31)  ) ); // true

        System.out.println("----------------------------------------------");

        System.out.println( LocalDate.of(2022,6,16).isLeapYear()    ); // false






    }

}
