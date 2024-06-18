package June_15;

public class StringSession {
    public static void main(String[] args) {

        String str = new String("Hello world");
        StringBuffer str1 = new StringBuffer("Hello world");
        str.concat("!");
        System.out.println(str);
         str1.append("!");
        System.out.println(str1);

        String st = str.concat("!");
        System.out.println(st);

        str1.insert(0,"java");
        System.out.println(str1);

        String reverse = "Reverse a String";
        StringBuffer buffer = new StringBuffer(reverse);
        buffer.reverse();
        System.out.println(buffer);

    }
}
