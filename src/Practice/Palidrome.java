package Practice;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {

        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word ");
        word=sc.nextLine();
        String reverse = " ";
        int length = word.length();
        for(int i = length - 1; i>=0; i--){
            reverse =reverse + word.charAt(i);
        }

        System.out.println("print word" +reverse);


    }
}
