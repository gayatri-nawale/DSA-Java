
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findmaxinrange {

    public static void main(String[] args) {

        int arr[] = { 10, 45, 43, 32, 11, 44, 87, 65 };
        int start = 3;
        int end = 5;
        System.out.print("Maximum in array is "
                + maxinrangeofarray(arr, start, end)
                + " of range "
                + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
                
        System.out.println();
    }

    static int maxinrangeofarray(int[] arr, int st, int ed) {

        int max = arr[st];
        for (int i = st; i <= ed; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }

}
