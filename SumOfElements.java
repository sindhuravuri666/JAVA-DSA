public interface SumOfElements {
    public static void main(String[] args) {
        int arrr[] = {10,20,30,40,50 };
        int sum = 0;
        for(int i = 0; i < arrr.length; i++) {
            sum = sum + arrr[i];
        }
        System.out.println("Sum of elements in array: " + sum);
    }
}
