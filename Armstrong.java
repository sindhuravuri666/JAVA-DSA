public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int digits = 0;
        int temp = n;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        // Calculate sum of digits raised to the power of number of digits
        while (temp != 0)R {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
