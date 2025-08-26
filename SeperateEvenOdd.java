// Write a Java program to separate even and odd numbers in separate arrays.

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 8, 10, 7, 6};
        int evenCount = 0;  
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int even[] = new int[evenCount];
        int odd[] = new int[oddCount];
        int eIndex = 0, oIndex = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even[eIndex++] = num;
            } else {
                odd[oIndex++] = num;
            }
        }
        System.out.println("Even numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }
    }
}
