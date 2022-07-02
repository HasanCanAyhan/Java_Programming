package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private  boolean isAfricanLion;


    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() { // overriden method
        //super.eat(); // calls eat method inside AnimalClass
        System.out.println("Lion" + getName() + " is eating deer");
    }

    public void roar(){ // unique methods
        System.out.println("Lion " + getName() + " is roaring ");
    }

    // override toString()

    @Override
    public String toString() { // we added one additional info
        return   super.toString().replace("}" , " ") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }








}
