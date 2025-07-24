import java.util.Scanner;

public class AutoMorphicNumber2 {
    public static boolean isAutoMorphic(int num)
    {
        int sq=num*num;
        while(num>0)
        {
            int numLD=num%10;
            int sqLD=num%10;
            if(numLD!=numLD)
                return false;
            
            num/=10;
            sq/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        if(isAutoMorphic(num)==true)
         {
            System.out.println(num+" is a Automorphic Number");
        }
        else{
            System.out.println(num+" is not Automorphic Number");
        }
    }
}
