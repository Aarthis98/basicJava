package May_18;
/*
Write a program that takes an integer as input and prints out whether it is even or odd
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
       System.out.println("Hello World");
        System.out.println("Hello Java");
       // int a= 5;
        Scanner sc=new Scanner(System.in);
        int ab= sc.nextInt();
        int a=ab%2;
        if (a==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }






    }
}
