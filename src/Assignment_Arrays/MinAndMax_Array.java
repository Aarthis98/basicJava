package Assignment_Arrays;

public class MinAndMax_Array {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        int max = number[0];
        int min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Maximum number : " + max);
        System.out.println("Minimum number : " + min);

    }
}
