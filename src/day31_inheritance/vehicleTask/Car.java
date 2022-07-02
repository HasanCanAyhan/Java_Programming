package day31_inheritance.vehicleTask;

public class Car extends Vehicle{


    public Car(String brand, String model, String color, int year, double price) {  // 5 parameters + plus(if there is extra info)
        super(brand, model, color, year, price); // 5 parameters
    }

    public void drive(){
        System.out.println("Driving " + getBrand() + " "+ getModel());
    }


}
/*

	2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()
 */