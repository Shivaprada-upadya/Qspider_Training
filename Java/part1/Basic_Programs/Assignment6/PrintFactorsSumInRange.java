// Write a Program to Print the Factor's of Summation of Numbers in Between the range.

import java.util.Scanner;
public class PrintFactorsSumInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End Of the Range:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        //Sum - Between the Range
        for(int i=start;i<=end;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of the Range Between "+start+" - "+end+" is: "+sum);
        int fact=sum;
        System.out.println("Factor's of the Number "+fact+" is: ");
        for(int i=1;i<=fact;i++)
        {
            if(fact%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
