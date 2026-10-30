public class quicksort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;

        return i + 1;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 43, 53, 3, 1, 2 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);

        System.out.println("After sorting array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
