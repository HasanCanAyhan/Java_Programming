package day28_encapsulation.encapsulation;

public class Student {

    private String name;

    //public int age;
    private int age; //controlling over the data


    public String getName() {

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;

        for (char each : name.toCharArray()) {

            if(Character.isDigit(each)){
                hasDigit = true;
                break;
            }

        }

        if (hasDigit){ // if it is true
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;
    }




    public int getAge(){ // READ ONLY

       if(age == 0){
           System.err.println("Age has not been set");
           System.exit(1);// that means something wrong
       }

        return age;
    }

    public void setAge(int age){ // WRITE ONLY

        if( age < 1 || age > 100){ // ıf age ıs ınvalıd
            System.err.println("Invalid Age: " + age);
            //return;// exit the method
            System.exit(1); // entire program gets terminated
        }

        this.age = age;
    }


}
