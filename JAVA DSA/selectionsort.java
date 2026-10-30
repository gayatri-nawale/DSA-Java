
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={3,2,1,16,5,7,11,31,22};
        int n=arr.length;
        int temp=0;
        int minidx=-1;

        System.out.print("Before Sorting: ");
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();

        //selection sort
        for(int i=0;i<n-1;i++){
            minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[minidx]>arr[j]){
                    minidx=j;
                }
                
            }
            temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }



        System.out.print("After Sorting: ");
        for(int item:arr){
            System.out.print(item+" ");
        }
    
    
    }
    
}

// tc- O(n2)
// sc - O(1)