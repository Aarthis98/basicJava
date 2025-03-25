package June_18.Encapsulation;

public class LoginMain {
    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp("abc","123");

        loginApp.login("abc","123");
        System.out.println(loginApp.getUsername());
        System.out.println(loginApp.getPassword());
       loginApp.setUsername("xyz");



       // loginApp.login("abc","12356");
/*
hacking
to overcome this,in loginApp changed the String variable to private
        loginApp.password ="xcv";
        loginApp.login("abc","xcv");

 */
    }
}
