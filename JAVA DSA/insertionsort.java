public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 16, 5, 7 };
        int n = arr.length;

        System.out.print("Before Sorting: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // insertion sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("After Sorting: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
// worst-case time complexity is \(O(n^2)\), and its auxiliary space complexity
// is \(O(1)\).
