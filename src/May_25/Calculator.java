package May_25;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        System.out.println("********************");
        System.out.println("Calculator");
        System.out.println("********************");
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Number");
            double num1 = sc.nextDouble();
            System.out.println("Enter the Second Number");
            double num2 = sc.nextDouble();
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Modulus");
            System.out.println("Press 6 for Exit");
            double result;
            int input = sc.nextInt();

            // System.out.println("Choose an operator: +, -, *, /, or %");
            //char symbol = sc.next().charAt(0);
            switch (input) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + "*" + num2 + " = " + result);
                    break;

                case 4:
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                    break;
                default:
                    break;
            }
            System.out.println("Do you wish to continue press Y or Press Q");
             choice = sc.next().charAt(0);
        } while((choice == 'Y') || (choice=='y'));




    }
}
