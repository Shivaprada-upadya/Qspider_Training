// Write a program to print the Fibonacci Series.
// Fibonacci- A Series of number of number in which every terms are the sum of previuos 2 terms
// 0 1 1 2 3 5 8 13 21 .......

import java.util.Scanner;
public class FibonacciSeries 
{
    public static void Fibnacci(int num)
    {
        if(num<=0)
        {
             System.out.println("Please enter a positive integer.");
        }
        else if(num==1)
            System.out.print(0);

        else
        {
             int first=0;
            int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=2;i<num;i++)
        {
            int third=first+second;
            first=second;
            second=third;          
            System.out.print(third+" ");
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Fibonacci Series upto "+num+" terms are: ");
        Fibnacci(num);

    }
}
