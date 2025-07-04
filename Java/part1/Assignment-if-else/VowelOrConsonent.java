// Write a Program to check whether a Given Alphabet is Vowel Or Consonents.

import java.util.Scanner;
public class VowelOrConsonent {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter a Character (a-z or A-Z): ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| 
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
        {
            System.out.println(ch+" is Vowel");
        }
        else
        {
            System.out.println(ch+" is a Consonents");
        }       
    }   
}

