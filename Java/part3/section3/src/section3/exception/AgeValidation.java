package section3.exception;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) throws AgeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=sc.nextInt();
		if(age>=18 && age<=35)
		{
			System.out.println("You are eligible to marrige....");
		}
		else
		{
			throw new AgeException("You are not eligible to marry...");
		}
	}

}
