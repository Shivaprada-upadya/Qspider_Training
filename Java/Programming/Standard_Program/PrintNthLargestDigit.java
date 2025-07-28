import java.util.Scanner;

public class PrintNthLargestDigit{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Enter nth digit:");
        int nth=sc.nextInt();
        int slno=0;
        int nthlarge=9;
        int temp=num;
        while(true)
        { 
            int large=0; 
            num=temp;       
            while(num>0)
            {
                int ld=num%10;
                if(ld>large && ld<nthlarge)
                {
                    large=ld;
                }
                num/=10;
            }
            slno++;
            nthlarge=large;

            if(slno==nth)
            break;
        }
        System.out.println("Largest Digit is: "+nthlarge);
        
    }
}
