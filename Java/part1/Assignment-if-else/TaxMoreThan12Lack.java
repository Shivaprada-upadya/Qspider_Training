// Write a Program to check whether a Student is passed or nfailed in exam (>=35).

import java.util.Scanner;
public class TaxMoreThan12Lack {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter the Number: ");
        int money=sc.nextInt();
        if(money>=1200000)
        {
            System.out.println(" Pay Income Tax");
        }
        else
        {
            System.out.println("No Income Tax");
        }
    }
    
}
