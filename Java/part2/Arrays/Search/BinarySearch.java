
import java.util.*;
public class BinarySearch {
      public static int BinarySearching(int [] arr,int key)
    {      
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
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
        Arrays.sort(arr);       
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        int res=BinarySearching(arr,key);
        System.out.println(res==-1?"Key Not Found ": "Key Found at : "+(res+1)+" position");
    }
}
