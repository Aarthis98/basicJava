package Assignments.Student_Management;

import static java.lang.Character.getName;

public class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(int Studentcapacity) {
        students = new Student[Studentcapacity];
        studentCount = 0;
    }
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student " + student.getName() + " added sucessfully");
            //System.out.println("Student added successfully.");
        } else {
            System.out.println("Invalid..");
        }
    }



    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
    }
    public Student findStudentByRollNumber(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                return students[i];
            }
        }
        return null; // Student not found
    }
    public void displayTopStudent() {
       // System.out.println("Top Student Details:");
        Student topStudent = students[0];
        double highestAverageGrade = topStudent.calculateAvgGrade();

        for (int i = 1; i < studentCount; i++) {
            double averageGrade = students[i].calculateAvgGrade();
            if (averageGrade > highestAverageGrade) {
                highestAverageGrade = averageGrade;
                topStudent = students[i];
            }

        }
        System.out.println("\nTop Student Details:");

        topStudent.displayInfo();
    }
}
