package Assignment_Inheritance;

public class ElectricCar extends Car{

    int batteryCapacity;

    public ElectricCar(String make, String model, String year,int numOfDoors, int batteryCapacity) {
        super(make, model, year,numOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        System.out.println("Print Battery Charge : " +batteryCapacity);
    }
}
