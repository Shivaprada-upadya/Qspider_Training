import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int lastDigit=num%10;
        System.out.println("The Last Digit of "+num+" is : "+lastDigit);
    }
    
}
