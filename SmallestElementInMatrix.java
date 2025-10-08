public class SmallestElementInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {34, 21, 32, 41},
            {25, 14, 23, 11},
            {42, 51, 12, 31}
        };

        int smallest = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Smallest element in the matrix: " + smallest);
    } 
    
}
