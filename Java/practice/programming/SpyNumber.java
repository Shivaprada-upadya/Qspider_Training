import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sumOfDigit=Sum(num);
        int product=product(num);
        System.out.println(sumOfDigit==product?"Spy Number":"Not a Spy Number");
    }

    public static int Sum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int ld=num%10;
            sum+=ld;
            num/=10;
        }
        return sum;
    }

    public static int product(int num)
    {
        int product=1;
        while(num>0)
        {
            int ld=num%10;
            product*=ld;
            num/=10;
        }
        return product;
    }
}
