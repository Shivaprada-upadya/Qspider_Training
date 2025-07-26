import java.util.Scanner;

public class SmallestDigit {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int smallest=9;
        while(num>0)
        {
            int sd=num%10;
            if(sd<smallest)
            {
                smallest=sd;
            }
            num/=10;
        }
        System.out.println("Smallest Digit is : "+smallest);

    }
}
