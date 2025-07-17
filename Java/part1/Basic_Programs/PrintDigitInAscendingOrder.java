import java.util.Scanner;

public class PrintDigitInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int sort=0;
        for(int i=0;i<=9;i++)
        {
            int temp=num;
            while(temp>0)
            {
                int digit=temp%10;
                if(i==digit)
                {
                    sort=sort*10+digit;
                }
                temp/=10;
            }
        }   
        System.out.println(sort);
    }
}
