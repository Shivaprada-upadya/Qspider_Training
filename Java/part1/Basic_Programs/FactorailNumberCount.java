import java.util.Scanner;
public class FactorailNumberCount {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ebter a Number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println("FActorial of NUmber's count is: "+count);
        
    }
    
}




