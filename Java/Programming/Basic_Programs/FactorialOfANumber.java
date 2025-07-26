import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ebter a Number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
