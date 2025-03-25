package June_08;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

       String[] names = new String[3];
        Scanner sc = new Scanner(System.in);
      //System.out.println("Enter the elements of Array : ");
       //String[] names= new String[]{sc.nextLine()};

        for (int i = 0; i < names.length ; i++){
            System.out.println("Enter the name ");
            names[i] = sc.next();
        }

        for(int i =0 ; i< names.length; i++){
            System.out.println("Name : " + names[i]);
        }

        //for each instead of above for
        for(String x : names){
            System.out.println(x);
        }
    }
}
