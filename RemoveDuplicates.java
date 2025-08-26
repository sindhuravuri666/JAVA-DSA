public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 40, 50, 50};
        int n = arr.length; // Length of the array

        // Remove duplicates from a sorted array
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i]; // Store unique element
            }
        }
        temp[j++] = arr[n - 1]; // Store the last element

        // Copy the unique elements back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
