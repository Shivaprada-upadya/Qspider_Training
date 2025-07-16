// Write a Program to check whether count of digit inna number is Even Or Odd.

import java.util.Scanner;
public class CountOfDigitInNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int originalNum=num;
        int digitCount=0;
        while(num>0)
        {
            num/=10;
            digitCount++;
        }
        System.out.println(originalNum+"'s Digit count is :"+digitCount);
        if(digitCount%2==0)
            System.out.println("Count of digit in "+originalNum+" is Even");
        else    
            System.out.println("Count of digit in "+originalNum+" is Odd");
        
    }
}
