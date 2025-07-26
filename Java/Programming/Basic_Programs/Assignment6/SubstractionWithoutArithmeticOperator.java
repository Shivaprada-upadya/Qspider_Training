// Write a Program to Perform SunStraction Without Arithmetic Operator.

import java.util.Scanner;
public class SubstractionWithoutArithmeticOperator {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two Value of a Number: ");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       while(num2!=0)
       {
        num1--;
        num2--;
       }
       System.out.println("Substraction of given Number is: "+num1);

       /*  for(int i=1;i<=num2;i++)
            {
                num2--;
            }
                System.out.println(num2);
        */
   } 
}
