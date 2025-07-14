import java.util.Scanner;
class SumOfNumberInRange
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start and End Range :");
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum=0;
        // i++ or ++i both are same because there is no other oprations  
        for(int i=start;i<=end;i++) 
        {
            sum+=i;
        }
        System.out.println("The Sum of the Range is :"+sum);

    }
}