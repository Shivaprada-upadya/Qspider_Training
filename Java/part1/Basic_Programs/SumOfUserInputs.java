// 

import java.util.Scanner;

public class SumOfUserInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Numbers to add: ");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("Enter the Value: ");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            sum=sum+num;
        }
        
        System.out.println("Final sum is :"+sum);
    }
}
