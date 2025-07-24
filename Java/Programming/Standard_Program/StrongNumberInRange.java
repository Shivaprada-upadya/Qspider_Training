import java.util.Scanner;
class StrongNumberInRange
{
    public static int Factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;

        }
        return fact;
    }

    public static int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            
            int dig=num%10;
            sum=sum+Factorial(dig); 
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Range ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.close();
        System.out.println("Strong Numbers are: ");
        for(int i=start;i<=end;i++)
        {
        int ans=digitSum(i);
        if(i==ans)
            System.out.print(i+" ");
        }
        
    }
}