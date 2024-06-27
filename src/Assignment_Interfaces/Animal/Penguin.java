package Assignment_Interfaces.Animal;

public class Penguin implements Animal , Swimmable{
    @Override
    public void feed() {
        System.out.println("\nPenguin feeds Fish,Squid...");
    }

    @Override
    public void makeSound() {
        System.out.println("Honk Sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim..");

    }
}
