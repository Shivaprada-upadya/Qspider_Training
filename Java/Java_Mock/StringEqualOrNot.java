import java.util.Scanner;
class  StringEqualOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String str1=sc.next();
		System.out.println("Enter the 2nd String: ");
		String str2=sc.next();
		if(str1.length()!=str2.length())
		{
			System.out.println(" String are not Equal ");
			return;
		}
		int left=0;
		int right=str1.length()-1;
		
		while(left<=right)
		{
			char ch1=str1.charAt(left);
			char ch2=str2.charAt(left);
			if(ch1==ch2)
			{
				left++;
			}
			else
			{
				System.out.println(" String are not Equal ");
				return;
			}
		}
		
		System.out.println(" String are  Equal ");
		
	}
}
