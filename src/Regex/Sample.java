package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your valid email id ");
        String input = sc.nextLine();

       // String input = "user@example.com";
      //  String regex = "^[\\w.%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}";
        String email = "[a-zA-Z0-9_\\ -\\.]+@[a-z]+[\\.][com]{3}";

        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

}
