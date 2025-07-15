import java.util.Scanner;

public class ExponentialBasePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Base Value: ");
    int base=sc.nextInt();
    System.out.println("Enter Power Value: ");
    int power=sc.nextInt();
    int expo=1;
    for(int i=1;i<=power;i++)
        expo*=base;

    System.out.println("Exponential Value of "+base+" to the "+power+" is : "+expo);
    }
}
