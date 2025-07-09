/* Write a Program to check whther  given Alphabet is Vowel Or Consonent using Swich Case */
import java.util.Scanner;
public class VowelOrConsonentSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char alpha=sc.next().charAt(0);
        if((alpha>='A' && alpha<='Z') || (alpha>='a' && alpha<='z') )
        {
            switch(alpha)
            {
                case 'A':
                case 'a': 
                case 'E':
                case 'e':               
                case 'I':
                case 'i': 
                case 'O':
                case 'o':
                case 'U':
                case 'u': System.out.println("Vowel");
                          break;
                
                default: System.out.println("Consonent");
                          break;
            }

        }
        else{
            System.out.println("Sorry entered character is not a aplhabet");
        }
        sc.close();
    }
}
