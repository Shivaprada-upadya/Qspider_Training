import java.util.Scanner;
class PrintAllElementCharacterInArray_4 
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
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
}
