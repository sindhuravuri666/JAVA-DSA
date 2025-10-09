import java.util.*;

public class KthLargestElement {
    //with sorting
    public static void printKthLargestElement(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // Using priority queue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(pq.peek());

    }
    
}

