// Write a Program to print the Sum of Even Numbers in Between the Range.

import java.util.Scanner;
public class SumOfEvenNumbersInRange {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End Range :");
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum=0;
         for(int i=start;i<=end;i++) 
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }             
            System.out.println("The Sum of Even Numbers in the Range : "+sum);
    }    
}




   