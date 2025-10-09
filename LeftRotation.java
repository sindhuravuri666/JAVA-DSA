// LeftRotation from kth position
public class LeftRotation {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        // this reverses the first k elements if k = 2 and arr = {1,2,3,4,5} then arr becomes {2,1,3,4,5}
        reverse(arr, 0, k - 1);
        // this reverses the elements from k to end if arr = {2,1,3,4,5} then arr becomes {2,1,5,4,3}
        
        reverse(arr, k, n - 1);
        // this reverses the whole array if arr = {2,1,5,4,3} then arr becomes {3,4,5,1,2}
      
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; 
        leftRotate(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}






// collections in java  means data structures which are used to store group of objects as a single unit.
// examples of collections are ArrayList, LinkedList, HashSet, HashMap etc.
// collections in java  means data structures which are used to store group of objects as a single unit.
// interfaces in java are abstract types that allow the creation of methods that one or more classes will implement.
// examples of interfaces are List, Set, Map etc.
// set is a collection that contains no duplicate elements and at most one null element.set implements hashset, linkedhashset, treeset etc.
// list is an ordered collection (also known as a sequence).list implements arraylist, linkedlist, vector etc.
// map is an object that maps keys to values.map implements hashmap, linkedhashmap, treemap etc.
// arraylist is a resizable array implementation of the list interface.arraylist allows duplicate elements and maintains insertion order.