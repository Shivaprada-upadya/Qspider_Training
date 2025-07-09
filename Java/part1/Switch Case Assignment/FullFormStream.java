import java.util.Scanner;
public class FullFormStream {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Abbreavations: ");
       String abb=sc.next();
       switch(abb)
       {
        case "CSE": System.out.println("Computer Science Engineering");
                    break;
        case "ECE": System.out.println("Electronics and Communication Engineering");
                    break;
        case "EEE": System.out.println("Electrical And Electornics Engineering");
                    break;
        case "MECH": System.out.println("Machanical Engineering");
                    break;
        case "CIV": System.out.println("Civil Engineering");
                    break;
        case "ISE": System.out.println("Information Science Engineering");
                    break;
        default: System.out.println("Invalid Full form or Input!!!");
       }
       sc.close();
   } 
}
