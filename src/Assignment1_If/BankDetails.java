package Assignment1_If;

/*
 Write a program that takes a bank account balance as input and prints out
whether the account is in overdraft (balance < 0), has a low balance (balance between 0 and 100),
or has a healthy balance (balance > 100)
 */



import java.util.Scanner;

public class BankDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balance Amount");
        double input = sc.nextDouble();

        if(input<=0){
            System.out.println("Your Account Balance is Negative," + input);
            System.out.println("Please Deposit Amount or Account will be Closed Automatically");
            System.out.println("Thanks for being with CIBC");
        } else if((input <=100) ) {
            System.out.println("Your Account Balance is very low "+ input );
            System.out.println("Please Maintain the Balance more than 100 to avoid charges");
            System.out.println("Thanks for being with CIBC");

        }else if(input > 100){
            System.out.println("Your Account Balance is " + input);
            System.out.println("Thanks for being with CIBC");

        }
    }
}
