import java.util.Scanner;

public class XylemOrPhloem {
    public static int firstDigit(int num)
    {
        while(num>9)
        {
            num/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int temp=num;
        int lastDigit=temp%10;
        int firstDigit=firstDigit(num);
        int  value1=firstDigit+lastDigit;
        temp/=10;
        int meanSum=0;
        while(temp>9)
        {
            int ld=temp%10;
            meanSum=meanSum+ld;
            temp/=10;
        }
        if(value1==meanSum)
        {
            System.out.println("Xylem Number");
        }
        else{
            System.out.println("Phloem Number");
        }        
    }
}
