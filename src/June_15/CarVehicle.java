package June_15;

public class CarVehicle extends VehicleInheritance{

    int numOfSeats;
    //constructor
    public CarVehicle(String make, String model, String year, String color, String type) {
        super(make, model, year, color, type);
        this.numOfSeats = numOfSeats;
    }
    public void brake(){
        System.out.println("Brake");
        System.out.println(super.color);
        System.out.println(this.numOfSeats);
    }
}
