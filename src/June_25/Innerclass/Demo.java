package June_25.Innerclass;

public class Demo {
    //Demo we can take as outerclass or firstclass

    static class InnerClass{
        public void show(){
            System.out.println("Inner class Method..");
        }
    }
}


class Main{
    public static void main(String[] args) {
      /* this is used if innerclass is not static
       Demo demo = new Demo();
        Demo.InnerClass obj = demo.new InnerClass();
        obj.show();
       */

        //this is used if the inner class is static
      Demo.InnerClass obj = new Demo.InnerClass();
      obj.show();
    }
}
