// Write a Program to Double the Number without using Arithmetic

import java.util.Scanner;
public class DoubleTheNumberWithoutArithmetic {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to Double the Number: ");
        int num=sc.nextInt();
        int doubleNum= num<<1;
        System.out.println("Double the value of "+num+" is : "+doubleNum);

    }
}
