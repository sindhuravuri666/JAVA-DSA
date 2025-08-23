public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50 };
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            
            if (arr[i] > largest) {
                secondLargest = largest; // update second largest before updating largest
                largest = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }
}

