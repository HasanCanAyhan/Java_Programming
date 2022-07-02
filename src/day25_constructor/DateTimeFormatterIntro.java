package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");


        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));


        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df)); // July-01-22


        System.out.println("------------------------------");

        // DateTimeFormatter

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a" );

        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf)); // 07:05

        System.out.println("------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


    }

}
