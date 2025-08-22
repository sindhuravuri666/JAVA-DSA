public class RecurssionFibonacci {
    public int Fib(int num){
        if(num == 0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        return Fib(num-1)+Fib(num-2);

        
    }   

    public static void main(String[] args) {
        RecurssionFibonacci rf = new RecurssionFibonacci();
        System.out.println(rf.Fib(5));
    }
}
