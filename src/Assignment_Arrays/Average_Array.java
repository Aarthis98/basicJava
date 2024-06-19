package Assignment_Arrays;

public class Average_Array {
    public static void main(String[] args) {
        int[] number = {10, 30, 43, 54, 23, 543, 43, 32};
        int sum = 0;
        double average;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        average = (double) sum / number.length;
        System.out.println("Average of array elements : " + average);
    }

}
