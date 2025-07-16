import java.util.Scanner;

public class CountDigitOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;  
        int digit=0, count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println("The Count of the "+number+" Digit is: "+count);
    }
}
