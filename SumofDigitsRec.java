//Sum of digits using Recurssion

public class SumofDigitsRec {
    public int DigSum(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+DigSum(num/10);
        
    }
    public static void main(String[] args) {
        SumofDigitsRec sd = new SumofDigitsRec();
        System.out.println(sd.DigSum(1234));
    }
    
}
