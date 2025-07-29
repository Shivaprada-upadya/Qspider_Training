import java.util.Scanner;

public class SumOfRange {
    public static int sum(int s,int e)
    {
        if(s>e)
        {
            return 0;
        }
        else
        {
        return s+sum(s+1,e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Sum of the Range is: "+sum(start,end));
    }
}
