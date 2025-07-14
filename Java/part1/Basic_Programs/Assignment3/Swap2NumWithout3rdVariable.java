// Write a Program to add two number without using 3rd variable.

import java.util.Scanner;
public class Swap2NumWithout3rdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("--------Before Swap-------");
        System.out.println("Tha value of a: "+a);
        System.out.println("Tha value of a: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("-------After Swap-------");
        System.out.println("Tha value of a: "+a);
        System.out.println("Tha value of a: "+b);



    }
}
