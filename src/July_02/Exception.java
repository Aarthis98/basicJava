package July_02;

//NullPointerException


public class Exception {
    public static void main(String[] args) {

        String s ="Pragra";
        s = null;
        System.out.println("Test for checking this line is printing or not...");//print
        String uppercase = s.toUpperCase();
        System.out.println("Checking...");//doesnt print
        System.out.println(uppercase);



    }
}
