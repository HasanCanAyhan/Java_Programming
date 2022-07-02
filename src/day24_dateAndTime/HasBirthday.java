package day24_dateAndTime;

import java.time.LocalDate;

public class HasBirthday {

    public static void main(String[] args) {


        System.out.println(hasBirthday(1995,6,16));

    }

    private static String hasBirthday(int year, int month, int day) {

        String result = "";

        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(year, month , day);

        if (birthday.getMonthValue() == today.getMonthValue() && birthday.getDayOfMonth() == today.getDayOfMonth()) {
            int age = today.getYear() - birthday.getYear();
            result =  "Happy Birthday!"+ "\n" + "You are " + age + " years old.";
        } else {
            result = "Today is not your birthday.";
        }

        return result;
    }


}
/*
Create a function named birthday, that takes three int arguments:
  1. year
  2. month
  3. day

the function should be able to print the age and "Happy birthday" if today is the birthday
otherwise the function will print "Today is not your birthday.
      ex:
          birthday(1993, 6, 16);
      output:
            Happy Birthday
            You are 29 years old
 */