import java.util.Scanner;
class StrongNumber
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
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        sc.close();
        int ans=digitSum(num);
        if(num==ans)
            System.out.println(num+" is a Strong Number");
        else
            System.out.println(num+" is not Strong Number");
    }
}