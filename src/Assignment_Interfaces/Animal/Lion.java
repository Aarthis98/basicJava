package Assignment_Interfaces.Animal;

public class Lion implements Animal {
    @Override
    public void feed() {
        System.out.println("\nLion Feeds Mammals...");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
