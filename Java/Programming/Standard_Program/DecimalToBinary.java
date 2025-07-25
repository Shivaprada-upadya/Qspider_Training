import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String bin="";
        while(num>0)
        {
            int rem=num%2;
            bin=rem+bin;
            num=num/2;
        }
        System.out.println(bin);
    }
}
