package Assignment_Inheritance;

public class Motarcycle extends Vehicle{

   int numOfCylinder;

    public Motarcycle(String make, String model, String year, int numOfCylinder) {
        super(make, model, year);
        this.numOfCylinder = numOfCylinder;
    }

    public void printCylinder(){
       System.out.println("Number of Cylinder : " + numOfCylinder);
   }
}
