// Write a Program to check whether the number is Harshad Number or not.
// Harshad Number - A number is divisible by it's sum of digits.
package Java.Programming.Standard_Program;

import java.util.Scanner;

public class HarshadNumber {
    public static int SumOfDigit(int num)
    {
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        if((temp%SumOfDigit(num))==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}
