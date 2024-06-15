package June_11;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // reverse the string using charAt

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the String value to be Reversed");
        String name = sc.nextLine();
        int len = name.length();
        System.out.println("Length of the String" + len);
        char[] reverse = new char[len];

        for(int i = 0; i< len; i++){
            reverse[i] = name.charAt(len-1-i);
        }
        System.out.println("Reversed String : ");
        System.out.println(reverse);
    }
}
