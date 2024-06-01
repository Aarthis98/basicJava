package Assignment2_Loops;

/*
write java program to find the sum of first n natural numbers
 */



import java.util.Scanner;

public class SumNnaturalnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i = 1,sum=0;
        while(i<=num){
            sum=sum+i;
            i++;

        }
        System.out.println(+sum);

    }



}
