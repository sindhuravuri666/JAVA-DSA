public class FindEven {
    public static void main(String[] args) {
        int arr[] = {10,21,30,41,50 };
        int arr2[] = new int[arr.length];
        // print even elements in the array
        System.out.println("Even elements in the array are:");
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // store even elements in new array and print new array
                arr2[i] = arr[i];
                System.out.println(arr2[i]);

                
               }

        }
    }
}
