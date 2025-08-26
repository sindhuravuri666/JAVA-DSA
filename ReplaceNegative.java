// replace negative numbers with zero in an array

public class ReplaceNegative {
    public static void main(String[] args) {
        int arr[] = {10, -5, 30, -2, 50};
        int n = arr.length; // Length of the array

        // Replace negative numbers with zero
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = 0; // Replace negative number with zero
            }
        }

        System.out.println("Array after replacing negative numbers with zero:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
