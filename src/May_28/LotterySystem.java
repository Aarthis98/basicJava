package May_28;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {

        int lucky_num = 22;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number from 1 to 100 to win a lottery");
        for(int i = 1; i<=3;i++) {

            int num = sc.nextInt();
            if(num<=100){
            if (num == lucky_num) {
                System.out.println("You Won the lottery");
                break;

            } else if (i == 1) {
                System.out.println("You have two more chance, Give a try");
            } else if (i == 2) {
                System.out.println("You have one more chance, Give a try");
            } else {
                System.out.println("Sorry Better luck Next time");
            }

        }else{
                System.out.println("Invalid number, Please give the number between 1 to 100");
                continue;
            }

        }




    }
}
