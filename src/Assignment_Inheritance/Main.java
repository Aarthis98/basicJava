package Assignment_Inheritance;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Honda","CRV","2024");
        vehicle.start();
        vehicle.displayinfo();
        vehicle.stop();

       /* Car car = new Car("Honda","SUV","2024",5);
        car.displayinfo();
        car.printDoors();

        */

        Motarcycle motarcycle = new Motarcycle("BMW","CRV","2024",1);
        motarcycle.start();
        motarcycle.displayinfo();
        motarcycle.printCylinder();
        motarcycle.stop();

        ElectricCar electricCar = new ElectricCar("TATA","Swift","2024",1,89);
        electricCar.start();
        electricCar.displayinfo();
        electricCar.chargeBattery();
        electricCar.stop();
    }
}
