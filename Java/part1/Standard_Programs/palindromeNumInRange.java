// Write a Program print the  Panlindrome in the range.

import java.util.Scanner;
public class palindromeNumInRange 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Start and end range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();      
        for(int i=start;i<=end;i++)
        {
            int rev=0;
            int temp=i;
            while(temp>0)
            {
                int ld=temp%10;
                rev=rev*10+ld;
                temp/=10;
            }
            if(rev==i)
            {
                System.out.print(i+" "); 
            }
       
    }
    }
}

