
import java.util.Scanner;
public class PrimeElementsInArray {
     public static boolean isPrime(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
    

}
