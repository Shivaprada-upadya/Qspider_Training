package Java.Programming.Standard_Program;

import java.util.Scanner;

public class PerfectNumberInRange 
{

    static int SumOfFactor(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and end of the range: ");
        int start=sc.nextInt();
       int end=sc.nextInt();
       for(int i=start;i<=end;i++)
       {
            if(i==SumOfFactor(i))
                System.out.print(i+" ");
       }
    }
        
        
    
}
