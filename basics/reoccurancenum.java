import java.util.Scanner;

public class reoccurancenum {
    public static void main(String[] args) {
        // find number of times target appear in number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        long num=sc.nextLong();

        System.out.print("Enter target: ");
        int tar=sc.nextInt();

        int cnt=0;
        while(num>0){
            if(num%10==tar) cnt++;
            num/=10;
        }
        System.out.print(tar + " appeared "+cnt+" times");
        
    }
    
}
