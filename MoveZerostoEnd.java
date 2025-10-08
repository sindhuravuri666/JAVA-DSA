public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; 
            }
        }
        while (count < n) {
            arr[count++] = 0; 
        }
            for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
// time complexity is O(n) and space complexity is O(1)