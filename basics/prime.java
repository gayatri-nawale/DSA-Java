import java.util.Scanner;

public class prime {
    static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean isprime = isprime(num);

        System.out.println(isprime ? "Number " + num + " is prime" : "Number " + num + " is not prime");

    }
}