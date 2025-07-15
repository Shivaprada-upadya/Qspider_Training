// Write a PRogram to check whether the Su of Numbers in range is Even Or Odd.

import java.util.Scanner;
public class SumOfNumInRangeEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End Range :");
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum=0;
         for(int i=start;i<=end;i++) 
        {
            sum+=i;
        }
        if(sum%2==0)
        {
            System.out.println("The Sum of the Range :"+sum+" is Even");
        }
        else
        {
            System.out.println("The Sum of the Range :"+sum+" is Odd");
        }
        

    }
}
