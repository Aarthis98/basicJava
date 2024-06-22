package Assignment_Inheritance;

public class Vehicle {
   private String make;
   private String model;
   private String year;

    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("\n");
        System.out.println("Start the Car");
    }

    public void stop(){
        System.out.println("Stopped");
    }
    public void displayinfo(){

        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
