import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int elementToFind = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                System.out.println("Element " + elementToFind + " is found in the array.");
                break;
            }
        }
        
    }
}
