package linearsearch;

public class searchinarry {

    public static void main(String[] args) {
        int arr[]={10,34,56,76,23,22,90,21};
        int target=26;
        int idx=linearsearch(arr, target);
        if(idx!=-1){
        System.out.println(target+" found at index "+idx);
        }else{
            System.out.println("Element not found");
        }



    }
    static int linearsearch(int arr[],int target){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                idx=i;
            }
        }
        return idx;
    }
    
}
