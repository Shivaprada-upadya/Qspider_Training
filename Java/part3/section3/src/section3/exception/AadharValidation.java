package section3.exception;

import java.util.Scanner;

public class AadharValidation {
	
	static int DigitCount(long num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter your Aadhar Number: ");
		long aadharNum=new Scanner(System.in).nextLong();
		if(DigitCount(aadharNum)==12)
		{
			System.out.println("Valid Aadhar Number...");
		}
		else
			try
		{
				throw new InvalidOTPException("Invalid Aadhar Length..");
		}
		
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		
		

	}

}
