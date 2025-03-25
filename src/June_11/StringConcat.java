package June_11;

public class StringConcat {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String s1 = "Hello";

        // if string is used automatically int changes to string '+' changes to concat
        System.out.println(a+b+s1);
        System.out.println(s1+b+s1);
        System.out.println(s1+a+b);
        System.out.println(b+a+s1+a+b);

    }
}
