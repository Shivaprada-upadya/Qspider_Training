
import java.util.Scanner;

public class NthLargestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Enter Nth Number: ");
        int nth=sc.nextInt();
        int nthlarge=Integer.MAX_VALUE;
        int slno=0;
        while (true) 
        {
            int large=0;
            int temp=num;
            while(temp>0)
            {
                int ld=temp%10;
                if(ld>large && ld<nthlarge)
                {
                    large=ld;
                }
                temp/=10;
            } 
            nthlarge=large;
            slno++;
            if(nth==slno)
            {
                break;
            }
        }
        System.out.println("Nth LArgest Digit is: "+nthlarge);
    }
}
