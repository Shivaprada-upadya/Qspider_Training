import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        while(num>0)
        {
            int ld=num%10;
            if(ld>largest)
                largest=ld;
            if(ld<smallest)
                smallest=ld;
            num/=10;
        }
        System.out.println("Smallest: "+smallest);
        System.out.println("Largest: "+largest);
    }
    
}
