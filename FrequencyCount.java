public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 20, 10, 40};
        int n = arr.length;
        int freq[] = new int[n];
        int visited = -1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // Mark as visited
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < n; i++) {
            if (freq[i] != visited) {
                System.out.println("   " + arr[i] + "   |    " + freq[i]);
            }
        }
    }
}
