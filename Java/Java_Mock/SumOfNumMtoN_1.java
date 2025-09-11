import java.util.Scanner;
class SumOfNumMtoN_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int m=sc.nextInt();
		System.out.println("Enter the end number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum is : "+sum);
		
	}
}
