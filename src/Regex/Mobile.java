package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile {
    public static void main(String[] args) {
        String input = "+1 4371231235";

        //String phone = "[\\+]+[1]+[4]+[0-9]{9}";
       // String phone = "[\\+1]{2}+[4]+[0-9]{9}";
       // String phone = "[\\+14]{3}+[0-9]{9}";

        String phone = "[\\+1]{2}+[\\s]+[4]+[0-9]{9}";

        Pattern pattern = Pattern.compile(phone);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid... ");
        } else {
            System.out.println("Invalid..");
        }


    }
}
