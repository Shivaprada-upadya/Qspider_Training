// Write A Program to Print the 2nd digit Of A given Number.

import java.util.Scanner;
public class Print2ndDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;
        while(num>99)
        {
            num/=10;
        }
        int secondDigit=num%10;       
        System.out.println("2nd  digit of "+number+" is: "+secondDigit);
    }
}
