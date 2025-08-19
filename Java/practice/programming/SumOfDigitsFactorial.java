import java.util.Scanner;

public class SumOfDigitsFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=SumOfDigit(num);
        System.out.println(ans);
    }

    public static int SumOfDigit(int num)
    {
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int ld=temp%10;
            sum=sum+factorial(ld);
            temp/=10;
        }
        return sum;
    }

    public static int factorial(int num)
    {
        if(num==0 || num==1)
            return 1;
        else    
            return num*factorial(num-1);
    }
}
