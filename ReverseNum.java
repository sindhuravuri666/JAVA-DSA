public class ReverseNum {
    public int RevNum(int num){
        if(num==0){
            return 0;
        }
        int digit = num%10;
        int rev = RevNum(num/10);
        
        
    }
    public static void main(String[] args) {
        ReverseNum rn = new ReverseNum();
        System.out.println(rn.RevNum(1234));
    }
}
