
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd =1;
        int a = 2;
        int b = 8;
        for(int i =1;i <=a && i <=b;i++){
            if(a%i ==0 && b %i == 0){
                gcd = i;
            }
            
        }
            int lcm = a*b/gcd;
            System.out.println("LCM: " + lcm);
            System.out.println("HCF: " + gcd);
        }  
                     

       
    }

