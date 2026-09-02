import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Original number : " + num);

        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reverse number : " + rev);

    }

}
