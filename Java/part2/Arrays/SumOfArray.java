
import java.util.Scanner;
public class SumOfArray{
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];   
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+(i+1)+" th Elements");
            arr[i]=sc.nextInt();
            
        }
         int sum=0;
         for(int i=0;i<arr.length;i++)
         {
             sum+=arr[i];
         }
         System.out.println("Sum of the Elements is : "+sum);
    }

}