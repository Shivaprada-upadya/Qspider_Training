// Write a program to check whether the given number is Perfect Number or not.
// Perfect Number- Sum of FActor of the Given Number is also Same Number (Excluding the same number)
package Java.Programming.Standard_Program;
import java.util.Scanner;
public class PerfectNumber
 {
    static int SumOfFactor(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        if(num==SumOfFactor(num))
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
}
}
