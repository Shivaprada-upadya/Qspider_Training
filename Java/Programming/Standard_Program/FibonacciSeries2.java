import java.util.Scanner;

public class FibonacciSeries2 {
    public static void Fibo(int num)
    {
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            System.out.print(sum+ " ");
            a=b;
            b=sum;
            sum=a+b;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Fibo(num);
    }
}
