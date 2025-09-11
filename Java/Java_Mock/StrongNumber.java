import java.util.Scanner;
class  StrongNumber
{
	
	/*static int CountOfDigit(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}
	*/
	
	static int Factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	static int calculate(int num)
	{
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+Factorial(ld);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		//int count=CountOfDigit(num);
		if(num==calculate(num))
		{
			System.out.println(num+" is Strong NUmber");
		}
		else
		{
			System.out.println(num+" not a Strong NUmber");
		}
		
		
	}
}
