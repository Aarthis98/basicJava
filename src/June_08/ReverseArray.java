package June_08;

public class ReverseArray {

        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println("Original array:");
            printArray(array);

            reverseArray(array);

            System.out.println("\nReversed array:");
            printArray(array);
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
