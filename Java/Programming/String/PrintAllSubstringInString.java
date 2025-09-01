import java.util.Scanner;

public class PrintAllSubstringInString {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.next());
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
                System.out.println(str.substring(i,j+1));
        }
    }
} 
