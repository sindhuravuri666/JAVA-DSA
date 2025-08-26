import java.util.Scanner;

public class ProdDivbySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod = 1;
        while (num!=0) {
            int d = num % 10;
            prod *= d;
            num =num/10;
        }

        if(prod % 7 == 0){
            System.out.println("MagicNum");
            }
        else{
             System.out.println("No");
        }
           
            
        }
    }
