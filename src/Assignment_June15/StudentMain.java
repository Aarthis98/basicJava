package Assignment_June15;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();

         */
    StudentGrade s1 = new StudentGrade("Alice", new int[]{85, 90, 92});
       // System.out.println(s1);
    StudentGrade s2 = new StudentGrade("Bob", new int[]{78, 82, 88});
    //    System.out.println(s2);
    StudentGrade s3 = new StudentGrade("Charlie", new int[]{95, 93, 97});
       // System.out.println(s3);


        StudentMethods.addStudent(s1);
        StudentMethods.addStudent(s2);
        StudentMethods.addStudent(s3);
        StudentMethods.printStudentDetails();

       System.out.println("Highest Grade : " +StudentMethods.getHighestGrade());
        System.out.println("Lowest Grade : " + StudentMethods.getLowestGrade());


    }
}
