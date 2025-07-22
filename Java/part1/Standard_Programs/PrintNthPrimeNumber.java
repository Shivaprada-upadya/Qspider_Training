import java.util.Scanner;

public class PrintNthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth value:  ");
        int nth=sc.nextInt();
        int count;
        sc.close();
        int num=1;
        int slno=0;
        while(true)
        {
            count=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }

            if(count==2)
            {
                slno++;
            }
            if(slno==nth)
            {
                System.out.println(nth+" th prime number is: "+num);
                break;
            }
            num++;

        }
    }
}
