public class armstrong {

    static boolean isArmstrong(int n) {

        int original = n;
        int digits = 0;
        int temp = n;
        int sum = 0;


        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));  // true
        System.out.println(isArmstrong(9474)); // true
        System.out.println(isArmstrong(123));  // false
    }
}