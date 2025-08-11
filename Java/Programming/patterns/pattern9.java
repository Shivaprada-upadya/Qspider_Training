import java.util.Scanner;

public class pattern9 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=n*2-1;j++)
            {
                if(j-i>=n-1 || i+j<=n+1 || i-j>=n-1 || i+j>=3*n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
