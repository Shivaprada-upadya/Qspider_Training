
import java.util.Scanner;

class AutomorphicNumber
{
    public static int CountOfDigits(int num)
    {
        int count=0;
        while(num>0)
        {           
            num/=10;
            count++;
        }
        return count;
    }
    public static int  Exponential(int base,int count)
    {
        int expo=1;
        for(int i=1;i<=count;i++)
        {
            expo*=base;
        }
        return expo;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int square=num*num;
        int countDig=CountOfDigits(num);
        int expo=Exponential(10,countDig);
        if(square%expo==num)
        {
            System.out.println(num+" is a Automorphic Number");
        }
        else{
            System.out.println(num+" is not Automorphic Number");
        }

    }
}