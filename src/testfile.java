public class testfile {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(seeColor("red"));

    }
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }


    }}