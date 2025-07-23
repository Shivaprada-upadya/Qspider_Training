// Write a Program to check whether the given number is Spy Number .
// Spy Number- Sum of Digits in a Number is same as Product of digits in given Number.
// 123 ->  (1+2+3=6)  (1*2*3=6)  
package Java.Programming.Standard_Program.Assignment8;

import java.util.Scanner;

public class SpyNumber {
    public static int DigitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int ld=num%10;
            sum+=ld;
            num/=10;
        }
        return sum;
    }

    public static int DigitProduct(int num)
    {
        int product=1;
        while(num>0)
        {
            int ld=num%10;
            product*=ld;
            num/=10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int DigitSum=DigitSum(num);
        int DigitProduct=DigitProduct(num);
        if(DigitSum==DigitProduct)
            System.out.println(num+" is a Spy Number.");
        else   
            System.out.println(num+" is not a Spy Number.");

    }  
}
