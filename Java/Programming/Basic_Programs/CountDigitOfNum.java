import java.util.Scanner;

public class CountDigitOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int number=num;  
         int count=0;
         
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println("The Count of the "+number+"'s Digit is: "+count);
        /*   
            int i;
            for( i=0;num>0;i++)
            {
                num/=10;
            }          
        System.out.println("The Count of the "+number+" Digit is: "+i);
        */
        /* 
        do {
            num/=10;
            count++;
        }
        while(num>0);
        System.out.println("The Count of the "+number+" Digit is: "+count);*/
      
    }
}
