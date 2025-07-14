// Write a Program to Swap Two Number Using Third Varibale

import java.util.Scanner;

public class SwapTwoNumWithThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("------Before Swapping------");
        System.out.println("The Value of a="+a);
        System.out.println("The Value of b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("------After Swapping------");
        System.out.println("The Value of a="+a);
        System.out.println("The Value of b="+b);

    }
    
}
