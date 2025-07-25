import java.util.Scanner;
public class NonFibonacciSeries {
    public static void  Fibo(int num)
    {
        int a=0;
        int b=1;
        int sum=1;
        for(int i=1;i<=num;i++)
        {
            if(sum==i)
            {
                a=b;
                b=sum;
                sum=a+b;
            }
            else
            {
                System.out.print(i+ " ");
            }
        }       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Fibo(num);
    }
}
