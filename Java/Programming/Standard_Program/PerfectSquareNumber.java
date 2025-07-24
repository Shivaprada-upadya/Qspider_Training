// Write a Program to check whether the given number is Perfect Square Number or not.
// Perfect Square Number - If a Number is a square of another Integer than the Number is Perfect Square Number.
// Ex:- 1,4,9,16,25,36,49,64,81,100.
import java.util.Scanner;
public class PerfectSquareNumber {
    public static boolean SquareNum(int num)
    {       
        for(int i=1;i<num;i++)
        {
            if(num==i*i)
                return true;
        }
        return false;           
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(SquareNum(num))
            System.out.println(num+" is a Perfect Square Number");
        else
            System.out.println(num+" is not a Perfect Number");
    }
}
