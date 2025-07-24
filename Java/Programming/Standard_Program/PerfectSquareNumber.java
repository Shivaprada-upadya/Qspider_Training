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
