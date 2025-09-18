package section3.exception;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int otp= (int) (Math.random()* 9999);
		System.out.println("your otp is: "+otp);
		int userOtp=new Scanner(System.in).nextInt();
		if(userOtp==otp)
		{
			System.out.println("otp valid successfully...");
		}
		else
			try {
				throw new InvalidOTPException("Invalid otp..");
			}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

}
