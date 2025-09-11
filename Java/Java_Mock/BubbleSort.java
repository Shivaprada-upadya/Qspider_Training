import java.util.Scanner;
class BubbleSort 
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
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
	
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
