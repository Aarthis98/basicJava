package July_02.Recovery_Error;

public class ArrayTryCatch {

   static int a = 5;
   static int[] array = new int[a];

    public static void main(String[] args) {


        try {
             array = new int[]{5, 10, 15, 20, 25};
             print();

        }catch(ArrayIndexOutOfBoundsException e){
           // e.getMessage();
            System.out.println("Printing the error");
            e.printStackTrace();

        }
       // System.out.println("Testing..");

    }
    public static void print(){

        for(int i = 0; i<= array.length; i++){
            System.out.println(array[i]);
        }
    }

}
