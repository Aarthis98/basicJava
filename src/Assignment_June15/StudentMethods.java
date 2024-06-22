package Assignment_June15;

public class StudentMethods {

    private static StudentGrade[] students = new StudentGrade[100];
    private static int studentCount = 0;

    public static void addStudent(StudentGrade student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public static int getHighestGrade() {
        int highestGrade = Integer.MIN_VALUE;
        for (int i = 0; i < studentCount; i++) {
            for (int grade : students[i].marks) {
                if (grade > highestGrade) {
                    highestGrade = grade;
                }
            }
        }
        return highestGrade;
    }

    public static int getLowestGrade() {
        int lowestGrade = Integer.MAX_VALUE;
        for (int i = 0; i < studentCount; i++) {
            for (int grade : students[i].marks) {
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            }
        }
        return lowestGrade;
    }
    public static void printStudentDetails() {
        //studentCount=0;
        System.out.println("MarkSheet of the Students ");
        for (int i = 0; i < studentCount; i++) {

           // studentCount++;
           // System.out.println(studentCount);
            System.out.println(students[i]);

          //  System.out.println("Average Grade : " + StudentGrade.getAverageMarks());
        }
    }
}
