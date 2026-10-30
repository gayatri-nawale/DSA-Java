public class findsecondlargest {
    public static void main(String[] args) {
        int a[]={4,34,11,45,3,143,44,93,49,48};
        int n=a.length;
        int max=a[0];
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(a[i]>largest){
                second_largest=largest;
                largest=a[i];
            }else if(a[i]>second_largest && a[i]!=largest){
                second_largest=a[i];
            }

        }
        System.out.println(second_largest);
    }
    
}
