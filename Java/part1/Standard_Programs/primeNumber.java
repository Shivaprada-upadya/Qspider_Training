import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count=1;
                break;
            }
        }

        if(count==1)
        {
            System.out.println(num +" not  a Prime Number");
        }
        else
    
        {
            System.out.println(num +" Prime Number");
        }
    }
}
