package June_11;

public class StringEquality {
    public static void main(String[] args) {

        String s1 = "key";
        String s2 = "key";
        s1.equals(s2); // checking for equa value
        System.out.println(s1.equals(s2));
        System.out.println("\n");

        System.out.println("String Equals Checking");
        String s3 = new String("key");
        System.out.println(s1.equals(s3)); //true , checks only the content/value
        System.out.println(s1 == s3); //false , checks the reference / address
    }
}
