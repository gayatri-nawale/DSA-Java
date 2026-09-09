public class mininarry{

    public static void main(String[] args) {
        int arr[]={1,4,3,2,7,66,45};
        int min=min_element(arr);
        System.out.println("Minimum element is "+min);
    }
    static int min_element(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}