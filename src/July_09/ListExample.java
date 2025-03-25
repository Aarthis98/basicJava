package July_09;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

       // list.add(0,100001);
        list.set(0,100001);

        System.out.println("List value " +list);


        List<Integer> list2 = new ArrayList<>(list);
        list2.add(200);
        list2.add(400);
        System.out.println("List2 value " +list2);

        System.out.println("\n");
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
