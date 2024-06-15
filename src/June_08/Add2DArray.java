package June_08;

public class Add2DArray {
    public static void main(String[] args) {
        System.out.println("Addition of 2D Array");
        int [][] arr = new int[3][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        int add = arr[1][1] + arr[2][0];

        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println("Addition");
        System.out.println(add);
    }
}
