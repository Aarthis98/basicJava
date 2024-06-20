package Assignment_Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        //String reverse = "Reverse a String";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence or word to be reversed");
        String reverse = sc.nextLine();
        StringBuffer buffer = new StringBuffer(reverse);
        buffer.reverse();
        System.out.println(buffer);
    }
}
