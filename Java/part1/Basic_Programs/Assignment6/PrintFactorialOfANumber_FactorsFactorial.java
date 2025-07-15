// Write a Program to print a factorial of a Number & Also Print Factor's of the Factorial.

import java.util.Scanner;

public class PrintFactorialOfANumber_FactorsFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);
        System.out.print("Factor's of "+fact+" is: ");
        for(int i=1;i<=fact;i++)
        {
            if(fact%i==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
