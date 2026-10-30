public class linearsearch {
    public static void main(String []args){
        int arr[]={2,3,4,5,6,7,1,8,9,12,34,45,44};
        int target=12;
        int ans=linearSearch(arr,target);
        if(ans==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+ans);
        }
    }
    public static int linearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
    
}

//TC- O(n)
//SC- O(1)
