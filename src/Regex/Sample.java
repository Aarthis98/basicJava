package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your valid email id ");
        String input = sc.nextLine();

        // input = "user.123@gmail.com";
        // input = "user_123@outlook.com";
        // input = "user.123@hotmail.in";
       // input = "user@yahoo.com";


        String email = "[a-z0-9_\\ -\\.]+@[a-z]+[\\.][com in]{2,3}";

        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

}
