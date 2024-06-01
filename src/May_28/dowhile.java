package May_28;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        int i = 1,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        do{
            sum = sum + i;
            i++;
        }while(i<=num);

        System.out.println(+ sum);
    }
}
