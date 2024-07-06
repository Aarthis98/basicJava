package July_02.ErrorCreation;

//StackOverflowError creation


public class Error {
    public static void main(String[] args) {

        String s ="Pragra";
        String uppercase = s.toUpperCase();
        System.out.println(uppercase);


        Error error = new Error();
        error.test();
    }

public void test(){
        show();

}

    private void show() {
        test();
    }

}