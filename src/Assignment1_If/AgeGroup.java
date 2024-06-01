package Assignment1_If;

import java.util.Scanner;

/*
Create a program that takes a person's age as input and prints out
their corresponding age group: child (0-12), teenager (13-19), adult (20-59), or senior (60 and above).
 */


public class AgeGroup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if((age>=0) && (age <=12)){
            System.out.println(" Child ");
        }else if((age>=13) && (age <=19)){
            System.out.println("Teenager");
        }else if((age>=20) && (age <=59)){
            System.out.println("Adult ");
        }else{
            System.out.println("Senior");
        }
    }
}
