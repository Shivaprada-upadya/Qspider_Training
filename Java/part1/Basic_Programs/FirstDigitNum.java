import java.util.Scanner;

public class FirstDigitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;
        int firstDigit=0;
       
        while(num>0)
        {
            firstDigit=num%10;           
            num/=10;
        }
        
        System.out.println("The Last Digit of "+number+" is : "+firstDigit);


        /*
         * while(number>9)
         *    num/=10;
         * System.out.println(number);
         */
        
    }
}
