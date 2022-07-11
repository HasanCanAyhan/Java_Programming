package day35_polymorphism.transportationTask;

public interface AutoPilot extends AutoPark{

    //void autoPark(); do not need to create a new one , just reuse from the AutoPark interface

    void selfDrive();


}
/*
3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot() == (selfDrive())
 */
