//Write a Program to print the numbers in between the range
import java.util.Scanner;
public class numberRangeDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End of the Range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int i=start;  
        do    
        {
            System.out.print(i+" ");
            i++;
        }
        while(i<=end);
    }
}
