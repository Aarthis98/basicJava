package May_28;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int y= sc.nextInt();
        int x;
        for(x=1;x<=10;x++){
            int num = x*y;
            System.out.println(x + " * " + y  + " = " + num);
        }
    }
}
