// Write A Program to Print the 2nd digit Of A given Number.

import java.util.Scanner;
public class Print2ndDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int Digit=(num%100)/10;       
        System.out.println("2nd Last digit of "+num+" is: "+lastDigit);
    }
}
