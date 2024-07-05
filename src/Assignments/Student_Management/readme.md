Java OOP Assignment: Enhanced Student Management System
Objective:
Create a Java application to manage student information with additional functionalities using Object-Oriented Programming principles.
Instructions:
1.	Create a Class:  Student
      o	Attributes:
      	String name
      	int rollNumber
      	int age
      	String course
      	double[] grades (array to store grades of the student)
      o	Methods:
      	Constructor to initialize all attributes.
      	Getters and setters for all attributes.
      	double calculateAverageGrade(): Calculate and return the average grade of the student.
      	void displayInfo(): Print the student details along with the average grade.
2.	Create a Class:  StudentManager
      o	Attributes:
      	Student[] students
      	int studentCount
      o	Methods:
      	Constructor to initialize the student array.
      	void addStudent(Student student): Add a student to the list.
      	void displayAllStudents(): Display information for all students.
      	Student findStudentByRollNumber(int rollNumber): Find and return a student by their roll number.
      	void removeStudentByRollNumber(int rollNumber): Remove a student from the list by their roll number. (Optional)
      	void displayTopStudent(): Display the student with the highest average grade.
3.	Create a Main Class to Test Your Application
      o	In the main method:
      	Create instances of Student.
      	Add them to the StudentManager.
      	Display all students.
      	Search for a specific student by roll number.
      	Remove a student by roll number.
      	Display the top student with the highest average grade.

