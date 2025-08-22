//Sum of even digits using Recurssion
public class SumofEvenDigits {
    public static int sumEvenDigits(int num) {

        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        if (digit % 2 == 0) {
            return digit + sumEvenDigits(num / 10);
        } else {
            return sumEvenDigits(num / 10);
        }
    }
    public static void main(String[] args) {
        SumofEvenDigits s = new SumofEvenDigits();
        System.out.println(s.sumEvenDigits(1246));
    }
}
