//right shift an array by 3 positions
public class ShiftArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length; // Length of the array
        int positions = 3; // Number of positions to shift

        // Normalize positions in case it's greater than array length
        positions = positions % n;

        // Shift elements to the right by 'positions'
        for (int p = 0; p < positions; p++) {
            int lastElement = arr[n - 1]; // Store the last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // Shift elements to the right
            }
            arr[0] = lastElement; // Place the last element at the first position
        }

        System.out.println("Array after shifting by " + positions + " positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
