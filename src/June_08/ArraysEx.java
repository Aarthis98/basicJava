package June_08;

import java.util.Scanner;

public class ArraysEx {
    public static void main(String[] args) {
        int[] rollnumber = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Element :");
        for (int i =0;i<rollnumber.length;i++){
            rollnumber[i] = sc.nextInt();
        }
        for (int i =0;i<rollnumber.length;i++){
            System.out.println("Roll Number : " +rollnumber[i]);
        }

    }
}
