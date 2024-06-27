package Assignment_Interfaces.Animal;

public class Monkey implements Animal,Climable{
    @Override
    public void feed() {
        System.out.println("\nMonkey Feeds Fruits,Seeds,Herbs...");
    }

    @Override
    public void makeSound() {
        System.out.println("Chatter Sound");
    }

    @Override
    public void climb() {
        System.out.println("Monkey can Climb..");
    }
}
