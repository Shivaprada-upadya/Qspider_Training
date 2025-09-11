import java.util.Scanner;
class  SecondLargestElementInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sLargest=0;
		
		int large=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
				large=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>sLargest && arr[i]!=large )
				sLargest=arr[i];
			
			
	
		}
		System.out.println("Second Largest Element:  "+sLargest);
	}
}
