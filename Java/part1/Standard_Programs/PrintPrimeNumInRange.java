// Write a Program to Print the Prime Numbers In the Range.

import java.util.Scanner;

class PrintPrimeNumInRange
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a start - end range:  ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.close();
        int count;
        for(int i=start;i<=end;i++)
        {
            count=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count=1;
                    break;
                }
        }

            if(count==0 && i!=1)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
