import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class maxinarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Array elements are: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        System.out.print("Maximum in array "+max(arr));
    }

    static int max(int []arr){

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }

}
