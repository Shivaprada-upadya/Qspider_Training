import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int countOfDigit=DigitCount(num);
        int exponentialSum=SumOfdigit(num,countOfDigit);
        System.out.println(num==exponentialSum? "ArmStrong Number":"Not an ArmStrong Number");
    }

    public static int DigitCount(int num)
    {
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }


    public static int expo(int base,int countOfDigit)
    {
        int expo=1;
        for(int i=1;i<=countOfDigit;i++)
        {
            expo=expo*base;
        }
        return expo;
    }

    public static int SumOfdigit(int num,int countOfDigit)
    {
        int sum=0;
        while(num>0)
        {
            int ld=num%10;
            sum=sum+expo(ld,countOfDigit);
            num/=10;
        }
        return sum;
    }
}
