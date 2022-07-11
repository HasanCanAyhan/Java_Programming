package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation{


    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    // by using abstract keyword inside Car class , we don´t need to override two methods from parent class, we can ignore it
    // transportPeople() and start()

    public void drive(){
        System.out.println("Driving " + getMake()+ " " + getModel());
    }


}
/*
5. Create an abstract sub class of Transpotation named car

				extra methods:
					drive()
 */