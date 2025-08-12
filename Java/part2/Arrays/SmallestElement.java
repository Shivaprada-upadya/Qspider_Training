import java.util.Scanner;

public class SmallestElement {
     public static int LinearSearch(int[] arr)
    {
        int smallest=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[smallest])
                smallest=i;                  
        }
        return arr[smallest];

        /* 
            int smallest=arr[0]; 10
            for(int i=1;i<arr.length;i++) 
            {
            if(arr[i]<smallest) 
                smallest=arr[i];         
        }
        return smallest; 
        */
        
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
        System.out.println("Smallest element is: "+smallest);
        
    }
}
