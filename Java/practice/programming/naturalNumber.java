import java.util.Scanner;

public class naturalNumber {
    static int i=1;
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        naturalNum(end);
        
    }
    public static int naturalNum(int end)
    {
        
       if(end==0)
            return 0;
       else{
        System.out.println(i++);
        return naturalNum(end-1);
       } 
        
    }
}
