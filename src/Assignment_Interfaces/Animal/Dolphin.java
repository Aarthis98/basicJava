package Assignment_Interfaces.Animal;

public class Dolphin implements Animal,Swimmable{
    @Override
    public void feed() {
        System.out.println("\nDolphin eats Fish, Squid, JellyFish..");
    }

    @Override
    public void makeSound() {
        System.out.println("Clicks,Whistle and Sonar Sound");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim..");
    }
}
