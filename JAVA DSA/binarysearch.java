
import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 1, 8, 9, 12, 34, 45, 44 };
        int target = 44;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // int ans = binarySearch(arr, target);
        int ans = binarySearchrecurr(arr, target, 0, arr.length - 1);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index (After sorting): " + ans);
        }

    }

    public static int binarySearch(int[] arr, int target) {

        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = st + ((ed - st) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchrecurr(int[] arr, int target, int st, int ed) {
        if (st > ed)
            return -1;

        int mid = st + ((ed - st) / 2);

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchrecurr(arr, target, st, mid - 1);
        } else {
            return binarySearchrecurr(arr, target, mid + 1, ed);
        }

    }

}

// tc- O(logn)
//sc - O(1)