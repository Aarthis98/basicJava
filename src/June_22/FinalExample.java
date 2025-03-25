package June_22;

public class FinalExample {

    final int memorysize = 3080;


     public void calculate(){

        // memorysize = 500; cant change it because it is declared as final

         System.out.println(memorysize);
     }

        public final void test(){
         // cant override this method
            // above calculate is overriden in below main class but this have final keyword so cant
            System.out.println("testing");
        }

}
class main extends FinalExample{
    @Override
    public void calculate() {
        super.calculate();
    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample();

        finalExample.calculate();
        //finalExample.test();
    }

}