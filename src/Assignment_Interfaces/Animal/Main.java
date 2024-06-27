package Assignment_Interfaces.Animal;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();
        Dolphin dolphin = new Dolphin();

        lion.feed();
        lion.makeSound();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
        dolphin.feed();
        dolphin.makeSound();
        dolphin.swim();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();

    }
}
