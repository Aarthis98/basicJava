package June_01.Constructor;

public class Date {
    int day ;
    int month ;
    int year;

    Date(){
       day = 01;
       month = 06;
       year = 2024;
        System.out.println("Default Constructor");
        System.out.println(day + "/" + month + "/" +year);
    }
    Date(int day, int month, int year){
        System.out.println("Parameterized Constructor");
        System.out.println(day + "/" + month + "/" +year);
    }

}
