import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void  partition(int[] arr,int low,int high)
    {
        if(low<high)
        {
        int pi=quick(arr,low,high);
        partition(arr,low,pi-1);
        partition(arr,pi+1,high);
        }
    
    }
    public static int quick(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;  
              
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of any array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        partition(arr,0,arr.length-1);
        System.out.print("Array After Sorting: ");
        System.out.print(Arrays.toString(arr));
    }
}
