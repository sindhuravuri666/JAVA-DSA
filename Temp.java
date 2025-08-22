
import java.util.Scanner;
public class Temp {
    public static  void main(String[] arfs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in f ");
        Double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("It is hot");
        }else if(temp<10){
            System.out.println("It is cold");
        }else{
            System.out.println("It is warm");

        }
    }
}