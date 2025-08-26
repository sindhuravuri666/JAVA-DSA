public class LargestElementTwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int largest = matrix[0][0]; // Assume the first element is the largest

        // Traverse the 2D array to find the largest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("The largest element in the 2D array is: " + largest);
    }
    
}
