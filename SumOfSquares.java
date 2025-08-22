// SumOfSquares.java using recurssion 
//if input = 5
//optput = 5*5 + 4*4 + 3*3 + 2*2 + 1*1 = 55
public class SumOfSquares {
    public int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
        
    }

    public static void main(String[] args) {
        SumOfSquares obj = new SumOfSquares();
        int number = 5; // Example input 
        int result = obj.sumOfSquares(number);
        System.out.println("Sum of squares of digits: " + result);
    }
}
