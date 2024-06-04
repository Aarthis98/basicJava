package June_01;


//class have properties
// behaviour
// in java we call functions as methods
//methods - set of block of statements which perform specific task
// we can call methods whenever we need

/*
 Syntax for method
  Access specifier (public,private)
  return_type method_name(){

  -----
  return x ;

  }

 */

import java.util.Scanner;


public class CalculatorClass {
    public static void modulos(int a, int b){
        int result = a % b;
        System.out.println(a + " % " + b + " = " +result);

    }
    public static void main(String[] args) {

            System.out.println("********************");
            System.out.println("Calculator");
            System.out.println("********************");
            char choice;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the First Number");
                int num1 = sc.nextInt();
                System.out.println("Enter the Second Number");
                int num2 = sc.nextInt();
                System.out.println("Press 1 for Addition");
                System.out.println("Press 2 for Subtraction");
                System.out.println("Press 3 for Multiplication");
                System.out.println("Press 4 for Division");
                System.out.println("Press 5 for Modulus");
                System.out.println("Press 6 for Exit");
                int input = sc.nextInt();

                CalcMain calc = new CalcMain(); // object created
                switch (input) {
                    case 1:
                        calc.sum(num1,num2);
                        break;
                    case 2:
                       calc.sub(num1,num2);
                       break;
                    case 3:
                       calc.multiply(num1,num2);
                       break;

                    case 4:
                       calc.divide(num1,num2);;
                        break;
                    case 5:
                       modulos(num1,num2);
                        break;
                    default:
                        break;
                }
                System.out.println("Do you wish to continue press Y or Press Q");
                choice = sc.next().charAt(0);
            } while((choice == 'Y') || (choice=='y'));
    }
 /*
 // refer overloading
 void modulos(int a, int b){
     int result = a % b;
     System.out.println(a + " % " + b + " = " +result);
     }
  */

}


