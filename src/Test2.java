//Swapping two variables


import java.util.Objects;
import java.util.Scanner;


enum e{
    Temp,
    No_Temp
}
public class Test2 {
    public static void main(String[] args){

        int a = 20, b = 10;
        System.out.println("Before Swap :" +"a = " + a + "  b = " + b);
        //e f=e.Temp;
        //Scanner scanner =new Scanner(System.in);
        //System.out.println("Enter the value  ");
        //String ab = scanner.nextLine();

        /*switch (ab){
            case e.Temp : int c;

                c = a;
                a = b;
                b = c;
                System.out.println("After Swap : if");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                break;

            case e.No_Temp:
                a = a + b;//10+20
                b = a - b;//30-10
                a = a - b;//30-20

                System.out.println("After Swap : else");
                System.out.println("a = " + a);
                System.out.println("b = " + b);

        }*/

       // System.out.println(f);
        String x= "Temp";
        String y= "Without Temp value";
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value  ");
        String ab = scanner.nextLine();

        if(Objects.equals(ab, x)) {
            //Temp values

            int c;

            c = a;
            a = b;
            b = c;
            System.out.println("After Swap : if");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        else
        {
            // without temp values

            a = a + b;//10+20
            b = a - b;//30-10
            a = a - b;//30-20

            System.out.println("After Swap : else");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        scanner.close();
    }
}
