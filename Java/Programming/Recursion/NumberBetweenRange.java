
import java.util.Scanner;

public class NumberBetweenRange {
    public static void range(int s,int e)
    {
        if(s<=e)
        {
            System.out.print(s+" ");
            range(s+1, e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range : start and end");
        int start=sc.nextInt();
        int end=sc.nextInt();
        range(start,end);
    }
}
