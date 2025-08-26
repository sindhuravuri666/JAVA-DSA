public class SumofPrime {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
           if(i % 2 != 0 || i == 2) { // Check for prime numbers
               boolean isPrime = true;
               for (int j = 2; j <= Math.sqrt(i); j++) {
                   if (i % j == 0) {
                       isPrime = false;
                       break;
                   }
               }
               if (isPrime) {
                   sum += i;
               }
           }
            
        }
        System.out.println("Sum of prime numbers up to " + n + " is: " + sum);
    }
}
