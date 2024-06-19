package Assignment_Arrays;

public class Add_Matrix {
    public static void main(String[] args) {
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int add = array1[1][1] + array2[2][0];

        System.out.println(array1[1][1]);
        System.out.println(array2[2][0]);
        System.out.println("Addition Matrix");
        System.out.println(add);
    }
}
