// Write a Program to check whether given number is a Panlindrome or Not.

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(temp>0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        if(num==rev)
            System.out.println(num+" is Palindrome"); 
        else
            System.out.println(num+" is not a palindrome");       
    }
}
