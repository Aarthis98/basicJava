package June_04;

public class StaticMethodAndBlocks {

public static void printName(){
    System.out.println("Pragra");
}
public void printNothing(){
    System.out.println("Nothing to print");
}

    public static void main(String[] args) {
        //printName();
        new StaticMethodAndBlocks();// instance block printed
    }
    static {
        System.out.println("Static block");

    }
    {
        System.out.println("Instance Block");
    }
}
