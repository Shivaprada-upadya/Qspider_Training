// Write a Program to check whether a Student is passed or nfailed in exam (>=35).

import java.util.Scanner;
public class DivisibleBy6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is Divible by 6");
        }
        else
        {
            System.out.println(num+" is Not Divisible by 6");
        }
    }
    
}


