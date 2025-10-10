import java.util.PriorityQueue;
public class MinHeapPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min-heap
        minHeap.add(11);
        minHeap.add(20);
        minHeap.add(9);
        minHeap.add(7);
        minHeap.add(5);
        minHeap.add(8);
        minHeap.add(3);
        minHeap.add(4);


        // Displaying the minimum element (root of the heap)
        System.out.println("Minimum element: " + minHeap.peek());

        // Removing elements from the min-heap
        while (!minHeap.isEmpty()) {
            System.out.println("Removing element: " + minHeap.poll());
        }
    } 
}
//priority queue is implemented using heap data structure from this we cam get data in sorted order it can be ascending or descending order