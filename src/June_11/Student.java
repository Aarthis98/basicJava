package June_11;

public class Student {
    public static void main(String[] args) {
        Student student = new Student(101, "Aarthi");
        System.out.println(student.toString());
    }

    int id;
    String name;
    public Student(int id, String name){
        this.id =id;
        this.name =name;
    }
    public  void printStudent(){
        System.out.println(id);
        System.out.println(name);
    }


    public  String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
