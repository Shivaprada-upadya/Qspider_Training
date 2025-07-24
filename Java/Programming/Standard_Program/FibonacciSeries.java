import java.util.Scanner;

public class FibonacciSeries 
{
    public static void Fibnacci(int num)
    {
        if(num==0)
        {
            System.out.println(0);
        }
        else if(num==1)
        {
            for(int i=0;i<=num;i++)
            {
                System.out.print(i);
            }
        }
        else
        {
             int first=0;
            int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=2;i<num;i++)
        {
            int third=first+second;
            first=second;
            second=third;          
            System.out.print(third+" ");
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Fibonacci Series upto "+num+" terms are: ");
        Fibnacci(num);

    }
}
