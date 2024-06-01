package Assignment1_If;

import java.util.Scanner;

public class GreaterOfGivenNumbers {
    public static void main(String[] args) {

      //  System.out.println("Enter the numbers");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x Value : ");
        int x = sc.nextInt();
        System.out.println("Enter y Value : ");
        int y = sc.nextInt();
        System.out.println("Enter z Value : ");
        int z = sc.nextInt();

        if((x>y)&&(x>z)){
            System.out.println("The value of x is greater than y and z");

        }else if(y>z){
            System.out.println("The value of y is greater than x and z");
        }else{
            System.out.println("The value of z is greater than x and y");
        }

    }
}
