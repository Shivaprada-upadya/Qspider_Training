//Write a Program to check whether count of factor's of a Number is Even Or Odd.
import java.util.Scanner;
public class CountFactotNumberEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
            count++;
        
        if(count%2==0)
        {
            System.out.println("Count of Factors of "+num+" is Even");
        }
        else{
             System.out.println("Count of Factors of "+num+" is Odd");
        }
    }
    
}
