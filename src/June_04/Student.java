package June_04;

public class Student {


    int id;
    String name;

//constructor
    public Student(){
        System.out.println("Default Constructor....");
    }

    public Student(int id, String name) {
        this();// calls the default constructor if only this keyword used
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println("id : " + id);
        System.out.println("Session : " + name);
    }

}
