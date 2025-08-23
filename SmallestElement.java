public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50 };
        for(int i = 0; i < arr.length; i++) {
        int min = arr[0];
            if (arr[i] < min) {
                min = arr[i];   
                }
            System.out.println("Smallest element in array: " + min);
            break;
            }
        }
    
}
