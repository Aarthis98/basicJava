package Assignment1_If;

/*

Write a program that takes three integers as input representing the lengths of the
sides of a triangle and determines whether the triangle is equilateral, isosceles, or scalene.

Hint : An equilateral triangle has 3 equal sides. An isosceles triangle has 2 equal sides.
A scalene triangle has 3 different sides.

 */


import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for 3 Sides in the Triangle");
        System.out.println("Side 1");
        int a = sc.nextInt();
        System.out.println("Side 2");
        int b = sc.nextInt();
        System.out.println("Side 3");
        int c = sc.nextInt();

        if((a==b) && (a==c)){
            System.out.println("This is an Equilateral Triangle");

        }else if((a==b)|| (a==c) || (b==c)){
            System.out.println("This is an Isosceles Triangle");
        } else if ((a!=b) && (a!=c)&& (b!=c)) {
            System.out.println("This is an Scalene Triangle");

        }else{
            System.out.println("Invalid");
        }

    }
}
