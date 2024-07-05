package Assignments.Student_Management;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aarthi", 101, 26, "Computer Science", new double[]{95, 90, 85});
        Student student2 = new Student("Gowtham", 102, 29, "Computer Science", new double[]{100, 95, 95});
        Student student3 = new Student("Madhu", 103, 28, "Computer Science", new double[]{95, 90, 95});

        StudentManager manager = new StudentManager(10);
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.displayAllStudents();
        int rollNumberToFind = 105;
        Student foundStudent = manager.findStudentByRollNumber(rollNumberToFind);
        if (foundStudent != null) {
            System.out.println("Found Student by Roll Number " + rollNumberToFind + ":");
            foundStudent.displayInfo();
        } else {
            System.out.println("Student with Roll Number " + rollNumberToFind + " not found.");
        }

        manager.displayTopStudent();
    }
}
