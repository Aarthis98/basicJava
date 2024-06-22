package Assignment_Inheritance;

public class Car extends Vehicle{
    int numOfDoors;

    public Car(String make, String model, String year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }
    public void printDoors(){
        System.out.println("Print number of doors :" + numOfDoors);
    }
}
