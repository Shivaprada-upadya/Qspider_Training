package section3.exception;

import java.util.Scanner;

public class EmailValidation 
{

	public static void main(String[] args) //throws EmailException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email ID: ");
		String email=sc.next();
			if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com"))
			{
				if(email.length()>11)
					System.out.println("You entered Valid email ID");
				else
					try
				{
						throw new EmailLengthException("invaild email length..!!!");
				}
				catch(Exception e)
				{
					System.err.println(e.getMessage());
				}
			}
			else
			{
				try{
				throw new EmailException("Invalid email id");
				}
				catch(Exception e){
					System.err.println(e.getMessage());
				}
					
				
	
			
		
		
		//sc.close();
	}
}
}
