import java.util.Scanner;

public class LargestElement {
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
        int largest=Largest(arr);        
        System.out.println("Largest element is: "+largest);
        
    }
}
