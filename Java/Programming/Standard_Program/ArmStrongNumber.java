import java.util.Scanner;

public class ArmStrongNumber {
    public static int DigitOfCount(int num)
    {
        int DigitCount=0;
        while(num>0)
        {
            DigitCount++;
            num/=10;
        }
        return DigitCount;
    }

    public static int exponential(int base,int power)
    {
        int expo=1;
        for(int i=1;i<=power;i++)
        {
            expo=expo*base;
        }
        return expo;
    }

    public static int SumOfDigits(int num)
    {
        int CountDigit=DigitOfCount(num);
        int sum=0;
        while(num>0)
        {
            int ld=num%10;
            sum=sum+exponential(ld,CountDigit);
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
      //  for(int i=1;i<=10000;i++)
      //  {
        int answer=SumOfDigits(num);
        if(num==answer)
            System.out.println(num+" is an Arm Strong Number");
        
    }
}


