package June_18.Encapsulation;

public class ExcelMain {
    public static void main(String[] args) {
        ExcelDemo excelDemo = new ExcelDemo(true,true);

        excelDemo.isRead();
        excelDemo.isWrite();
        System.out.println(excelDemo);



        ExcelTest excelTest = new ExcelTest("Aarthi");
        System.out.println(excelTest);
        excelTest.setName("Abc");
        System.out.println(excelTest);


    }
}
