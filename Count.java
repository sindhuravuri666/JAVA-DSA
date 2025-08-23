public class Count {
    public static void main(String[] args) {
        int arr[] = {10,21,30,41,50 };
        int evenCount = 0;
        int oddCount = 0;   
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
