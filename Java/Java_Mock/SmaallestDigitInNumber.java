import java.util.Scanner;
class  SmaallestDigitInNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		int num=sc.nextInt();
		int smallest=9;
		
		while(num>0)
		{
			int ld=num%10;
			if(ld<smallest)
				smallest=ld;
			num=num/10;
		}
		System.out.println("Smallest digit is: "+smallest);
	}
}
