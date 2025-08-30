import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithoutSpecialCharacter
{
     static char [] reverse(char str[])
    {
        int left=0;
        int right=str.length-1;
        while(left<right)
        {
            char leftChar=str[left];
            char rightChar=str[right];
            if(!Character.isLetterOrDigit(leftChar))
                left++;
            else if(!Character.isLetterOrDigit(rightChar))
                right--;
            else
                swap(str, left++,right--);
            
        }
        return str;
    }


     static void swap(char[] str, int left, int right) {
        char temp=str[left];
        str[left]=str[right];
        str[right]=temp;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=new String(sc.next());
        
        System.out.println(Arrays.toString(reverse(str.toCharArray())));
    }
}