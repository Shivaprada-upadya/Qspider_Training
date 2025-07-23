// Write a Program to check whether the number is Twisted Prime Number Or Not.
// Twisted Number - A Number and It's Reverse Number is a Prime Number

package Java.Programming.Standard_Program;

import java.util.Scanner;

public class TwistedNumber 
{
    public static int CountOfFactor(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        return count;
    }

    

    public static int Reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }


    public static void display(int num)
    {
        int rev=Reverse(num);       
        System.out.println("Reverse of "+num+" is: "+rev);
        if(CountOfFactor(num)==2 && CountOfFactor(rev)==2)
            System.out.println(num+" is Twisted Prime Number");
        else
            System.out.println(num+" is Not A Twisted Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();      
        display(num);
              
        
    }
}
