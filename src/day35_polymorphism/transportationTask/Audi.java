package day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark{


    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() { // from Transportation Class-Parent

    }

    @Override
    public void start() {// from Transportation Class-Parent

    }


    @Override
    public void autoPark() {// from AutoPark-Interface

    }


}
/*
7. Create a sub class of car named Audi that implements AutoPark
 */