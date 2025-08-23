public class ShiftZeros {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        System.out.println("Array after shifting zeros to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
