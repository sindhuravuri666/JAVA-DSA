import java.util.Scanner;
public class MultipleChecking {
    public class MultipleChecking{
        public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("The number");
        int a=sc.nextInt();
        System.out.print("The multiple");
        int b=sc.nextInt();
        if(a%b==0){
            System.out.println("b is multiple of a");
        }else{
            System.out.println("It is not a multiple");
        }
    }
}
    }
    