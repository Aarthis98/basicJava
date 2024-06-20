package Assignment_Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] number = {10,30,43,54,23,543,43,32};
        System.out.println("Original array:");
        printArray(number);

        reverseArray(number);

        System.out.println("\nReversed array:");
        printArray(number);
    }


    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
