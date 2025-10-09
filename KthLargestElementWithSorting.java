import java.util.Arrays;
public class KthLargestElementWithSorting {
    //with sorting
    public static void printKthLargestElement(int[] arr, int k) {
        Arrays.sort(arr);
        //now the array is sorted in ascending order arr = [1,2,3,4,5,6]
        System.out.println(arr[arr.length - k]);
        //k=2, arr.length=6, arr[6-2]=arr[4]=5

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        printKthLargestElement(arr, k);
    }
    
}
