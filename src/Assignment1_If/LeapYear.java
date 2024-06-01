package Assignment1_If;


/*
Create a program that checks if a given year is a leap year or not
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        boolean leap;

        leap=((year % 4 == 0)&& (year % 100 != 0 || year % 400 == 0));

        if(leap){
            System.out.println(year +" is a leap year");
        }else {
            System.out.println(year +" is not a leap year");
        }
    }
}
