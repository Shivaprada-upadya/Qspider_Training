import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("The Reverse of "+number+" is: "+rev);
    }
}
