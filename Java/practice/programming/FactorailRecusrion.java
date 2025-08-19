import java.util.Scanner;

public class FactorailRecusrion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factNum=factorail(num);
        System.out.println(factNum);
    }

    public static int factorail(int num)
    {
        if(num==0)
            return 1;
        else if (num==1)
            return 1;
        else
            return num*factorail(num-1);
    }
}
