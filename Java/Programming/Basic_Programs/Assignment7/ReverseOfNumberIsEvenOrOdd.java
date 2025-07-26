// Write a Program to check the Reverse Of a Number is Even Or Odd.

import java.util.Scanner;

public class ReverseOfNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int  originalNum=num;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("Reverse of Number "+originalNum+" is: "+rev);
        if(rev%2==0)
        {
            System.out.println(rev+" is an Even Number");
        }
        else{
            System.out.println(rev+" is an Odd Number");
        }
    }
}
