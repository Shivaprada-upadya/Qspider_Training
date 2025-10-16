public class StringPalindrome {

    public static boolean Palindrome(String str)
    {
        int left=0,right=str.length()-1;
        while(left<=right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }


        return true;
    }


    public static void main(String[] args)
    {
        String str="level";

        if(Palindrome(str))
            System.out.println("Palindrome");  
        else 
            System.out.println("Not a Palindrome");         

        
    }
}
