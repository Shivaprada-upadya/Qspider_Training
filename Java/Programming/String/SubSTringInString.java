import java.util.Scanner;

public class SubSTringInString {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=new String(sc.nextLine());
        System.out.print("Enter the Sub string to check:");
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
