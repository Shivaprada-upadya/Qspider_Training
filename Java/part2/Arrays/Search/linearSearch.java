
import java.util.Scanner;
public class linearSearch {
    public static boolean LinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }            
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        if(LinearSearch(arr,key))
        {
            System.out.println("Key element found ");
        }
        else{
            System.out.println("Key element not found ");
        }
    }
}
