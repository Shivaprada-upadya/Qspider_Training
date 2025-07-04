// Write a Program to check whether a person is eligible for voting or not.

import java.util.Scanner;
class Vote
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter a age: ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not Eligible for Vote");
        }
    }
}