package May_25;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("Enter number 1 to 10 and sum it...");

        int i = 1;
        int sum = 0;
        while(i<=10){

            sum=sum+i;
            i++;

        }
        System.out.println("Sum of First 10 numbers is " + sum);


        // next program
        System.out.println("****************************");
        System.out.println("Next Program");
        System.out.println("****************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int y= sc.nextInt();
        int x=1;
        while (x<=10){
            int num = x*y;
            System.out.println(x + " * " + y  + " = " + num);
            x++;
        }
    }
}
