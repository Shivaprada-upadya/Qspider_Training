import java.util.Scanner;

public class pattern10 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=n*2-1;j++)
            {
                if((i<=j  && i+j<=n*2) || (i+j>n*2 && i>=j))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
