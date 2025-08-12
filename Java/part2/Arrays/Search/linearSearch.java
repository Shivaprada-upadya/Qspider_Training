
import java.util.Scanner;
public class linearSearch {
    public static int LinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }            
        }
        return -1;
        
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
        int position=LinearSearch(arr,key);
        if(position==-1)
        {
            System.out.println("Key element not found ");
        }
        else{
            
            System.out.println("Key element found at "+position);
        }
    }
}
