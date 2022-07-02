package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = {new Person(),new Person(),new Person(),new Person(), new Person()}; // 5 person object

        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Can",'M', LocalDate.of(1995,3,24));
        people[2].setInfo("John",'M', LocalDate.of(1955,2,22));
        people[3].setInfo("Gabriel",'M', LocalDate.of(1960,1,28));
        people[4].setInfo("Beck",'M', LocalDate.of(1962,5,26));


        ArrayList<Person>studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people)   );



        // print name & date of birth of each person

        for (Person person : people) {
            System.out.println("name : " + person.name + " - birthday : " + person.dateOfBirth);
        }

        System.out.println("-----------------------------------------");

        // remove all the person object that has the age > 55,  removeIf

        studentList.removeIf( each -> each.age > 55  );

        for (Person each : studentList) {

            System.out.println(each);
        }



    }


}
