public class SumofDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Sum of primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }
    
}
