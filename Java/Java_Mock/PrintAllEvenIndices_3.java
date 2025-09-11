import java.util.Scanner;
class  PrintAllEvenIndices_3
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
		
		System.out.println("Even array indices: ");
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
				System.out.print(arr[i]+" ");
		}
		
		
	}
}
