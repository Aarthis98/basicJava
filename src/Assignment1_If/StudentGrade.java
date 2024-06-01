package Assignment1_If;

/*
 Write a program that takes a student's score as input and prints out their corresponding
grade based on the following criteria:

Grade  Score
A:    90-100
B:    80-89
C:    70-79
D:    60-69
F:    Below 60
 */



import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = sc.nextInt();

        if((marks>=90) || (marks == 100)){
            System.out.println("Grade : A ");
        }else if((marks>=80) || (marks > 90)){
            System.out.println("Grade : B ");
        }else if((marks>=70) || (marks > 80)){
            System.out.println("Grade : C ");
        }else if((marks>=60) || (marks > 70)){
            System.out.println("Grade : D ");
        }else{
            System.out.println("Below 60");
        }
    }
}
