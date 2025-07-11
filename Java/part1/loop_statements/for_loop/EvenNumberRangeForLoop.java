// Write A Program to Even Number Between The Range. (For Loop)

import java.util.Scanner;
public class EvenNumberRangeForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End of the Range");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
                System.out.println(i+" ");
        }
    }
}
