public class RemoveExtremes {
    public static void main(String[] args) {
        int n = 1989;
        int count = 0;
        while(n!=0){
            int d = n%10;
            System.out.println(d);
            count += d;
            n = n/10;

        }
        System.out.println(count);

    }
}
