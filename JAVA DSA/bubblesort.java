
public class bubblesort {

    public static void main(String[] args) {
        int arr[]={3,2,1,16,5,7,11,31,22};
        int n=arr.length;
        int temp=0;

        System.out.print("Before Sorting: ");
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();

        //bubble sort
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }



        System.out.print("After Sorting: ");
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
    
}

// tc - O(n2)
// sc - O(1) //Bubble Sort sorts the array in place. It uses only a temporary variable and loop variables, rather than creating another array that grows with the input size.