import java.util.Scanner;

public class SwapLargestSmallest {
    public static int Largest(int[] arr)
    {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest=arr[i];                  
        }
        return largest;
    }

    public static int LinearSearch(int[] arr)
    {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest=arr[i];                  
        }
        return largest;
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
        int smallest=LinearSearch(arr); 
        int largest=LinearSearch(arr); 
    }
}
