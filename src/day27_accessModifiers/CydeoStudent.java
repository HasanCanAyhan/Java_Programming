package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;


    public static String schoolName;
    public static String secretCode;




    public CydeoStudent(String name, int age, char gender) { // for  Initialization instance variables
        this.name = name;
        this.age = age;
        this.gender = gender;
        //schoolName = "Cydeo School";
        //secretCode = "Wooden Spoon";
    }


    static { // for Initialization static variables , it can be lots of process before the initializate the static variables, therefore we use the static block
        schoolName = "Cydeo School";  // one time
        secretCode = "Wooden Spoon"; // one time
    }



    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
