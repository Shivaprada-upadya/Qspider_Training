//Write a Program to print the numbers in between the range
import java.util.Scanner;
public class numsRangeForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End of the Range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            System.out.print(i+" ");
        }
    }
}
