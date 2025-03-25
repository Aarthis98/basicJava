package June_18.Encapsulation;

public class LoginApp {

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public LoginApp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginApp{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void login(String username,String password){
        if(username.equals(this.username) && password.equals(this.password)){
            System.out.println("Logged in Successfully");
        }else{
            System.out.println("Invalid username or password");
        }
    }
}
