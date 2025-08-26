public class RotateElements {
    public static void main(String[] args) {
        //if array is {10,20,30,40,50} after rotation it should be {50,10,20,30,40}
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length; // Length of the array
        int lastElement = arr[n - 1]; // Store the last element of the array

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement; // Place the last element at the first position
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
