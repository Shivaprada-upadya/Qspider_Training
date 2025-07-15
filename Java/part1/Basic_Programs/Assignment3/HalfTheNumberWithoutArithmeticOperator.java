// Write a Program to Half the Number Without Using Arithmetic Operator.

import java.util.Scanner;
public class HalfTheNumberWithoutArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Value to half the number: ");
        int num=sc.nextInt();
        int halfNum=num>>1;
        
        System.out.println("Half the value of "+num+" is : "+halfNum);
        /* 
        int b=0;
        while(num!=b)
        {
            num--;
            b++;
        }
        System.out.println(num);
        */
    }
}
