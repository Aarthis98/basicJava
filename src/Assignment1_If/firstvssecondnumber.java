package Assignment1_If;

/*
Create a program that takes two numbers as input and prints out whether the
first number is greater than, less than, or equal to the second number.
 */


import java.util.Scanner;

public class firstvssecondnumber {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input 1");
        int a = scanner.nextInt();
        System.out.println("Input 2");
        int b = scanner.nextInt();

        if(a<b){
            System.out.println( a + " is lesser than " + b );
        } else if (a>b) {
            System.out.println(a + " is greater than " + b);
        }else if(a==b){
            System.out.println( a + " equals " + b );
        }

    }
}
