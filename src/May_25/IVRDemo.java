package May_25;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {
        System.out.println("^^^^^^^^^^ WELCOME TO ROGGERS ^^^^^^^^^^");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Press any one of the Options");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int options = sc.nextInt();
        switch (options){
            case 1:
                System.out.println("You have selected an English");
                System.out.println("Please enter 1 for Telecom, 2 for Online");
                int input =sc.nextInt();
                if(input == 1){
                    System.out.println("You have selected the Telecom");
                    System.out.println("Do you wish to continue with Technical support, please press 9");
                    System.out.println("Or press 5 to exit");
                    int choice =sc.nextInt();
                    if(choice == 9){
                        System.out.println("Please be in call, our customer support person will talk to you soon");
                    }else if(choice == 5){
                        System.out.println("Thank You for calling..");
                    }else{
                        System.out.println("Sorry, Invalid Response");
                    }

                } else if (input == 2) {
                    System.out.println("You have selected the Online process, Online process have limited access");
                    System.out.println("Do you wish to continue please press 0 else press 5 to exit ");
                    int select = sc.nextInt();
                    if(select == 0){
                        System.out.println("You last statement is on Date");
                    }else if(select == 5){
                        System.out.println("Thank You for calling..");
                    }else{
                        System.out.println("Sorry, Invalid Response");
                    }

                }else{
                    System.out.println("Sorry, Invalid Response");
                }

                break;
            case 2:
                System.out.println("You have selected an French");
                System.out.println("Please enter 1 for Telecom, 2 for Online");
                System.out.println("Sorry , We dont have person available at this time ");
                break;
            default:

                System.out.println("Sorry, Invalid Response");

        }
    }
}
