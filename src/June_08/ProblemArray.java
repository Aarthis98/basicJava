package June_08;

public class ProblemArray {

    static void reverse(int x[], int n)
    {
        int[] y = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            y[j - 1] = x[i];
            j = j - 1;
        }

        System.out.println("Reversed numbers: ");
        for (int k = 0; k < n; k++) {
            System.out.println(y[k]);
        }
    }
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        reverse(arr, arr.length);

       // int x = arr.length;
       // System.out.println(x);
      //  int a = x - 1;
        //System.out.println(a);

    }
}
