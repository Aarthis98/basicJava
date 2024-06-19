package Assignment_Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        int add = 0;
        for (int i = 0; i < number.length; i++) {
            add = add + number[i];
        }
        System.out.println("Summ of an Arrays : " + add);
    }
}
