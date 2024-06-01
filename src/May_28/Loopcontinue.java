package May_28;

import java.util.Scanner;

public class Loopcontinue {
    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            if((i>20)&&(i%2==0)){
                continue;
            }
            System.out.println(i);
        }
    }
}
