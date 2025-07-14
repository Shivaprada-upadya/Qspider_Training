
// Write a Program to print the Product of Numbers in between the range.

import java.util.Scanner;
public class ProductOfNumbersInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End Range :");
        int start=sc.nextInt();
        int end =sc.nextInt();
        sc.close();
        long product=1;
        int i=start;
         for( i=start;i<=end;i++) 
        {       
                if(product>Integer.MAX_VALUE/i)
                 {   
                    System.out.println("Integer Value Range Extended: "+Integer.MAX_VALUE);
                    break;
                 } 
                 product*=i;    
        }             
            System.out.println("The Product of Numbers in the Range : "+start+" - "+i+" is : "+product);
   }
}
