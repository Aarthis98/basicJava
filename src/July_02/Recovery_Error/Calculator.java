package July_02.Recovery_Error;

// to see difference print the calculatorDemo in Error creation and print this also
// both gives error but because of using try catch in the below function after error output will be displayed



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");// give 10
        int a= sc.nextInt();
        System.out.println("Enter the second number");//give 0
        int b = sc.nextInt();

        int c = 0;
        try{

            String s ="Pragra";
            s = null;
            String uppercase = s.toUpperCase();
            System.out.println(uppercase);


            c = a/b;

        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            e.getMessage();
            
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally executed..");
            System.out.println("All connection closed..");
        }

        System.out.println("Division of numbers");
       
        System.out.println(c);
    }

}
