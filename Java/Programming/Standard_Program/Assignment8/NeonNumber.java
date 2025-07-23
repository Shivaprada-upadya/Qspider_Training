// Write a Program to check whether the given Number is Neon Number or not.
// Neon Number- Sum of digits of a number after Squaring is also a same Number.
// 9 ->  (9^2= 81)  ->  (8+1)==9
package Java.Programming.Standard_Program.Assignment8;

import java.util.Scanner;

public class NeonNumber {
    public static int SumOfDigit(int SquareNum)
    {
        int sum=0;
        while(SquareNum>0)
        {
            int ld=SquareNum%10;
            sum=sum+ld;
            SquareNum/=10;
        }
        return sum;
    }

    public static int SquareNum(int num)
    {
        int SquareNum=num*num;
        return SquareNum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int SquareNum=SquareNum(num);
        if(num==SumOfDigit(SquareNum))
            System.out.println(num+" is a Neon Number");
        else
            System.out.println(num+" is not a Neon Number");
    }
}
