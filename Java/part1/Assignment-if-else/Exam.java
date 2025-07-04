// Write a Program to check whether a Student is passed or nfailed in exam (>=35).

import java.util.Scanner;
class Exam
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter the Marks: ");
        int mark=sc.nextInt();
        if(mark>=35)
        {
            System.out.println("Student is Passed");
        }
        else
        {
            System.out.println("Student is Failed");
        }
    }
}