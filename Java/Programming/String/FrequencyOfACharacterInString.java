import java.util.Scanner;

public class FrequencyOfACharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int freq[]=new int[arr.length];
        
        for(int i=0;i<arr.length-1;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1)
                freq[i]=count;
        }

        for (int i = 0; i < arr.length; i++) {
            if(freq[i]!=-1)
                System.out.println(arr[i]+"  repeat "+freq[i]+" times");
        }
        
    }
}
