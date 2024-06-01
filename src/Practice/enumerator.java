package Practice;

import java.sql.SQLOutput;

enum Swap {
    Temp,
    No_Temp;

    public static Swap valueOf() {
        return null;
    }
}

public class enumerator {
    public static void main(String[] args) {
       /* Swap s = Swap.Temp;
        System.out.println(s);
        Swap s1 = Swap.No_Temp;
        System.out.println("s1" +s1);

        */

        Swap s;
        s = Swap.valueOf();
        System.out.println(s);


    }
}
