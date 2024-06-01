package May_21;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int ab= sc.nextInt();
        if (ab%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }

    }
