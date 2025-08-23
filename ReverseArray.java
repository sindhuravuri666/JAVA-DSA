public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50 };
        System.out.println("Original array: ");
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];//swapping
            arr[start] = arr[end];//arr[end] value is assigned to arr[start]
            arr[end] = temp;//temp value is assigned to arr[end]
            System.out.println(arr[start] + " " + arr[end]);
            start++;
            end--;
        }
    }
}
