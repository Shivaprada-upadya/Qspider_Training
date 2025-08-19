//import java.util.Scanner;

public class PrimePalindrome {

    public static boolean Prime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        return count==2;
    }

    public static boolean Palindrome(int num)
    {
        int temp=num;
        int rev=0;
        
        while(temp>0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        // System.out.println(temp);
        return num==rev;

    }


    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        for(int i=1;i<=1000;i++)
        {
            if(Prime(i) && Palindrome(i))
                System.out.print(i+ " ");
        }
    }
}
