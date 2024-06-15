package June_11;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "  Hello Java";
        String uppercase = s1.toUpperCase();
        System.out.println("Uppercase : " +uppercase);

        String lowercase = s1.toLowerCase();
        System.out.println("LowerCase : " +lowercase);

        char[] chars = s1.toCharArray();
        char c = s1.charAt(2);
        System.out.println("ChatAt : " +c);

        String concat = s1.concat(" Session Starts");
        System.out.println("Concat : " +concat);

        String length = String.valueOf(s1.length());
        System.out.println("Length : " +length);

        //removes white space
        String trim =s1.trim();
        System.out.println("Trim : " +trim);

    }
}
