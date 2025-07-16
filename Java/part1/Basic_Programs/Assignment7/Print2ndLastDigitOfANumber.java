// Write a Program to Print the 2nd Last digit in a given Number.

import java.util.Scanner;
public class Print2ndLastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int lastDigit=(num%100)/10;       
        System.out.println("2nd Last digit of "+num+" is: "+lastDigit);
    }
}
