package Assignment_June15;

import java.util.Arrays;

public class StudentGrade {
    // grade value is given in marks

     String name;
     int[] marks;

    public StudentGrade(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

   /* public static int getAverageMarks(){
        if (marks.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }*/



    @Override
    public String toString() {
        return "Student Grade \n" +
                " Name : '" + name + '\'' +
                "\n Marks : " + Arrays.toString(marks) ;
    }
}






