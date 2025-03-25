package July_02.ErrorCreation;

//ArithmeticException

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");// give 10
        int a= sc.nextInt();
        System.out.println("Enter the second number");//give 0
        int b = sc.nextInt();

        System.out.println("Division of numbers");
        int c = a/b;
        System.out.println(c);
    }
}
