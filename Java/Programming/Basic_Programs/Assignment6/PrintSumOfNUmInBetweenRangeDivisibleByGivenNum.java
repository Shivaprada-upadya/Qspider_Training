// Write a Program to Print the Sum of Numbers in Between the Range which are divisible by the given number.

import java.util.Scanner;
public class PrintSumOfNUmInBetweenRangeDivisibleByGivenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        System.out.println("Enter the Start and End of the Range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(i%num==0)
                sum+=i;
        }
        System.out.println("The sum of range is: "+sum);
    }
}
