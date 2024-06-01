package Assignment2_Loops;

/*
Implement a program to find the factorial of a given number using a while loop
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
