import java.util.Scanner;

public class MagicNumber {

    public static int sumOfDigits(int num)
    {
        int sum=0;
        
        while(num>0)
        {
            int ld=num%10;
            sum=sum+ld;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int temp=num;
        while(num>9)
        {
            num=sumOfDigits(num);
        }

        if(num==1)
            System.out.println(temp +" is a Magic Number.");
        else
            System.out.println(temp+" is not a Magic Number.");

        
    }
}
