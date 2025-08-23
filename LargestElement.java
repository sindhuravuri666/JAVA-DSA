public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50 };
        for(int i = 0; i < arr.length; i++) {
        int max = arr[0];
            if (arr[i] > max) {
                max = arr[i];   
                }
            System.out.println("Largest element in array: " + max);
            break;
            }
        }
    }
    
}
