
import java.util.Scanner;

public class largestDigit {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int large=0;
        while(num>0)
        {
            int ld=num%10;
            if(ld>large)
            {
                large=ld;
            }
            num/=10;
        }
        System.out.println("Largest Digit is : "+large);

    }
}
