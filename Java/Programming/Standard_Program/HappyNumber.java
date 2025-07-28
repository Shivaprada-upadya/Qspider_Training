import java.util.Scanner;

public class HappyNumber {

    public static int sumOfSquareOfDigits(int num)
    {
        int sum=0;    
        while(num>0)
        {
            int ld=num%10;
            sum=sum+(ld*ld);
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int temp=num;
        while(num!=1 && num!=4)
        {
            num=sumOfSquareOfDigits(num);
        }

        if(num==1)
            System.out.println(temp +" is a Happy Number.");
        else
            System.out.println(temp+" is not a Happy Number.");

    }
}
