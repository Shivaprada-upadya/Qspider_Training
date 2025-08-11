import java.util.Scanner;

public class pattern6 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j && i+j<=2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
