import java.util.Scanner;

public class FirstDigitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;
        int firstDigit=0;
        int rev=0;
        while(num>0)
        {
            firstDigit=num%10;
            //rev=rev*10+firstDigit;
            num/=10;
        }
        
        System.out.println("The Last Digit of "+number+" is : "+firstDigit);
        //System.out.println(rev);
    }
}
