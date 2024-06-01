package May_21;

import java.util.Scanner;

public class Form {
    public static void main(String[] args){



        Scanner scanner =new Scanner(System.in);
        System.out.println("First Name :");
        String fname = scanner.nextLine();
        System.out.println("Last Name :" );
        String lname = scanner.nextLine();
        System.out.println("Email Id :" );
        String email = scanner.nextLine();
        System.out.println("Phone :" );
        String phone = scanner.nextLine();
        System.out.println("Address Name :" );
        String address = scanner.nextLine();
        System.out.println("Salary:" );
        int salary = scanner.nextInt();
        //double sal = scanner.nextDouble();


        System.out.println("User register successfully and here are the details..");

        System.out.println("First Name :" +fname);
        System.out.println("Last Name :" +lname);
        System.out.println("Email Id:" +email);
        System.out.println("Phone :" +phone);
        System.out.println("Address :" +address);
        System.out.println("Salary :" +salary);




    }
}
