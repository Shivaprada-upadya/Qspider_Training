
import java.util.Scanner;
class BinaryToDecimal 
{
	public static int exponential(int base, int power)
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Code");
		int bin=sc.nextInt();
		int dec=0;
		int pow=0;
		while(bin>0)
		{
			int lastDigit=bin%10;
			dec=dec+(lastDigit*exponential(2,pow++));
			bin/=10;
		}
		System.out.println("The Decimall value is: "+dec);
	}
}
