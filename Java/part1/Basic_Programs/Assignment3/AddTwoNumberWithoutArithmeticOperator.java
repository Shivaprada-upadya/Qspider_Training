// Write a Program to Add 2 Numbers Without using Arithmetic Operator

import java.util.Scanner;

class AddTwoNumberWithoutUsingArithmeticOperator
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 Value to perform Addition: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        while(num2!=0)
        {
            num1++;
            num2--;
        }
        System.out.println("Sum is : "+num1);
    }
}