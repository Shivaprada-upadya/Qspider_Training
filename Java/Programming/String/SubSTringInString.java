import java.util.Scanner;

public class SubSTringInString {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.nextLine());
        String subStr=new String(sc.nextLine());
        boolean isPresent=false;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(subStr.equals(str.substring(i,j+1)))
                {
                    System.out.println("Present");
                    isPresent=true;
                    break;
                }
            }
            if(!isPresent)
                break;
                
        }
    }
}
