//max heap priority queue is
import java.util.*;
import java.util.PriorityQueue;
//max heap is created by using custom comparator it is used to get maximum element first
//collections is a utility class that provides static methods for operating on collections such as lists sets and maps
//differnce betweem a class and an interface is that a class can have both data members and methods while an interface can only have method signatures and static final variables
//here Collections is a class and Comparator is an interface
//comparator is an interface that defines a method for comparing two objects it has a method compare that takes two arguments and returns an integer value 

public class MaxHeapPQ {
    public static void main(String[] args) {
        // Creating a max-heap using a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Adding elements to the max-heap
        maxHeap.add(11);
        maxHeap.add(20);
        maxHeap.add(9);
        maxHeap.add(7);
        maxHeap.add(5);
        maxHeap.add(8);
        maxHeap.add(3);
        maxHeap.add(4);

        // Displaying the maximum element (root of the heap)
        System.out.println("Maximum element: " + maxHeap.peek());

        // Removing elements from the max-heap
        while (!maxHeap.isEmpty()) {
            System.out.println("Removing element: " + maxHeap.poll());
        }
    }
    
}
