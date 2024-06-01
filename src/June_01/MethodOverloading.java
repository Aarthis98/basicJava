package June_01;

// method overloading
// same name with different parameters
//improves the readability of the  code


import java.util.Scanner;

public class MethodOverloading {
    Scanner sc = new Scanner(System.in);

    public  String input(String name){
        System.out.println("Enter the Name");
        String name1 = sc.next();
        String out = "Hello " + name1;
        System.out.println(out);
        return out;

    }
    public  void input(String name,String email){
        System.out.println("Enter the Name");
        String name1 = sc.next();
        System.out.println("Enter the Email");
        String e_mail = sc.next();
        System.out.println("Name " +name1);
        System.out.println("Email " +e_mail);

    }
    public  void input(String name,String email, int age){
        System.out.println("Enter the Name");
        String name1 = sc.next();
        System.out.println("Enter the Email");
        String e_mail = sc.next();
        System.out.println("Enter the Age");
        int age1 = sc.nextInt();

        System.out.println("Name " +name1);
        System.out.println("Email " +e_mail);
        System.out.println("Age " +age1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Method Overloading");
        System.out.println("********************");
        char choice;
        do{
        String name = "", email = "";
        int age = 0;

        System.out.println("Press 1 to give your name");
        System.out.println("Press 2 to give your name,email");
        System.out.println("Press 3 to give your name,email,age");
        int option = sc.nextInt();

        MethodOverloading overload = new MethodOverloading();
        
        switch(option) {
            case 1 :
            overload.input(name);
            break;
            case 2:
            overload.input(name, email);
            break;
            case 3:
            overload.input(name, email, age);
            break;

        }
            System.out.println("Do you wish to continue press Y or Press Q");
            choice = sc.next().charAt(0);
        } while((choice == 'Y') || (choice=='y'));


    }
}
