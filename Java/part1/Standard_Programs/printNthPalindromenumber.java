import java.util.Scanner;
public class printNthPalindromenumber {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Nth Palindrome Number: ");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        int rev=0;
        while(n!=count)
        {
            rev=0;
            int temp=i;
            while(temp>0)
            {
                int ld=temp%10;
                rev=rev*10+ld;
                temp/=10;
            }
            if(rev==i)
            {
                 count++;
            }
             i++;
       
        }
        
        System.out.println(n+"th Palindrome Number is: "+rev);


    }
}





