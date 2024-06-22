## Problem Statement: Student Grade Management System

Objective:
Write a Java program that manages student grades for a course. The program should allow the 
creation of student objects, calculate their average grades, and 
determine the highest and lowest grades in the class.

Requirements:

Student Class:

Attributes:
name (String)
grades (int array)
Methods:
Constructor to initialize the student's name and an array of grades.
getAverageGrade: Calculate and return the average grade of the student.
toString: Return a string representation of the student including their name and average grade.
Course Class:

Attributes:
students (static array of Student objects)
studentCount (static int to keep track of the number of students)
Methods:
addStudent: Static method to add a new student to the course.
getHighestGrade: Static method to find and return the highest grade among all students.
getLowestGrade: Static method to find and return the lowest grade among all students.
printStudentDetails: Static method to print details of all students.
Input:

Names and grades of students.
Output:

Average grade of each student.
Highest and lowest grades in the class.
Details of all students.
Example:

Input:

java
Copy code
Student s1 = new Student("Alice", new int[]{85, 90, 92});
Student s2 = new Student("Bob", new int[]{78, 82, 88});
Student s3 = new Student("Charlie", new int[]{95, 93, 97});

Course.addStudent(s1);
Course.addStudent(s2);
Course.addStudent(s3);
Output:

plaintext
Copy code
Alice: Average Grade = 89.0
Bob: Average Grade = 82.67
Charlie: Average Grade = 95.0
Highest Grade: 97
Lowest Grade: 78

Students in the course:
Alice: Average Grade = 89.0
Bob: Average Grade = 82.67
Charlie: Average Grade = 95.0
Constraints:

Assume a maximum of 100 students in the course.
Grades are integers between 0 and 100.