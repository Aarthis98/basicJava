package Assignment2_Loops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i,j;
        for(i = 1; i <= row; i++){
            for(j = 1; j <= i; j++){
                System.out.println(j + " ");
            }
            System.out.println(" ");

        }
    }
}
