public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,40,50,20 };
        System.out.println("Duplicate elements in the array are:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        
        }
    }
}
