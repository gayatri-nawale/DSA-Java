import java.util.Scanner;

public class fibo {
    // FIBONACCI - RECURSIVE
    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FIBONACCI SERIES - NONRECUSRIVE
        // System.out.print("Enter n: ");
        // int n=sc.nextInt();
        // int n1=0;
        // int n2=1;
        // System.out.print(n1+" "+n2+" ");
        // for(int i=2;i<n;i++){
        // int n3=n1+n2;
        // System.out.print(n3+" ");
        // n1=n2;
        // n2=n3;
        // }


        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci = " + fibo(n));

    }
}