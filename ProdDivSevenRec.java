// magic number if product of digits of number divisible by seven else no
import java.util.Scanner;
public class ProdDivSevenRec {
    public int Method(int num){
        if(num==0){
            return 1;
        }
        int d = num % 10;
        return d * Method(num/10);
                        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ProdDivSevenRec obj = new ProdDivSevenRec();
        int prod = obj.Method(num);
        if(prod % 7 == 0){
            System.out.println("MagicNum");
            }
        else{
             System.out.println("No");
        }
           
            
        }
}
