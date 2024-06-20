package Assignment_Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word to check it is palindrome or not");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }

    }
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            // Ignore non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false; // Characters do not match, hence not a palindrome
            }

            // Move to the next characters
            start++;
            end--;
        }
        return  true;
    }
}
