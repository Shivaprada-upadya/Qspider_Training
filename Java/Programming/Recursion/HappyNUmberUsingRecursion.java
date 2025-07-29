import java.util.Scanner;

class HappyNUmberUsingRecursion{
    public static int sum(int num)
    {
        int sum=0;    
        while(num>0)
        {
            int ld=num%10;
            sum=sum+(ld*ld);
            num/=10;
        }
        return sum;
    }

    public static boolean isHappy(int num)
    {
        if(num==1)
            return true;
        else if(num==4)
                return false;
        else
            return isHappy(sum(num))  ; 
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int temp=num;
        if(isHappy(num))
            System.out.println(temp+" is Happy Number");
        else
            System.out.println(temp+" is not a Happy number");

    }
}