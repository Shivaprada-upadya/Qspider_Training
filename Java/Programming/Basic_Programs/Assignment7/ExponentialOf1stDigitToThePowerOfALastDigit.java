// Write a Program to Print the Exponential Of 1st digit to the Power Of Last Digit.

import java.util.Scanner;
public class ExponentialOf1stDigitToThePowerOfALastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();

        int originalNum=num;   //Stroring num value to the another variable.

        // to get the 1st digit
        while(num>9)
        {
            num/=10;
        }       
        int firstDigit=num; 
        System.out.println("The 1st Digit of "+originalNum+" is: "+firstDigit); 

        int lastDigit=originalNum%10;  //to get the last Digit
        System.out.println("The last Digit of "+originalNum+" is: "+lastDigit);

        int finalValue=1;
        // to get the final output 
        for(int i=1;i<=lastDigit;i++)
        {
            finalValue*=firstDigit;
        }
        System.out.println("The Exponential of "+firstDigit+" to the Power of "+lastDigit+" is: "+finalValue);
    }
}
