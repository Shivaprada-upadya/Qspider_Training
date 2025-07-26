//package Java.Programming.Standard_Program.Assignment9;

import java.util.Scanner;

public class DisariumNumber {
    public static int CountOfDigit(int num)
    {
        int countOfDigit=0;
        while(num>0)
        {
            num/=10;
            countOfDigit++;
        }
        return countOfDigit;
    }
    public static int exponential(int base,int power)
    {
        int expo=1;
        for(int i=1;i<=power;i++)
        {
            expo=expo*base;
        }
        return expo;
    }

    public static int SumOfDigit(int num)
    {
        int countOfDigit=CountOfDigit(num);
        int sum=0;
        while(num>0)
        {
            int lastDigit=num%10;
            sum=sum+exponential(lastDigit,countOfDigit--);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        if(SumOfDigit(num)==num)
            System.out.println(num+" is Disarium Number.");
        else
            System.out.println(num+" is not a Disarium NUmber.");
        
    }
}
