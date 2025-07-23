
import java.util.Scanner;
public class Calculator {
    
    static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    static int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }

    static int mul(int a,int b)
    {
        int mul=a*b;
        return mul;
    }

    static double div(int a,int b)
    {
        int div=a/b;
        return div;
    }

    static int mod(int a,int b)
    {
        int mod=a%b;
        return mod;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Arithmetic Opearation: \n 1- Addition \n 2- Substraction \n 3- Multiplication \n 4- Division \n 5- modulus \n 6-Exit");
          System.out.println("Enter operation number for operation: ");
        int num=sc.nextInt();
       
       
        while(num!=6)
        {
            System.out.println("Enter the Value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        switch(num)
        {
            case 1:
                        System.out.println("Addition of "+a+" + "+b+" is: "+add(a,b));
                        break; 
            case 2:   
                        System.out.println("Substaction of "+a+" - "+b+" is: "+sub(a,b));
                        break;
            
            case 3:   System.out.println(mul(a,b));
                    break;

            case 4:     System.out.println(div(a,b));
            break;


            case 5 : System.out.println(mod(a,b));
            break;
        }
        System.out.println("Enter a Arithmetic Opearation: \n 1- Addition \n 2- Substraction \n 3- Multiplication \n 4- Division \n 5- modulus \n 6-Exit");
        System.out.println("Enter the opearation number:");
        num=sc.nextInt();
        
    }
        
        
          
        
    }
}